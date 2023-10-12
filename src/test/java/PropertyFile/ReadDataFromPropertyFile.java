package PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		//Step1: Takke the property file path
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\CommonData.properties");
		
		//s2: create object for property file
		Properties p = new Properties();
		
		//s3: load the file into object of properties
		p.load(fis);
		
		//s4: get the value of property file based on KEY
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
