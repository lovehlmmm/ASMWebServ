package servlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import service.AccountBankWebService_Service;
import service.LoginRes;
import service.ParseException_Exception;
import service.Transactiondetails;

/**
 *
 * @author Lonely
 */
public class NhatKySevlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/BankService/AccountBankWebService.wsdl")
    private AccountBankWebService_Service service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String accID = request.getParameter("accID");
            String password = request.getParameter("password");
            String beginDate = request.getParameter("beginDate");
            String endDate = request.getParameter("endDate");
            LoginRes L1 = login(accID, password);
            List<Transactiondetails> list = hisTrans(accID, beginDate, endDate);
            if (L1 != null) {
                request.setAttribute("message", L1.getStatus());
                request.setAttribute("items", this.hisTrans(accID, beginDate, endDate));
                request.getRequestDispatcher("nhatky.jsp").forward(request, response);
            } else {
                request.setAttribute("message", L1.getErrMsg());
                request.getRequestDispatcher("nhatky.jsp").forward(request, response);
            }
        } catch (ParseException_Exception ex) {
            Logger.getLogger(NhatKySevlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private LoginRes login(java.lang.String accID, java.lang.String password) {
        service.AccountBankWebService port = service.getAccountBankWebServicePort();
        return port.login(accID, password);
    }

    private java.util.List<service.Transactiondetails> hisTrans(java.lang.String accID, java.lang.String beginDate, java.lang.String endDate) throws ParseException_Exception {
        service.AccountBankWebService port = service.getAccountBankWebServicePort();
        return port.hisTrans(accID, beginDate, endDate);
    }

}
