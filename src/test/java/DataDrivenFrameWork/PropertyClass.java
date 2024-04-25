package DataDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {
	public static String getProperty(String key) throws IOException {
		Properties prop = new Properties();
		String propertyLocation = "\\resources.properties";
		File file = new File(System.getProperty("user.dir")+propertyLocation);
		FileInputStream stream = new FileInputStream(file);
		prop.load(stream);
		String object = (String) prop.get(key);
		
		return object;
	}

}
