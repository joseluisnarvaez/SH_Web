package santander.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import santander.utils.PropertiesUtil;


public class ConexionSybases {
	
	public Connection openConnection() throws ClassNotFoundException, SQLException{
		String user= PropertiesUtil.getInstance().recuperaValor("user");
		String password=PropertiesUtil.getInstance().recuperaValor("password");
		String JDBC= PropertiesUtil.getInstance().recuperaValor("JDBC");
		String Driver=	PropertiesUtil.getInstance().recuperaValor("DRIVER");
		
		Class.forName(Driver);
	
	Connection cnn = DriverManager.getConnection(JDBC,
			user,password);
	return cnn;
	}

}
