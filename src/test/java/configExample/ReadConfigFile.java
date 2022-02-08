package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream(".\\data.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("password"));
		

	}

}
