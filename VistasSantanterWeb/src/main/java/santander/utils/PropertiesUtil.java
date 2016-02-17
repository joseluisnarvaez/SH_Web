package santander.utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import santander.constans.Constans;








public class PropertiesUtil {

	

	private Map<String, String> map;
	private static PropertiesUtil instance;

	public PropertiesUtil() {
		initWas();
	}

	public static PropertiesUtil getInstance() {
		if (instance == null)
			instance = new PropertiesUtil();
					
		return instance;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public String recuperaValor(String key) {
		String valor = "";
		try {
			valor = (String) map.get(key);
			valor = valor.trim();
		} catch (Exception e) {
			valor = "";
		}
		return valor;
	}

	public int recuperaValorInt(String key) {
		int valor = -1;
		try {
			valor = Integer.parseInt(recuperaValor(key));
		} catch (Exception e) {
			valor = -1;
		}
		return valor;
	}

	public short recuperaValorShort(String key) {
		return (short) recuperaValorInt(key);
	}

	public long recuperaValorLong(String key) {
		return (long) recuperaValorInt(key);
	}

	@SuppressWarnings("rawtypes")
	public void initWas() {
		String path = System.getProperty(Constans.PATH_CONF_WAS);
		if(path == null || path.length() == 0) {
    		path = System.getProperty(Constans.PATH_CONF_TOMCAT);
    	}
                String NAME = Constans.CONFIG_NAME;
		String fileSt = path+"/"+Constans.PROPERTIES+NAME;
		
                System.out.println("________init was_____________");
                System.out.println(fileSt);
		FileInputStream fileInput = null;
		try {
			map = new HashMap<String, String>();
			
                        System.out.println("Iniciando Lectura de Archivo de Configuracion "+ fileSt);
			fileInput = new FileInputStream(fileSt);
			Properties properties = new Properties();
			properties.load(fileInput);
			Iterator ite = properties.keySet().iterator();
			while (ite.hasNext()) {
				String key = (String) ite.next();
				String value = (String) properties.get(key);
				
                                System.out.println("_key:" + key + " value:" + value);
				map.put(key, value);
			}
		} catch (Exception e) {
			
                        System.out.println("Error Configuracion Lectura de Archivo de Configuracion ["+ fileSt + "].");
                        
			e.printStackTrace();

		} finally {
			if (fileInput != null) {
				try {
					fileInput.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
