/**
 * SendgridEmailServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cl.pentasecurity.ws;

public class SendgridEmailServiceServiceLocator extends org.apache.axis.client.Service implements cl.pentasecurity.ws.SendgridEmailServiceService {

    public SendgridEmailServiceServiceLocator() {
    }


    public SendgridEmailServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SendgridEmailServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SendgridEmailService
    private java.lang.String SendgridEmailService_address = "http://10.10.100.191:9080/WSSendgridEmail/services/SendgridEmailService";

    public java.lang.String getSendgridEmailServiceAddress() {
        return SendgridEmailService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SendgridEmailServiceWSDDServiceName = "SendgridEmailService";

    public java.lang.String getSendgridEmailServiceWSDDServiceName() {
        return SendgridEmailServiceWSDDServiceName;
    }

    public void setSendgridEmailServiceWSDDServiceName(java.lang.String name) {
        SendgridEmailServiceWSDDServiceName = name;
    }

    public cl.pentasecurity.ws.SendgridEmailService getSendgridEmailService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SendgridEmailService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSendgridEmailService(endpoint);
    }

    public cl.pentasecurity.ws.SendgridEmailService getSendgridEmailService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cl.pentasecurity.ws.SendgridEmailServiceSoapBindingStub _stub = new cl.pentasecurity.ws.SendgridEmailServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSendgridEmailServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSendgridEmailServiceEndpointAddress(java.lang.String address) {
        SendgridEmailService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cl.pentasecurity.ws.SendgridEmailService.class.isAssignableFrom(serviceEndpointInterface)) {
                cl.pentasecurity.ws.SendgridEmailServiceSoapBindingStub _stub = new cl.pentasecurity.ws.SendgridEmailServiceSoapBindingStub(new java.net.URL(SendgridEmailService_address), this);
                _stub.setPortName(getSendgridEmailServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SendgridEmailService".equals(inputPortName)) {
            return getSendgridEmailService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.pentasecurity.cl", "SendgridEmailServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.pentasecurity.cl", "SendgridEmailService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SendgridEmailService".equals(portName)) {
            setSendgridEmailServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
