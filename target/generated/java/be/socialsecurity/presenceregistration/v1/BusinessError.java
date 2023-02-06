
package be.socialsecurity.presenceregistration.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-02-06T20:02:03.348+05:30
 * Generated source version: 3.5.5
 */

@WebFault(name = "BusinessError", targetNamespace = "http://socialsecurity.be/errors/v1")
public class BusinessError extends Exception {

    private be.socialsecurity.errors.v1.ErrorType faultInfo;

    public BusinessError() {
        super();
    }

    public BusinessError(String message) {
        super(message);
    }

    public BusinessError(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public BusinessError(String message, be.socialsecurity.errors.v1.ErrorType businessError) {
        super(message);
        this.faultInfo = businessError;
    }

    public BusinessError(String message, be.socialsecurity.errors.v1.ErrorType businessError, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = businessError;
    }

    public be.socialsecurity.errors.v1.ErrorType getFaultInfo() {
        return this.faultInfo;
    }
}
