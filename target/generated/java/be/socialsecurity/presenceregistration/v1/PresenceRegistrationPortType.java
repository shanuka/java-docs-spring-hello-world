package be.socialsecurity.presenceregistration.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-02-07T08:19:39.336+05:30
 * Generated source version: 3.5.5
 *
 */
@WebService(targetNamespace = "http://socialsecurity.be/presenceregistration/v1", name = "PresenceRegistrationPortType")
@XmlSeeAlso({be.socialsecurity.errors.v1.ObjectFactory.class, be.socialsecurity.presenceregistration.schemas.v1.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PresenceRegistrationPortType {

    /**
     * A list of presence registrations to cancel. The list contains one or more CancelPresenceRequestType Complex Type with a PresenceRegistrationId and the CancellationReason. Current allowed values of the CancellationReason are HOLIDAY, DISEASE, PLANNING, C32A
     */
    @WebMethod(action = "http://socialsecurity.be/presenceregistration/v1/cancelPresences")
    @WebResult(name = "CancelPresencesResponse", targetNamespace = "http://socialsecurity.be/presenceregistration/v1", partName = "response")
    public CancelPresencesResponse cancelPresences(

        @WebParam(partName = "request", name = "CancelPresencesRequest", targetNamespace = "http://socialsecurity.be/presenceregistration/v1")
        CancelPresencesRequest request
    ) throws SystemError, BusinessError;

    /**
     * This operation is used to submit one or more presence registrations to the Social Security as required in some worksites. A typical registration requires to provide the who, where and when information. You may make up till 200 of such PresenceRegistrationRequests of the complex type PresenceRegistrationSubmitType in one call to the RegisterPresencesRequest, which will be answered by a RegisterPresencesResponse with each RegisterPresenceRespons either returning a PresenceRegistrationType (=success) or a PresenceRegistrationErrorType (=failed registration).
     */
    @WebMethod(action = "http://socialsecurity.be/presenceregistration/v1/registerPresences")
    @WebResult(name = "RegisterPresencesResponse", targetNamespace = "http://socialsecurity.be/presenceregistration/v1", partName = "response")
    public RegisterPresencesResponse registerPresences(

        @WebParam(partName = "request", name = "RegisterPresencesRequest", targetNamespace = "http://socialsecurity.be/presenceregistration/v1")
        RegisterPresencesRequest request
    ) throws SystemError, BusinessError;

    /**
     * In order to get all the possible details about a certain presence registration one can use this call to retrieve the full history of a certain presence registration identified by it s PresenceRegistrationId.
     */
    @WebMethod(action = "http://socialsecurity.be/presenceregistration/v1/getPresenceRegistration")
    @WebResult(name = "GetPresenceRegistrationResponse", targetNamespace = "http://socialsecurity.be/presenceregistration/v1", partName = "response")
    public GetPresenceRegistrationResponse getPresenceRegistration(

        @WebParam(partName = "request", name = "GetPresenceRegistrationRequest", targetNamespace = "http://socialsecurity.be/presenceregistration/v1")
        GetPresenceRegistrationRequest request
    ) throws SystemError, BusinessError;

    /**
     * This operation allows to search one or more presence registrations as required on some worksites. A SearchPresencesRequest contains search criteria (SearchPresenceRegistrationCriteria), together with pagination (PaginationProperties) and sortering posibilities (SortingProperties) to return a SearchPresencesResponse with a list of presence registrations that correspond to the above criteria and properties. The user must indicate a period for the registration : the fields RegistrationPeriodStartDate and RegistrationPeriodEndDate are mandatory. The reply message is given as a a SearchPresencesReponseType and contains the original request (SearchPresencesRequest) and either a PresenceRegistrationList or a PresenceRegistrationError. In case it s a the PresenceRegistrationList, it contains the result count. The number of presence registrations is limited to 500.
     */
    @WebMethod(action = "http://socialsecurity.be/presenceregistration/v1/searchPresences")
    @WebResult(name = "SearchPresencesResponse", targetNamespace = "http://socialsecurity.be/presenceregistration/v1", partName = "response")
    public SearchPresencesResponse searchPresences(

        @WebParam(partName = "request", name = "SearchPresencesRequest", targetNamespace = "http://socialsecurity.be/presenceregistration/v1")
        SearchPresencesRequest request
    ) throws SystemError, BusinessError;
}
