
package be.socialsecurity.platformintegrationconsumertest.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import be.socialsecurity.platformintegrationconsumertest.types.v1.IntegrationTestMessage;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.socialsecurity.platformintegrationconsumertest.v1 package. 
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

    private final static QName _CheckConnectionRequest_QNAME = new QName("http://socialsecurity.be/platformintegrationconsumertest/v1", "CheckConnectionRequest");
    private final static QName _CheckConnectionResponse_QNAME = new QName("http://socialsecurity.be/platformintegrationconsumertest/v1", "CheckConnectionResponse");
    private final static QName _CheckAccessControlRequest_QNAME = new QName("http://socialsecurity.be/platformintegrationconsumertest/v1", "CheckAccessControlRequest");
    private final static QName _CheckAccessControlResponse_QNAME = new QName("http://socialsecurity.be/platformintegrationconsumertest/v1", "CheckAccessControlResponse");
    private final static QName _CheckBrokeredAccessControlRequest_QNAME = new QName("http://socialsecurity.be/platformintegrationconsumertest/v1", "CheckBrokeredAccessControlRequest");
    private final static QName _CheckBrokeredAccessControlResponse_QNAME = new QName("http://socialsecurity.be/platformintegrationconsumertest/v1", "CheckBrokeredAccessControlResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.socialsecurity.platformintegrationconsumertest.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://socialsecurity.be/platformintegrationconsumertest/v1", name = "CheckConnectionRequest")
    public JAXBElement<IntegrationTestMessage> createCheckConnectionRequest(IntegrationTestMessage value) {
        return new JAXBElement<IntegrationTestMessage>(_CheckConnectionRequest_QNAME, IntegrationTestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://socialsecurity.be/platformintegrationconsumertest/v1", name = "CheckConnectionResponse")
    public JAXBElement<IntegrationTestMessage> createCheckConnectionResponse(IntegrationTestMessage value) {
        return new JAXBElement<IntegrationTestMessage>(_CheckConnectionResponse_QNAME, IntegrationTestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://socialsecurity.be/platformintegrationconsumertest/v1", name = "CheckAccessControlRequest")
    public JAXBElement<IntegrationTestMessage> createCheckAccessControlRequest(IntegrationTestMessage value) {
        return new JAXBElement<IntegrationTestMessage>(_CheckAccessControlRequest_QNAME, IntegrationTestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://socialsecurity.be/platformintegrationconsumertest/v1", name = "CheckAccessControlResponse")
    public JAXBElement<IntegrationTestMessage> createCheckAccessControlResponse(IntegrationTestMessage value) {
        return new JAXBElement<IntegrationTestMessage>(_CheckAccessControlResponse_QNAME, IntegrationTestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://socialsecurity.be/platformintegrationconsumertest/v1", name = "CheckBrokeredAccessControlRequest")
    public JAXBElement<IntegrationTestMessage> createCheckBrokeredAccessControlRequest(IntegrationTestMessage value) {
        return new JAXBElement<IntegrationTestMessage>(_CheckBrokeredAccessControlRequest_QNAME, IntegrationTestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegrationTestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://socialsecurity.be/platformintegrationconsumertest/v1", name = "CheckBrokeredAccessControlResponse")
    public JAXBElement<IntegrationTestMessage> createCheckBrokeredAccessControlResponse(IntegrationTestMessage value) {
        return new JAXBElement<IntegrationTestMessage>(_CheckBrokeredAccessControlResponse_QNAME, IntegrationTestMessage.class, null, value);
    }

}
