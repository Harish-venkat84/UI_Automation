package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Properties_Writer {

	static Configuration config;
	static FileBasedConfigurationBuilder<FileBasedConfiguration> builder;
	static Properties properties;
	static String GST_Final;
	static String PAN_Final;
	static String path;
	static String supplierName;
	static String shotName;
	static String address;

	static InputStream input;

	public static Properties_Writer write;

	public void gst() throws IOException, ConfigurationException {

		String gst = Configuration_Reader.getCR().getFRM().getGST();
		int parseInt = Integer.parseInt(gst.substring(7, 11));
		parseInt = parseInt + 1;

		GST_Final = gst.substring(0, 7) + parseInt + gst.substring(11, 15);

		PAN_Final = GST_Final.substring(2, 12);
		getProperties_Writer().gst_Pan(GST_Final, PAN_Final);
	}

	public void newName() throws IOException, ConfigurationException {

		String name1 = RandomStringUtils.randomAlphabetic(6);
		String name2 = RandomStringUtils.randomAlphabetic(6);

		String name = name1 + " " + name2;
		shotName = name.toUpperCase();
		supplierName = name.toUpperCase() + " " + "PRIVATE LIMITED";

		if (!Configuration_Reader.getCR().getFRM().getSupplierName().equals(supplierName)
				&& !Configuration_Reader.getCR().getFRM().getSupplierShortname().equals(shotName)) {
			Properties_Writer.getProperties_Writer().setSupplierNameAndShortName(supplierName, shotName);
		}
	}

	public static Properties_Writer getProperties_Writer() throws IOException, ConfigurationException {

		if (write == null) {

			write = new Properties_Writer();
		}
		return write;
	}

	public Properties_Writer() throws IOException, ConfigurationException {

		path = FileReaderManager.Readpath;
		FileInputStream in = new FileInputStream(path);
		properties = new Properties();
		properties.load(in);
		in.close();

		Parameters params = new Parameters();
		builder = new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
				.configure(params.properties().setFileName(path));
		config = builder.getConfiguration();

	}

	public void setSupplierNameAndShortName(String name, String ShortName) throws ConfigurationException {

		config.setProperty("SupplierName", name);
		config.setProperty("SupplierShortname", ShortName);
		builder.save();
	}

	public void setPan_ContactName() throws ConfigurationException {

		config.setProperty("panName", shotName);
		config.setProperty("ContectName", shotName);
		builder.save();
	}

	public void setNewEmail() throws ConfigurationException {

		config.setProperty("Email", shotName.replaceAll(" ", "").toLowerCase() + "@gmail.com");
		builder.save();
	}

	public void setAddress() throws ConfigurationException {

		int nextInt = RandomUtils.nextInt(1, 99);
		String random = RandomStringUtils.randomAlphabetic(5);
		String random2 = RandomStringUtils.randomAlphabetic(6);
		String random3 = RandomStringUtils.randomAlphabetic(8);

		address = nextInt + " " + random + " " + random2 + " " + random3;

		config.setProperty("Address", address);
		builder.save();
	}

	public void gst_Pan(String GSTIN, String pan) throws ConfigurationException, IOException {

		config.setProperty("GSTIN", GSTIN);
		config.setProperty("Pan", pan);
		builder.save();
	}

	public void setSupplierID(String id) throws ConfigurationException, IOException {

		config.setProperty("SupplierId", id);
		builder.save();
	}

	public void setBeneficiaryName() throws ConfigurationException {

		config.setProperty("BeneficiaryName", shotName);
		builder.save();
	}

	public void setBeneficiaryAddress() throws ConfigurationException {

		config.setProperty("BeneficiaryAddress", address + " " + "Chennai, Tamil Nadu 600014");
		builder.save();
	}

	public void setSupplierInvoicNo() throws IOException, ConfigurationException {

		String supplierInvoicNo = Configuration_Reader.getCR().getFRM().getSupplierInvoicNo();
		int adding = Integer.parseInt(supplierInvoicNo.substring(6, 14)) + 1;
		String newSuplierInvoicNo = supplierInvoicNo.subSequence(0, 6) + Integer.toString(adding);
		
		config.setProperty("SupplierInvoicNo", newSuplierInvoicNo);
		builder.save();
	}

//	public void setDate() throws ConfigurationException {
//
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		LocalDateTime now = LocalDateTime.now();
//		String date = dtf.format(now).toString();
//		config.setProperty("Date", date);
//		builder.save();
//	}

	public void setsupplierBillAmt(String calculatedAmt) throws ConfigurationException {

		config.setProperty("supplierBillAmt", calculatedAmt);
		builder.save();
	}

	public void setsupplierTxnId(String supplierTxnId) throws ConfigurationException {

		config.setProperty("SupplierTxnId", supplierTxnId);
		builder.save();
	}

	public String changingOrderRefNumber() throws IOException, ConfigurationException {

		String orderRef = Configuration_Reader.getCR().getFRM().getOrderRef();

		int parseInt = Integer.parseInt(orderRef);

		parseInt = parseInt + 1;

		orderRef = Integer.toString(parseInt);

		config.setProperty("OrderRef", orderRef);
		builder.save();

		return orderRef;
	}

	public void setPurchesOrderID(String supplierTxnId) throws ConfigurationException {

		config.setProperty("PurchesOrderID", supplierTxnId);
		builder.save();
	}
	
	public void setReturnQty(String ReturnQty) throws ConfigurationException {

		config.setProperty("ReturnQty", ReturnQty);
		builder.save();
	}

}
