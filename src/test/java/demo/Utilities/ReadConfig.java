package demo.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.collections4.set.AbstractSortedSetDecorator;

public class ReadConfig 
{
Properties pro;
public ReadConfig()
{
	File src= new File("./Configuration_Files/config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro= new Properties();
		pro.load(fis);
		
	}
catch(Exception e)
	{
	System.out.println("Exception is "); 
	}
	
}
}
