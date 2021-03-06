
package gov.state.ca.cadata.ccdws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CCDWSSoap", targetNamespace = "http://cadata.ca.state.gov/CCDWS")
@XmlSeeAlso({
    ObjectFactory.class
})
public class CCDWSSoapService implements CCDWSSoap {


    /**
     * 
     * @param ccdwsQueryRequest
     * @return
     *     returns java.lang.String
     */

    public String ccdwsQuery(
        @WebParam(name = "CCDWSQueryRequest", targetNamespace = "http://cadata.ca.state.gov/CCDWS")
        String ccdwsQueryRequest) { return "ccdwsQuery return"; };

    /**
     * 
     * @param ccdwsQueryRequestAck
     * @return
     *     returns java.lang.String
     */


    public String ccdwsQueryAck(
        @WebParam(name = "CCDWSQueryRequestAck", targetNamespace = "http://cadata.ca.state.gov/CCDWS")
        String ccdwsQueryRequestAck) { return "ccdwsQueryAck return"; };

    /**
     * 
     * @param ccdwsQueryRequest
     */
    public void ccdwsQueryNoAck(
        @WebParam(name = "CCDWSQueryRequest", targetNamespace = "http://cadata.ca.state.gov/CCDWS")
        String ccdwsQueryRequest) { int i= 5;};

 /**
 *   *
 *        * @param xmlIn
 *             * @return
 *                  *     returns java.lang.String
 *                       */
    public String ccdwsRunPkg(
        @WebParam(name = "XMLIn", targetNamespace = "http://cadata.ca.state.gov/CCDWS")
        String xmlIn) {
        try {
                Context initContext = new InitialContext();
                //Context envContext  = (Context)initContext.lookup("java:/comp/env");
                DataSource ds = (DataSource)initContext.lookup("java:jboss/datasources/ccdws_user");
                Connection conn = ds.getConnection();
 
                Clob clobIn = conn.createClob();
 
                clobIn.setString(1,xmlIn);
 
                CallableStatement call = conn.prepareCall("BEGIN ccdws.run_pkg(?,?,'Y'); END;");
 
                call.setClob(1,clobIn);
 
                call.registerOutParameter(2,Types.CLOB);
 
                call.execute();

		Clob clobOut = call.getClob(2);

		String returnString = clobOut.getSubString(1,(int)clobOut.length()); 

                return returnString;
 
                //return "ccdwsRunPkg return";
           }
           catch (Exception e) {
            
		e.printStackTrace(); 
           	return e.getMessage();
           }
       };


    /**
     * 
     * @param xmlIn
     */
    public void ccdwsRunPkgNoAck(
        @WebParam(name = "XMLIn", targetNamespace = "http://cadata.ca.state.gov/CCDWS")
        String xmlIn) { int i = 5; };

    /**
     * 
     * @param xmlIn
     * @param byteIn
     * @return
     *     returns java.lang.String
     */
    public String ccdwsRunLobPkg(
        @WebParam(name = "XMLIn", targetNamespace = "http://cadata.ca.state.gov/CCDWS")
        String xmlIn,
        @WebParam(name = "byteIn", targetNamespace = "http://cadata.ca.state.gov/CCDWS")
        byte[] byteIn) { 

	try {
                Context initContext = new InitialContext();
                DataSource ds = (DataSource)initContext.lookup("java:jboss/datasources/ccdws_user");
                Connection conn = ds.getConnection();
                
                Clob clobIn = conn.createClob();
                Blob blobIn = conn.createBlob();

                clobIn.setString(1,xmlIn);
		blobIn.setBytes(1,byteIn);
                
                CallableStatement call = conn.prepareCall("BEGIN ccdws.run_lob_pkg(?,?,?); END;");
                
                call.setClob(1,clobIn);
		call.setBlob(2,blobIn);
                
                call.registerOutParameter(3,Types.CLOB);
                
                call.execute();
                
		Clob clobOut = call.getClob(3);
                
		String returnString = clobOut.getSubString(1,(int)clobOut.length());
                
		return returnString;
                                                                                                                                           }
                                                                                                                                         catch (Exception e) {
                     e.printStackTrace();
                     return e.getMessage();
         
	}
 };

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    public String test() { return "test return"; };

}
