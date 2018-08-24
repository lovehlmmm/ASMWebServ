package model;

import java.io.Serializable;

/**
 *
 * @author Bui Oanh
 */
public class LoginRes implements Serializable {

    private static final long serialVersionUID = 1L;

    private String status;
    private String errCode;
    private String errMsg;
    private String token;
    private Accountbank accountBank;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Accountbank getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(Accountbank accountBank) {
        this.accountBank = accountBank;
    }

}
