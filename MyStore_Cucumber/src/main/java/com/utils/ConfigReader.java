package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;

	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\Asus\\eclipse-workspace\\MyStore_Cucumber\\src\\test\\resources\\config\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
