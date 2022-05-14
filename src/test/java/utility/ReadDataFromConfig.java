package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromConfig {
public static void main(String[] args) throws IOException  {
//	Properties prop=new Properties();
//	String path=System.getProperty("user.dir")+"\\config.properties";
//	FileInputStream fis= new FileInputStream (path);
//	prop.load(fis);
//	String value=prop.getProperty("testsiteurl");
//	System.out.println(value);
	System.out.println(getPropData("username"));
}
public static String getPropData(String key) throws IOException
{
	Properties prop=new Properties();
	String path=System.getProperty("user.dir")+"\\config.properties";
	FileInputStream fis= new FileInputStream (path);
	prop.load(fis);
	
	String value=prop.getProperty(key);

	return value;

	
}

}
