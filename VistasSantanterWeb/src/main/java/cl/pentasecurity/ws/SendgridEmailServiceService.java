/**
 * SendgridEmailServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.pentasecurity.ws;

public interface SendgridEmailServiceService extends javax.xml.rpc.Service {
    public java.lang.String getSendgridEmailServiceAddress();

    public cl.pentasecurity.ws.SendgridEmailService getSendgridEmailService() throws javax.xml.rpc.ServiceException;

    public cl.pentasecurity.ws.SendgridEmailService getSendgridEmailService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
