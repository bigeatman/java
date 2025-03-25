package dev.java.practice.ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public PropertiesExample() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("/database.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path, "UTF-8");
		System.out.println(path);
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
}
