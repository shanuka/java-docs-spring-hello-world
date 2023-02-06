package com.mickiesoft.UPrinceV5CheckIn.controller;
import be.socialsecurity.presenceregistration.schemas.v1.PresenceRegistrationSubmitType;
import be.socialsecurity.presenceregistration.v1.*;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.joda.time.DateTime;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.logging.Logger;

@RestController
public class RegisterController {

//    private static PresenceRegistrationPortType port;
//    private static RegisterPresencesRequest request;
//    private static SearchPresencesRequest searchRequest;
//
//    private static RegisterPresencesRequest requestGlobal;
//    private static RegisterPresencesRequest requestGlobalLimosa;
        private static final Logger LOG = (Logger) LoggerFactory.getLogger(RegisterController.class);

    private static final URL WSDL_URL = ClassLoader.getSystemResource("wsdl/presenceregistration/v1/PresenceRegistration_v1.wsdl");

    private DateTime date;

    private static PresenceRegistrationService presenceService;


    @RequestMapping(method = RequestMethod.GET, value = "/api/registerEmployee/{inss}/{workplaceid}/{companyid}")
    @ResponseStatus(HttpStatus.OK)
    public RegisterPresencesResponse completeRegisterRequest(@PathVariable("inss") String inss, @PathVariable("workplaceid") String workplaceID, @PathVariable("companyid") String companyID)  {
       // checkTime();

        presenceService = new PresenceRegistrationService(WSDL_URL);
        PresenceRegistrationPortType port = presenceService.getPresenceRegistrationSOAP11();
        RegisterPresencesRequest requestGlobal = new RegisterPresencesRequest();
        // next three lines are optional, they dump the SOAP request/response
        Client client = ClientProxy.getClient(port);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());

        PresenceRegistrationSubmitType individualRequest = new PresenceRegistrationSubmitType();

        individualRequest.setINSS(inss);
        individualRequest.setCompanyID( Long.parseLong(companyID));
        individualRequest.setWorkPlaceId(workplaceID);
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

        System.out.println("requestGlobal ");

        RegisterPresencesResponse response = new RegisterPresencesResponse();

        if (port == null) {
            System.out.println("requestGlobal port null");
            return response;
        } else {
            try {
                System.out.println(" response = port.registerPresences(requestGlobal);");
                response = port.registerPresences(requestGlobal);

                LOG.info("Successfully called SOAP service!");

            } catch (SystemError ex) {
                return new RegisterPresencesResponse();
            } catch (BusinessError ex) {
                System.out.println("Business error in the one employee registration: " + ex.toString());
            }
        }
        return response;
    }


//    private void checkTime() {
//        if (date == null) {
//            date = new DateTime();
//            initProxy();
//            return;
//        }
//        DateTime dateNow = new DateTime();
//
//        // get hours
//        double hours = (dateNow.getMillis() - date.getMillis()) / 1000 / 60 / 60;
//        //if (hours > 1) {
//            initProxy();
//       // }
//    }
//
//    private void initProxy() {
//        presenceService = new PresenceRegistrationService(WSDL_URL);
//        port = presenceService.getPresenceRegistrationSOAP11();
//        requestGlobal = new RegisterPresencesRequest();
//        // next three lines are optional, they dump the SOAP request/response
//        Client client = ClientProxy.getClient(port);
//        client.getInInterceptors().add(new LoggingInInterceptor());
//        client.getOutInterceptors().add(new LoggingOutInterceptor());
//    }
}
