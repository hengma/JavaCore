package com.mao.test.javacore.ResourceBundle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String arg[]) {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("com.mao.test.javacore.ResourceBundle.MyResources");
		Enumeration<String> keys = resourceBundle.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = resourceBundle.getString(key);
			System.out.println(key + ": " + value);
		}
		
		resourceBundle = ResourceBundle.getBundle("com.mao.test.javacore.ResourceBundle.MyResources_de");
		keys = resourceBundle.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = resourceBundle.getString(key);
			System.out.println(key + ": " + value);
		}
		
		
		resourceBundle = ResourceBundle.getBundle("com.mao.test.javacore.ResourceBundle.mybundle");
		keys = resourceBundle.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = resourceBundle.getString(key);
			System.out.println(key + ": " + value);
		}

		
		
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
		System.out.println(DATE_FORMAT.format(new Date()));
	}
}
