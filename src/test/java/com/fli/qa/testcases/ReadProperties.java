package com.fli.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) {
try {
			
			System.out.println("<----------browser----------------->");
			
			Properties prop = new Properties();
			/*FileInputStream ip = new FileInputStream(
					System.getProperty("C:/Users/ssundaram/eclipse-workspace/SelSessions/src/main/"
							+ "java/com/fli/qa/config/config.properties"));*/
			
			FileInputStream ip = new FileInputStream(
			"C:\\Users\\ssundaram\\eclipse-workspace\\SelSessions\\src\\main\\java\\com\\fli\\qa\\config\\config.properties");
			prop.load(ip);
			
			System.out.println("<----------browser Name ----------------->"+prop.getProperty("browser"));
			}
		catch(FileNotFoundException e){
			e.printStackTrace();
			}
		catch(IOException e) {
			e.printStackTrace();
		}
		}

	}


