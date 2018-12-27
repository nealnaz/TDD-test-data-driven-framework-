package com.Config.pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Propertiesclass {

	public static void main(String[] args) throws IOException{
 
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		FileInputStream ip= new FileInputStream("C:\\Users\\zubair\\eclipse-workspace\\Com.freecrm\\src\\main\\java\\"
				+ "com\\Config\\pkg\\config.prop.Textfile");
		prop.load(ip);
		
		System.out.println(prop.getProperty("Browser"));

	}

	

	}

