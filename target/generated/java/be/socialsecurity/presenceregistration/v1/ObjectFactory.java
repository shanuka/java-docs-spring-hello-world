
package be.socialsecurity.presenceregistration.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.socialsecurity.presenceregistration.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.socialsecurity.presenceregistration.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterPresencesRequest }
     * 
     */
    public RegisterPresencesRequest createRegisterPresencesRequest() {
        return new RegisterPresencesRequest();
    }

    /**
     * Create an instance of {@link RegisterPresencesResponse }
     * 
     */
    public RegisterPresencesResponse createRegisterPresencesResponse() {
        return new RegisterPresencesResponse();
    }

    /**
     * Create an instance of {@link CancelPresencesRequest }
     * 
     */
    public CancelPresencesRequest createCancelPresencesRequest() {
        return new CancelPresencesRequest();
    }

    /**
     * Create an instance of {@link CancelPresencesResponse }
     * 
     */
    public CancelPresencesResponse createCancelPresencesResponse() {
        return new CancelPresencesResponse();
    }

    /**
     * Create an instance of {@link SearchPresencesRequest }
     * 
     */
    public SearchPresencesRequest createSearchPresencesRequest() {
        return new SearchPresencesRequest();
    }

    /**
     * Create an instance of {@link SearchPresencesResponse }
     * 
     */
    public SearchPresencesResponse createSearchPresencesResponse() {
        return new SearchPresencesResponse();
    }

    /**
     * Create an instance of {@link GetPresenceRegistrationRequest }
     * 
     */
    public GetPresenceRegistrationRequest createGetPresenceRegistrationRequest() {
        return new GetPresenceRegistrationRequest();
    }

    /**
     * Create an instance of {@link GetPresenceRegistrationResponse }
     * 
     */
    public GetPresenceRegistrationResponse createGetPresenceRegistrationResponse() {
        return new GetPresenceRegistrationResponse();
    }

}
