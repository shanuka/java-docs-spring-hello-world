
package be.socialsecurity.errors.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.socialsecurity.errors.v1 package. 
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

    private final static QName _SystemError_QNAME = new QName("http://socialsecurity.be/errors/v1", "SystemError");
    private final static QName _BusinessError_QNAME = new QName("http://socialsecurity.be/errors/v1", "BusinessError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.socialsecurity.errors.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link LocalisedString }
     * 
     */
    public LocalisedString createLocalisedString() {
        return new LocalisedString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://socialsecurity.be/errors/v1", name = "SystemError")
    public JAXBElement<ErrorType> createSystemError(ErrorType value) {
        return new JAXBElement<ErrorType>(_SystemError_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://socialsecurity.be/errors/v1", name = "BusinessError")
    public JAXBElement<ErrorType> createBusinessError(ErrorType value) {
        return new JAXBElement<ErrorType>(_BusinessError_QNAME, ErrorType.class, null, value);
    }

}
