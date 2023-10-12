package PropertyFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataIntoPropertyFile 
{
public static void main(String[] args) throws IOException 
	{
		//Step1: create object of property file
		Properties p = new Properties();
		
		//Step2: Provide keys and value details
		p.setProperty("browser", "Edge");
		p.setProperty("username" , "admin");
		
		//Strp3: Path for PROPERTYfILe
		FileOutputStream fos = new FileOutputStream(".\\src\\main\\resources\\WriteDataIntoPropertyFile.properties");
	
		p.store(fos, "Common Data File");
	}
}
