package santander.loggers;




import javax.servlet.http.HttpServlet;

import org.apache.log4j.PropertyConfigurator;

import santander.constans.Constans;









public class Log4jLauncher  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * inicializa el servlet.
	 */
	public void init()  {
		try {
			
			String path = System.getProperty(Constans.PATH_CONF_WAS);
			if(path == null || path.length() == 0) {
	    		path = System.getProperty(Constans.PATH_CONF_TOMCAT);
	    	}
	                String NAME = Constans.ARCHIVO_LOG4J;
			String fileSt = path+"/"+Constans.PROPERTIES+NAME;
			if (path != null) {
				
				
				System.out.println("_________fileSt_____________________");
				System.out.println(fileSt);
				

				PropertyConfigurator.configure(fileSt);
			} else {
				initOther();
			}
		} catch (Exception e) {

		}
	}

	/**
	 * Destruye el servlet.
	 */


	/**
	 * doGet Servlet method
	 */


	public void initOther() {

		try {
		
			PropertyConfigurator.configure(Constans.PATH_CONF +Constans.PROPERTIES+ Constans.ARCHIVO_LOG4J);

		} catch (Exception e) {
			e.getStackTrace();
		} finally {

		}
	}
}