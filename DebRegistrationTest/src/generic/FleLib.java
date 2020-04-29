package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class FleLib 
{
	/**
	 * It is used to get the value of the passed key from the external properties file
	 * Properties file has common data which are common to each test script
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable
	{
	//Create instance of Input File Stream
	FileInputStream fis= new FileInputStream(".\\TestData\\RegistrationTestData.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String value=pobj.getProperty(key);
	
	return value;	
	}

}
