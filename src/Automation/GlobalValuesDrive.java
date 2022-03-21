package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop=new Properties();    //in order to utilise methods of properties class we want to create object of properties class
		FileInputStream fis=new FileInputStream("E:\\Automation\\workspace\\Automation\\src\\data.properties");    //to provide knowledge where file is present we want to create obj of class fileinputstream
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        
        prop.setProperty("browser", "edge");
        FileOutputStream fos=new FileOutputStream(("E:\\Automation\\workspace\\Automation\\src\\data.properties"));
        prop.store(fos, "sakshi");
	}

}
