package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import base_class.Common_Methods;

public class FileReaderManager {

	public static Properties properties;
	static String path;
	public static InputStream input;
	static String Readpath;
	
	public static void propertyFilePath() {
		
		System.out.println("Please enter your own property file path (or) Press enter default property file path will be loaded automatically");

		Readpath = Common_Methods.scan();

		if (Readpath.contains(".Properties")) {
			
		} else {

			Readpath = System.getProperty("user.dir") + "/PropertiesFile/netmeds.Properties";
		}
	}

	public FileReaderManager() throws IOException {

		try {
			File file = new File(Readpath);
			FileInputStream fileinput = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileinput);

		} catch (Exception e) {
			
		}
	}

	public String getURL() {

		String url = properties.getProperty("URL");
		return url;
	}

	public String getUsername() {

		String username = properties.getProperty("Username");
		return username;
	}

	public String getPassword() {

		String password = properties.getProperty("Password");
		return password;
	}

	public String getGST() {

		String gst = properties.getProperty("GSTIN");
		return gst;
	}

	public String getPAN() {

		String pan = properties.getProperty("Pan");
		return pan;
	}

	public String getpropertiesFilePath() {

		String propertiesFilePath = properties.getProperty("PropertiesFilePath");
		return propertiesFilePath;
	}

	public String getSupplierName() {

		String SupplierName = properties.getProperty("SupplierName");
		return SupplierName;
	}

	public String getpanName() {

		String panName = properties.getProperty("panName");
		return panName;
	}

	public String getSupplierShortname() {

		String SupplierShortname = properties.getProperty("SupplierShortname");
		return SupplierShortname;
	}

	public String getContectName() {

		String ContectName = properties.getProperty("ContectName");
		return ContectName;
	}

	public String getAddress() {

		String Address = properties.getProperty("Address");
		return Address;
	}

	public String getCity() {

		String City = properties.getProperty("City");
		return City;
	}

	public String getPin() {

		String Pin = properties.getProperty("Pin");
		return Pin;
	}

	public String getMobileNo1() {

		String MobileNo1 = properties.getProperty("MobileNo1");
		return MobileNo1;
	}

	public String getEmail() {

		String Email = properties.getProperty("Email");
		return Email;
	}

	public String getSupplierId() {

		String SupplierId = properties.getProperty("SupplierId");
		return SupplierId;
	}

	public String getBeneficiaryName() {

		String BeneficiaryName = properties.getProperty("BeneficiaryName");
		return BeneficiaryName;
	}

	public String getACNumber() {

		String ACNumber = properties.getProperty("ACNumber");
		return ACNumber;
	}

	public String getACNumberReConfirm() {

		String ACNumberReConfirm = properties.getProperty("ACNumberReConfirm");
		return ACNumberReConfirm;
	}

	public String getBankName() {

		String BankName = properties.getProperty("BankName");
		return BankName;
	}

	public String getIFSCCode() {

		String IFSCCode = properties.getProperty("IFSCCode");
		return IFSCCode;
	}

	public String getACType() {

		String ACType = properties.getProperty("ACType");
		return ACType;
	}

	public String getBeneficiaryAddress() {

		String BeneficiaryAddress = properties.getProperty("BeneficiaryAddress");
		return BeneficiaryAddress;
	}

	public String getDC() {

		String DC = properties.getProperty("DC");
		return DC;
	}

	public String getGDIN_FilePath() {

		String gdn = properties.getProperty("GDN_File");
		return gdn;
	}

	public String getSupplierInvoicNo() {

		String invoicNo = properties.getProperty("SupplierInvoicNo");
		return invoicNo;
	}

	public String getDate() {

		String Date = properties.getProperty("Date");
		return Date;
	}

	public String getGDN_FileUploadPath() {

		String GDN_FileUploadPath = properties.getProperty("GDN_FileUploadPath");
		return GDN_FileUploadPath;
	}

	public String getsupplierBillAmt() {

		String supplierBillAmt = properties.getProperty("supplierBillAmt");
		return supplierBillAmt;
	}

	public String getSupplierSoftCopyPath() {

		String SupplierSoftCopy = properties.getProperty("SupplierSoftCopyPath");
		return SupplierSoftCopy;
	}

	public String getSupplierTxnID() {

		String supplierTnxID = properties.getProperty("SupplierTxnId");
		return supplierTnxID;
	}

	public String getBaseUrl() {

		String BaseUrl = properties.getProperty("BaseUrl");
		return BaseUrl;
	}

	public String getOrderRef() {

		String OrderRef = properties.getProperty("OrderRef");
		return OrderRef;
	}

	public String getPurchesOrderID() {

		String purchesOrder = properties.getProperty("PurchesOrderID");
		return purchesOrder;
	}

	public String getTag() {

		String tags = properties.getProperty("tags");
		return tags;
	}
	
	public String getReturnQty() {
		
		String returnQty = properties.getProperty("ReturnQty");
		
		return returnQty;
	}

}
