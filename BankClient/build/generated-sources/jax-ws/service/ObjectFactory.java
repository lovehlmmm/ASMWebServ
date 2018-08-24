
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HisTrans_QNAME = new QName("http://service/", "HisTrans");
    private final static QName _HisTransResponse_QNAME = new QName("http://service/", "HisTransResponse");
    private final static QName _ParseException_QNAME = new QName("http://service/", "ParseException");
    private final static QName _Postage_QNAME = new QName("http://service/", "Postage");
    private final static QName _PostageResponse_QNAME = new QName("http://service/", "PostageResponse");
    private final static QName _Accountbank_QNAME = new QName("http://service/", "accountbank");
    private final static QName _AddTrans_QNAME = new QName("http://service/", "addTrans");
    private final static QName _AddTransResponse_QNAME = new QName("http://service/", "addTransResponse");
    private final static QName _Login_QNAME = new QName("http://service/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://service/", "loginResponse");
    private final static QName _Transactiondetails_QNAME = new QName("http://service/", "transactiondetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HisTrans }
     * 
     */
    public HisTrans createHisTrans() {
        return new HisTrans();
    }

    /**
     * Create an instance of {@link HisTransResponse }
     * 
     */
    public HisTransResponse createHisTransResponse() {
        return new HisTransResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link Postage }
     * 
     */
    public Postage createPostage() {
        return new Postage();
    }

    /**
     * Create an instance of {@link PostageResponse }
     * 
     */
    public PostageResponse createPostageResponse() {
        return new PostageResponse();
    }

    /**
     * Create an instance of {@link Accountbank }
     * 
     */
    public Accountbank createAccountbank() {
        return new Accountbank();
    }

    /**
     * Create an instance of {@link AddTrans }
     * 
     */
    public AddTrans createAddTrans() {
        return new AddTrans();
    }

    /**
     * Create an instance of {@link AddTransResponse }
     * 
     */
    public AddTransResponse createAddTransResponse() {
        return new AddTransResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Transactiondetails }
     * 
     */
    public Transactiondetails createTransactiondetails() {
        return new Transactiondetails();
    }

    /**
     * Create an instance of {@link LoginRes }
     * 
     */
    public LoginRes createLoginRes() {
        return new LoginRes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HisTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "HisTrans")
    public JAXBElement<HisTrans> createHisTrans(HisTrans value) {
        return new JAXBElement<HisTrans>(_HisTrans_QNAME, HisTrans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HisTransResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "HisTransResponse")
    public JAXBElement<HisTransResponse> createHisTransResponse(HisTransResponse value) {
        return new JAXBElement<HisTransResponse>(_HisTransResponse_QNAME, HisTransResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Postage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "Postage")
    public JAXBElement<Postage> createPostage(Postage value) {
        return new JAXBElement<Postage>(_Postage_QNAME, Postage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "PostageResponse")
    public JAXBElement<PostageResponse> createPostageResponse(PostageResponse value) {
        return new JAXBElement<PostageResponse>(_PostageResponse_QNAME, PostageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Accountbank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "accountbank")
    public JAXBElement<Accountbank> createAccountbank(Accountbank value) {
        return new JAXBElement<Accountbank>(_Accountbank_QNAME, Accountbank.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTrans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addTrans")
    public JAXBElement<AddTrans> createAddTrans(AddTrans value) {
        return new JAXBElement<AddTrans>(_AddTrans_QNAME, AddTrans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addTransResponse")
    public JAXBElement<AddTransResponse> createAddTransResponse(AddTransResponse value) {
        return new JAXBElement<AddTransResponse>(_AddTransResponse_QNAME, AddTransResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transactiondetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "transactiondetails")
    public JAXBElement<Transactiondetails> createTransactiondetails(Transactiondetails value) {
        return new JAXBElement<Transactiondetails>(_Transactiondetails_QNAME, Transactiondetails.class, null, value);
    }

}
