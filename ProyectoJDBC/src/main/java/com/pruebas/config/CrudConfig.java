package com.pruebas.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class CrudConfig {

final private static String PROPERTIES_PATH="C:\\Manuel\\RamonRepo\\bootcamp\\ProyectoJDBC\\src\\main\\resources\\application.properties";
	
	Properties prop = new Properties();
	
	public String getPropiedad(String propiedad) {
		
		String propreslut=null;
        try (InputStream input = new FileInputStream(PROPERTIES_PATH)) {

            
            // load a properties file
            prop.load(input);

            // get the property value of the argument
            propreslut = prop.getProperty(propiedad);
            

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return propreslut;
	}
	
	public void setPropiedad(String propiedad,String valor) {
	
		 try (OutputStream output = new FileOutputStream(PROPERTIES_PATH)) {
	
	         // set the properties value
	         prop.setProperty(propiedad, valor);
	
	         // save properties to project root folder
	         prop.store(output, null);
	
	         System.out.println(prop);
	
	     } catch (IOException io) {
	         io.printStackTrace();
	     }
	}
}
