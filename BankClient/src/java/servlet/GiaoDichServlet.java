package servlet;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import service.AccountBankWebService_Service;
import service.LoginRes;

/**
 *
 * @author Lonely
 */
public class GiaoDichServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/BankService/AccountBankWebService.wsdl")
    private AccountBankWebService_Service service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accID = request.getParameter("accID");
        String password = request.getParameter("password");
        LoginRes L1 = login(accID, password);

        String accIDReceive = request.getParameter("accIDReceive");
        String transName = request.getParameter("transName");
        float transMoney = Float.parseFloat(request.getParameter("transMoney"));
        String transPostageString = request.getParameter("transPostage");

        if (L1.getErrCode() != null) {
            request.setAttribute("message", L1.getStatus()+L1.getErrMsg());
            request.getRequestDispatcher("giaodich.jsp").forward(request, response);
        } else {
            LoginRes L2 = addTrans(accID, accIDReceive, transName, transMoney, transPostageString);
            request.setAttribute("message", L2.getStatus());
            if (L2.getErrCode() != null || L2.getErrMsg() != null) {
                request.setAttribute("message", L1.getErrCode() + L1.getErrMsg());
            }
            if (L2.getErrCode() != null || L2.getErrMsg() != null) {
                request.setAttribute("message", L2.getErrCode() + L2.getErrMsg());
            }
            request.getRequestDispatcher("giaodich.jsp").forward(request, response);
        }

    }

    private LoginRes login(java.lang.String accID, java.lang.String password) {
        service.AccountBankWebService port = service.getAccountBankWebServicePort();
        return port.login(accID, password);
    }

    private LoginRes addTrans(java.lang.String accID, java.lang.String accIDReceive, java.lang.String transName, float transMoney, java.lang.String postage) {
        service.AccountBankWebService port = service.getAccountBankWebServicePort();
        return port.addTrans(accID, accIDReceive, transName, transMoney, postage);
    }

}
