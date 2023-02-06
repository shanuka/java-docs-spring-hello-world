/*
 * Hoewel al de mogelijke zorg is besteed aan de creatie van dit programma, wordt geen enkele waarborg gegeven met betrekking tot de actualiteit, accuraatheid, correctheid, volledigheid of geschiktheid hiervan.
 * Noch de RSZ, noch enige eventueel andere instantie verantwoordelijk voor de inhoud van het portaal kunnen op
 * enigerlei wijze aansprakelijk worden gesteld voor eventuele gevolgen bij het raadplegen of het gebruik van dit
 * programma.
 *
 * Bien que le plus grand soin ait été accordé à la création de ce programme, il n’est donné aucune garantie
 * quant à son actualité, sa précision, son exactitude, son exhaustivité ou sa pertinence. Ni l’ONSS ni
 * toute autre instance éventuelle responsable du contenu du portail ne peuvent être tenus responsables de
 * quelque manière que ce soit des éventuelles conséquences de la consultation ou de l’utilisation de ce programme.
*/
package com.mickiesoft.UPrinceV5CheckIn.platformintegrationconsumertest;


import be.socialsecurity.platformintegrationconsumertest.types.v1.IntegrationTestMessage;
import be.socialsecurity.platformintegrationconsumertest.v1.SystemError;
import be.socialsecurity.presenceregistration.schemas.v1.*;
import be.socialsecurity.presenceregistration.v1.*;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertNotNull;

/**
 * Web service client to call the PlatformIntegrationConsumerTest service on the NSSO services platform.
 *
 * @see <a href="https://www.socialsecurity.be/site_nl/general/helpcentre/soa/access.htm">Toegang tot het SOA-platform testen</a>
 * @see <a href="https://www.socialsecurity.be/site_fr/general/helpcentre/soa/access.htm">Tester l'accès à la plateforme SOA</a>
 */
public class PresenceTest {

    private static final URL WSDL_URL = ClassLoader.getSystemResource("wsdl/presenceregistration/v1/PresenceRegistration_v1.wsdl");
    private static PresenceRegistrationPortType port;
    private static RegisterPresencesRequest request;
    private static SearchPresencesRequest searchRequest;

    private static RegisterPresencesRequest requestGlobal;
    private static RegisterPresencesRequest requestGlobalLimosa;


    @BeforeClass
    public static void init() throws DatatypeConfigurationException {
        PresenceRegistrationService service = new PresenceRegistrationService(WSDL_URL);
        port = service.getPresenceRegistrationSOAP11();
        requestGlobal = new RegisterPresencesRequest();

        requestGlobalLimosa = new RegisterPresencesRequest();


        PresenceRegistrationSubmitType individualRequest = new PresenceRegistrationSubmitType();

        individualRequest.setINSS("97440936363");
        individualRequest.setCompanyID((long) 760544138);
        individualRequest.setWorkPlaceId("1Y102M7NZF7PZ");
        GregorianCalendar cal = new GregorianCalendar();
        XMLGregorianCalendar xmlDate = null;
        try {
            xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
            System.out.println("Date is " + xmlDate.toString());
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(ex.toString());
        }
        individualRequest.setRegistrationDate(xmlDate);
        requestGlobal.getPresenceRegistrationRequest().add(individualRequest);

        //limosa

        PresenceRegistrationSubmitType individualRequestlimosa = new PresenceRegistrationSubmitType();

        //individualRequestlimosa.setINSS("97440936363");
        individualRequestlimosa.setLimosaId("24911936602056031");


       // individualRequestlimosa.setCompanyID((long) 760544138);
        individualRequestlimosa.setWorkPlaceId("1Y102HV63VT7Z");
//        GregorianCalendar cal = new GregorianCalendar();
//        XMLGregorianCalendar xmlDate = null;
//        try {
//            xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
//            System.out.println("Date is " + xmlDate.toString());
//        } catch (DatatypeConfigurationException ex) {
//            Logger.getLogger(ex.toString());
//        }
        individualRequestlimosa.setRegistrationDate(xmlDate);
        requestGlobalLimosa.getPresenceRegistrationRequest().add(individualRequestlimosa);

        // next three lines are optional, they dump the SOAP request/response
        Client client = ClientProxy.getClient(port);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());

        request = new RegisterPresencesRequest();
        List<PresenceRegistrationSubmitType> presenceRegistrationRequest = request.getPresenceRegistrationRequest();
        PresenceRegistrationSubmitType prst = new PresenceRegistrationSubmitType();
        XMLGregorianCalendar gregFmt = DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

        prst.setRegistrationDate(gregFmt);

        prst.setINSS("97440936363");

        prst.setCompanyID(760544138L);

        prst.setWorkPlaceId("1Y102M7NZF7PZ");

        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        System.out.println("ssssssssssssss"+ date);
        //2013-12-01

        prst.setClientPresenceRegistrationReference("shanuka");
        //prst.setWorkPlaceId();
        presenceRegistrationRequest.add(prst);

        searchRequest = new SearchPresencesRequest();

        // request.setTimestamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
    }

