package cl.pentasecurity.ws;

public class SendgridEmailServiceProxy implements cl.pentasecurity.ws.SendgridEmailService {
  private String _endpoint = null;
  private cl.pentasecurity.ws.SendgridEmailService sendgridEmailService = null;
  
  public SendgridEmailServiceProxy() {
    _initSendgridEmailServiceProxy();
  }
  
  public SendgridEmailServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSendgridEmailServiceProxy();
  }
  
  private void _initSendgridEmailServiceProxy() {
    try {
      sendgridEmailService = (new cl.pentasecurity.ws.SendgridEmailServiceServiceLocator()).getSendgridEmailService();
      if (sendgridEmailService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sendgridEmailService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sendgridEmailService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sendgridEmailService != null)
      ((javax.xml.rpc.Stub)sendgridEmailService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cl.pentasecurity.ws.SendgridEmailService getSendgridEmailService() {
    if (sendgridEmailService == null)
      _initSendgridEmailServiceProxy();
    return sendgridEmailService;
  }
  
  public java.lang.String sendSendGridEmail(java.lang.String emailFrom, java.lang.String[] emailTo, java.lang.String[] cc, java.lang.String subject, java.lang.String message, cl.pentasecurity.dto.VariablesDTO[] variables, cl.pentasecurity.dto.AttachmentDTO[] attachments, boolean isHtml) throws java.rmi.RemoteException{
    if (sendgridEmailService == null)
      _initSendgridEmailServiceProxy();
    return sendgridEmailService.sendSendGridEmail(emailFrom, emailTo, cc, subject, message, variables, attachments, isHtml);
  }
  
  
}