/**
 * SendgridEmailService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.pentasecurity.ws;

public interface SendgridEmailService extends java.rmi.Remote {
    public java.lang.String sendSendGridEmail(java.lang.String emailFrom, java.lang.String[] emailTo, java.lang.String[] cc, java.lang.String subject, java.lang.String message, cl.pentasecurity.dto.VariablesDTO[] variables, cl.pentasecurity.dto.AttachmentDTO[] attachments, boolean isHtml) throws java.rmi.RemoteException;
}
