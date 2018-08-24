package service;

import dao.*;
import java.text.*;
import java.util.*;
import java.util.logging.*;
import javax.jws.*;
import model.*;
import static model.RadomString.randomString;
import org.hibernate.Session;
import util.NewHibernateUtil;

/**
 *
 * @author Lonely
 */
@WebService(serviceName = "AccountBankWebService")
public class AccountBankWebService {

    @WebMethod(operationName = "login")
    public LoginRes login(@WebParam(name = "accID") String accID, @WebParam(name = "password") String password) {
        LoginRes loginRes = new LoginRes();
        AccountBankDao dao = new AccountBankDao();
        boolean p = dao.login(accID, password);
        if (p) {
            //Token này mỗi lần login mới sẽ lưu vào database một token mới nhưng bài này tôi chưa sử dụng đến nó
            String token = accID + Calendar.getInstance().getTimeInMillis();
            // Save token vao db
            dao.updateToken(accID, token);
            // Tao res
            loginRes.setStatus("Login thành công");
            loginRes.setToken(token);
        } else {
            loginRes.setStatus("Kiểm tra lại mật khẩu or ID người dùng");
            loginRes.setErrCode("001");
            loginRes.setErrMsg(" Login thất bại");
        }
        return loginRes;
    }

    /**
     * Web service operation
     *
     * @param accID
     * @param accIDReceive
     * @param transName
     * @param transMoney
     * @param postage
     * @return
     */
    @WebMethod(operationName = "addTrans")
    public LoginRes addTrans(@WebParam(name = "accID") String accID, @WebParam(name = "accIDReceive") String accIDReceive, @WebParam(name = "transName") String transName, @WebParam(name = "transMoney") float transMoney, @WebParam(name = "postage") String postage) {
        LoginRes loginRes = new LoginRes();
        TransactiondetailsDao transDao = new TransactiondetailsDao();
        AccountBankDao accDao = new AccountBankDao();
        Accountbank a1 = accDao.findByAccID(accID);
        Accountbank a2 = accDao.findByAccID(accIDReceive);
        String transID = randomString(6);
        Date date = new Date();
        float transPostage = 0, transMoney1 = 0, balance1 = 0, balance2 = 0;
        //transPostage tiền phí
        //transMoney tiền giao dịch và tính phí
        //balance tiền dư
        //========Validate tien trong TK=======//
        if (a1.getBalance() < Postage(transMoney) + transMoney) {
            loginRes.setStatus("Bạn không đủ tiền để giao dịch");
            loginRes.setErrCode("Lỗi 004 ");
            loginRes.setErrMsg("Kiểm tra lại tiền mặt trong tài khoản");
            return loginRes;
        }

        //========Tính phí và tính các loại tiền======//
        if (postage.equalsIgnoreCase("phi_bengui")) {
            transPostage = Postage(transMoney); //Tiền phí
            transMoney1 = transMoney + transPostage; //Tiền GD = Tiền đơn hàng + phí
            balance1 = a1.getBalance() - transMoney1; //Tiền dư 1 =  Tiền trong tk - tiền hàng và phí
            balance2 = a2.getBalance() + transMoney; //Tiền dư 2= Tiền trong tk + tiền đơn hàng
        } else {
            transMoney1 = transMoney; //Tiền GD = Tiền đơn hàng
            balance1 = a1.getBalance() - transMoney1; //Tiền dư 1 =  Tiền trong tk - tiền hàng và phí
            balance2 = a2.getBalance() - Postage(transMoney) + transMoney; //Tiền dư 2= Tiền trong tk - phí+ tiền đơn hàng
        }
        //============Thực hiện thêm nhật ký và sửa tiền dư=============//
        Session session = NewHibernateUtil.getSessionAndBeginTransaction();
        //Ben gui   
        boolean b1 = transDao.insertTrans(session, transID, accID, accIDReceive, transName, transMoney1, transPostage, date);
        //update Accountbank Ben gui 
        boolean c1 = accDao.updateMoney(session, accID, balance1);
        //update Accountbank Ben nhan
        boolean c2 = accDao.updateMoney(session, accIDReceive, balance2);
        //Ở đây chúng ta tạo mới session và commit + close là có ý đồ rằng thực hiện rollback sẽ trả lại ban đầu nếu
        //Nếu một trong (b1,c1,c2) mà bị lỗi thì tất cả sẽ không được thực hiện đưa dữ liệu mới vào database. 
        try {
            NewHibernateUtil.commitCurrentSessions();
            NewHibernateUtil.closeCurrentSessions();
        } catch (Exception ex) {
            Logger.getLogger(TransactiondetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //============Tạo Res thông báo=============//
        if (!b1) {
            loginRes.setErrCode("Lỗi 002 ");
            loginRes.setErrMsg("Insert Transaction");
            return loginRes;
        }

        if (!c1) {
            loginRes.setErrCode("Lỗi 005 ");
            loginRes.setErrMsg("Update money tài khoản người gửi");
            return loginRes;
        }
        if (!c2) {
            loginRes.setErrCode("Lỗi 006 ");
            loginRes.setErrMsg("Update money tài khoản người nhận");
            return loginRes;
        }
        if (b1 && c1 && c2) {
            loginRes.setStatus("Giao Dịch Thành Công!");
        }
        return loginRes;
    }

    //Cong thuc tinh phi
    public Float Postage(Float transMoney) {
        if (transMoney < 100000f) {
            return 10000f;
        } else if (100000f < transMoney || transMoney <= 500000f) {
            return transMoney * 0.02f;
        } else if (500000f < transMoney || transMoney <= 1000000f) {
            return transMoney * 0.015f;
        } else if (1000000f < transMoney || transMoney <= 5000000f) {
            return transMoney * 0.01f;
        } else {
            return transMoney * 0.005f;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "HisTrans")
    public List<Transactiondetails> HisTrans(
            @WebParam(name = "accID") String accID,
            @WebParam(name = "beginDate") String beginDate,
            @WebParam(name = "endDate") String endDate) throws ParseException {

        TransactiondetailsDao dao = new TransactiondetailsDao();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        return dao.findByDate(accID, formatDate.parse(beginDate), formatDate.parse(endDate));
    }

}
