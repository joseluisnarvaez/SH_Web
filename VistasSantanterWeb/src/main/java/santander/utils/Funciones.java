package santander.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;

import org.apache.log4j.Logger;


import cl.pentasecurity.dto.AttachmentDTO;
import cl.pentasecurity.dto.VariablesDTO;
import cl.pentasecurity.ws.SendgridEmailServiceProxy;


public class Funciones {
	Logger logg= Logger.getLogger(Funciones.class);
	
	public void SendMail(String correo,String ruta) throws FileNotFoundException, UnsupportedEncodingException{
		
	SendgridEmailServiceProxy envio= new SendgridEmailServiceProxy();
	envio.setEndpoint(PropertiesUtil.getInstance().recuperaValor("EnvioMail"));
	String emailFrom= PropertiesUtil.getInstance().recuperaValor("FROM");
	String[] emailTo= new String[1];
	emailTo[0]=correo;
	String[] cc =  new String[1];
	String subject = PropertiesUtil.getInstance().recuperaValor("subject");
	String message=  PropertiesUtil.getInstance().recuperaValor("body");
	boolean isHtml = true;
    
    VariablesDTO[] variables = new VariablesDTO[1];
    VariablesDTO v = new VariablesDTO();
    v.setName("jjj");
    v.setValue("dddd");
    variables[0]=v;
	AttachmentDTO[] attachments =new AttachmentDTO[1];
	AttachmentDTO att= new AttachmentDTO();
	att.setFileName(getName(ruta));
	att.setBase64File(getArchivo(ruta));
	attachments[0]=att;
	
	try {
		envio.sendSendGridEmail(emailFrom, emailTo, cc, subject,message, variables, attachments, isHtml);
	} catch (RemoteException e) {
		logg.error(e);
	}
	
	
	}
	
	
	
	public String getArchivo(String ruta) throws FileNotFoundException, UnsupportedEncodingException{
		File file= new File(ruta);
	      FileInputStream fis = new FileInputStream(file);
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        byte[] buf = new byte[2040];
	        try {
	            for (int readNum; (readNum = fis.read(buf)) != -1;) {
	                bos.write(buf, 0, readNum); //no doubt here is 0
	            
	            }
	        } catch (IOException ex) {
	         
	        }
	        byte[] bytes = bos.toByteArray();


	         
		
		return new String(bytes);
		
	}
	
	private String getName(String ruta){
		File file= new File(ruta);
		return file.getName();
		
	}
	
	

}
