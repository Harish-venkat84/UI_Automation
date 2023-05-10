package gst_pan;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

import properties.Configuration_Reader;

public class GSTIN_Pan_Number {

	static Properties properties;
	static String GST_Final;
	static String PAN_Final;
	static String path;
	
	//33AAHFV 5853 B1Z7

	public static void gst() throws IOException, ConfigurationException {

		path = System.getProperty("user.dir") + Configuration_Reader.getCR().getFRM().getpropertiesFilePath();

		String gst = Configuration_Reader.getCR().getFRM().getGST();

		int parseInt = Integer.parseInt(gst.substring(7, 11));

		parseInt = parseInt + 1;

		GST_Final = gst.substring(0, 7) + parseInt + gst.substring(11, 15);

		PAN_Final = GST_Final.substring(2, 12);

		write(GST_Final, PAN_Final);
	}

	public static void write(String GSTIN, String pan) throws IOException, ConfigurationException {

		FileInputStream in = new FileInputStream(path);

		properties = new Properties();

		properties.load(in);

		in.close();

		Parameters params = new Parameters();
		FileBasedConfigurationBuilder<FileBasedConfiguration> builder = new FileBasedConfigurationBuilder<FileBasedConfiguration>(
				PropertiesConfiguration.class).configure(params.properties().setFileName(path));
		Configuration config = builder.getConfiguration();

		config.setProperty("GSTIN", GSTIN);
		config.setProperty("Pan", pan);
		builder.save();
	}

}
