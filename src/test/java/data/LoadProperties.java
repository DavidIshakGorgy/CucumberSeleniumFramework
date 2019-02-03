package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

	public static Properties userData = loadProperties(
			System.getProperty("user.dir")+"\\src\\test\\java\\properties\\userdata.properties");
	
	private static Properties loadProperties(String Path) {
		Properties pro = new Properties();
		//Stream for reading file
		FileInputStream stream;
		try {
			stream = new FileInputStream(Path);
			pro.load(stream);
		} catch (FileNotFoundException e) {
			System.out.println("Error occured: "+ e.getMessage());
		} catch (IOException e) {
			System.out.println("Error occured: "+ e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Error occured: "+ e.getMessage());
		}
		return pro;
	}
	
	
}
