package be.socialsecurity.platformintegrationconsumertest.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-02-06T20:02:03.072+05:30
 * Generated source version: 3.5.5
 *
 */
@WebServiceClient(name = "PlatformIntegrationConsumerTestService",
                  wsdlLocation = "file:/Users/shanukagayashan/Documents/GitHub/java-docs-spring-hello-world/src/main/resources/wsdl/platformintegrationconsumertest/v1/PlatformIntegrationConsumerTest_v1.wsdl",
                  targetNamespace = "http://socialsecurity.be/platformintegrationconsumertest/v1")
public class PlatformIntegrationConsumerTestService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://socialsecurity.be/platformintegrationconsumertest/v1", "PlatformIntegrationConsumerTestService");
    public final static QName PlatformIntegrationConsumerTestSOAP11 = new QName("http://socialsecurity.be/platformintegrationconsumertest/v1", "PlatformIntegrationConsumerTestSOAP11");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/shanukagayashan/Documents/GitHub/java-docs-spring-hello-world/src/main/resources/wsdl/platformintegrationconsumertest/v1/PlatformIntegrationConsumerTest_v1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PlatformIntegrationConsumerTestService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/shanukagayashan/Documents/GitHub/java-docs-spring-hello-world/src/main/resources/wsdl/platformintegrationconsumertest/v1/PlatformIntegrationConsumerTest_v1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PlatformIntegrationConsumerTestService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PlatformIntegrationConsumerTestService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PlatformIntegrationConsumerTestService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PlatformIntegrationConsumerTestService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PlatformIntegrationConsumerTestService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PlatformIntegrationConsumerTestService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PlatformIntegrationConsumerTestPortType
     */
    @WebEndpoint(name = "PlatformIntegrationConsumerTestSOAP11")
    public PlatformIntegrationConsumerTestPortType getPlatformIntegrationConsumerTestSOAP11() {
        return super.getPort(PlatformIntegrationConsumerTestSOAP11, PlatformIntegrationConsumerTestPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PlatformIntegrationConsumerTestPortType
     */
    @WebEndpoint(name = "PlatformIntegrationConsumerTestSOAP11")
    public PlatformIntegrationConsumerTestPortType getPlatformIntegrationConsumerTestSOAP11(WebServiceFeature... features) {
        return super.getPort(PlatformIntegrationConsumerTestSOAP11, PlatformIntegrationConsumerTestPortType.class, features);
    }

}
