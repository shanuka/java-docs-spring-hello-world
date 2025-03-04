package be.socialsecurity.presenceregistration.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-02-07T08:19:39.346+05:30
 * Generated source version: 3.5.5
 *
 */
@WebServiceClient(name = "PresenceRegistrationService",
                  wsdlLocation = "file:/Users/shanukagayashan/Documents/GitHub/java-docs-spring-hello-world/src/main/resources/wsdl/presenceregistration/v1/PresenceRegistration_v1.wsdl",
                  targetNamespace = "http://socialsecurity.be/presenceregistration/v1")
public class PresenceRegistrationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://socialsecurity.be/presenceregistration/v1", "PresenceRegistrationService");
    public final static QName PresenceRegistrationSOAP11 = new QName("http://socialsecurity.be/presenceregistration/v1", "PresenceRegistrationSOAP11");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/shanukagayashan/Documents/GitHub/java-docs-spring-hello-world/src/main/resources/wsdl/presenceregistration/v1/PresenceRegistration_v1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PresenceRegistrationService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/shanukagayashan/Documents/GitHub/java-docs-spring-hello-world/src/main/resources/wsdl/presenceregistration/v1/PresenceRegistration_v1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PresenceRegistrationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PresenceRegistrationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PresenceRegistrationService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PresenceRegistrationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PresenceRegistrationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PresenceRegistrationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PresenceRegistrationPortType
     */
    @WebEndpoint(name = "PresenceRegistrationSOAP11")
    public PresenceRegistrationPortType getPresenceRegistrationSOAP11() {
        return super.getPort(PresenceRegistrationSOAP11, PresenceRegistrationPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PresenceRegistrationPortType
     */
    @WebEndpoint(name = "PresenceRegistrationSOAP11")
    public PresenceRegistrationPortType getPresenceRegistrationSOAP11(WebServiceFeature... features) {
        return super.getPort(PresenceRegistrationSOAP11, PresenceRegistrationPortType.class, features);
    }

}