//    @Test
//    public void testregisterPresences() throws be.socialsecurity.presenceregistration.v1.SystemError, BusinessError {
//        RegisterPresencesResponse response = port.registerPresences(requestGlobal);
//        assertNotNull(response);
//        System.out.println("##########");
//        System.out.println("Response status is: " + response.getPresenceRegistrationResponse().get(0).getPresenceRegistration().getLastValidation().getStatus());
//        System.out.println("##########");
//    }


    @Test
    public void testregisterRequestGlobalLimosa() throws be.socialsecurity.presenceregistration.v1.SystemError, BusinessError {
        RegisterPresencesResponse response = port.registerPresences(requestGlobalLimosa);
        assertNotNull(response);
        System.out.println("##########");
        System.out.println("Response status is: " + response.getPresenceRegistrationResponse().get(0).getPresenceRegistration().getLastValidation().getStatus());
        System.out.println("##########");
    }

    /**
     * Calls the checkConnection operation using a 1-way SSL connection.
     *
     * @see <a href="https://www.socialsecurity.be/site_nl/general/helpcentre/soa/transport_security.htm">SSL/TLS Transport security (nl)</a>
     *      <a href="https://www.socialsecurity.be/site_fr/general/helpcentre/soa/transport_security.htm">SSL/TLS Transport security (fr)</a>
     */
//    @Test
//    public void testRegisterPresences() throws SystemError {
//        RegisterPresencesResponse response = null;
//        try {
//            response = port.registerPresences(request);
//        } catch (be.socialsecurity.presenceregistration.v1.SystemError systemError) {
//            systemError.printStackTrace();
//        } catch (BusinessError businessError) {
//            businessError.printStackTrace();
//        }
//
//
//        //assertEquals(request.getPresenceRegistrationRequest(), response.getMessage());
//        assertNotNull(request.getPresenceRegistrationRequest());
//    }
//
//
//    @Test
//    public void testPresenceRegistration() throws SystemError {
//        RegisterPresencesResponse response = null;
//        try {
//
//            SearchPresencesRequestType request = new SearchPresencesRequestType();
//            SearchPresenceRegistrationCriteria criteria = new SearchPresenceRegistrationCriteria();
//
//            criteria.setINSS("97440936363)");
//
//            StatusListType remark = new StatusListType();
//
//            remark.getStatus().add(StatusType.SUCCESSFULLY_REGISTERED);
//
//            criteria.setStatusList(remark);
//
//
//            request.setSearchPresenceRegistrationCriteria(criteria);
//            searchRequest.setSearchPresenceRequest(request);
////            GetPresenceRegistrationRequest request = new GetPresenceRegistrationRequest();
////            GetPresenceRegistrationRequestType value = new GetPresenceRegistrationRequestType();
////            value.setPresenceRegistrationId("");
////            request.setGetPresenceRegistrationRequest(value);
////            SearchPresencesRequest request = new SearchPresencesRequest();
////            SearchPresencesRequestType spty = new SearchPresencesRequestType();
////            SearchPresenceRegistrationCriteria value = new SearchPresenceRegistrationCriteria();
////            value.setWorkPlaceId("1Y102M8EA2DLZ");
////            spty.setSearchPresenceRegistrationCriteria(value);
////            request.setSearchPresenceRequest(spty);
////            SearchPresencesRequest s = new SearchPresencesRequest();
////            s.setSearchPresenceRequest(request);
////            SearchPresencesRequestType value = new SearchPresencesRequestType();
////            SearchPresenceRegistrationCriteria value2 = new SearchPresenceRegistrationCriteria();
////            value2.setINSS("96121828910");
////
////            XMLGregorianCalendar dateS = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
////
////            value2.setCreationStartDate(dateS);
////
////            XMLGregorianCalendar datee = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
////            value2.setCreationEndDate(datee);
////
////            value.setSearchPresenceRegistrationCriteria(value2);
////            //SortingPropertiesType value1 = new SortingPropertiesType();
////           // value1.setSortCriteria(new SortCriteriaType());
////            //value.setSortingProperties(value1);
////            request.setSearchPresenceRequest(value);
//            SearchPresencesResponse responses = port.searchPresences(searchRequest);
//
//        } catch (be.socialsecurity.presenceregistration.v1.SystemError systemError) {
//            systemError.printStackTrace();
//        } catch (BusinessError businessError) {
//            businessError.printStackTrace();
//        }
//
//        //assertEquals(request.getPresenceRegistrationRequest(), response.getMessage());
//        assertNotNull(request.getPresenceRegistrationRequest());
//    }
//
//
////    /**
////     * Calls the checkAccessControl operation using X.509 Token Profile security policy. The body, timestamp and certificate of the request
////     * are signed.
////     *
////     * @see <a href="https://www.socialsecurity.be/site_nl/general/helpcentre/soa/certificate_token.htm">WS-Security X.509 Certificate Token Profile (nl)</a>
////     *      <a href="https://www.socialsecurity.be/site_fr/general/helpcentre/soa/certificate_token.htm">WS-Security X.509 Certificate Token Profile (fr)</a>
////     */
////    @Test
////    public void testCheckAccessControl() throws SystemError {
////        IntegrationTestMessage response = port.checkAccessControl(request);
////
////        assertEquals(request.getMessage(), response.getMessage());
////        assertNotNull(response.getAuthenticatedConsumer());
////    }
////
////    /**
////     * Calls the checkBrokeredAccessControl operation using SAML Holder-of-Key Token Profile security policy. The client first interacts
////     * with the SecurityTokenService (STS) to retrieve a SAML token. Using the signed SAML token the client invokes the
////     * checkBrokeredAccessControl operation.
////     *
////     * @see <a href="https://www.socialsecurity.be/site_nl/general/helpcentre/soa/security_saml.htm">WS-Security SAML Token Profile (Holder-of-Key) (nl)</a>
////     *      <a href="https://www.socialsecurity.be/site_fr/general/helpcentre/soa/security_saml.htm">WS-Security SAML Token Profile (Holder-of-Key) (fr)</a>
////     */

}
