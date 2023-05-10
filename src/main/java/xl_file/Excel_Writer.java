package xl_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import properties.Configuration_Reader;
import properties.Properties_Writer;

public class Excel_Writer {

	static Workbook workbook;

	static Sheet createSheet;

	static String path;

	static FileInputStream fs;

	public static Excel_Writer exWrite;

	public Excel_Writer() throws IOException {

		path = System.getProperty("user.dir") + Configuration_Reader.getCR().getFRM().getGDIN_FilePath();

		fs = new FileInputStream(path);

		workbook = new XSSFWorkbook(fs);
	}

	public static Excel_Writer getExcel_Writer() throws IOException {

		exWrite = new Excel_Writer();
		return exWrite;
	}

//	public void createRow(int a, int b, String value) {
//
//		workbook.getSheet("template").createRow(a).createCell(b).setCellValue(value);
//	}

	public void getRow(int a, int b, String value) {

		workbook.getSheet("template").getRow(a).getCell(b).setCellValue(value);
	}

	public void setExcelDC_Supplier() throws IOException, ConfigurationException {

		getRow(1, 0, Configuration_Reader.getCR().getFRM().getDC());
		getRow(2, 0, Configuration_Reader.getCR().getFRM().getDC());
		getRow(3, 0, Configuration_Reader.getCR().getFRM().getDC());

		getRow(1, 1, Configuration_Reader.getCR().getFRM().getSupplierId());
		getRow(2, 1, Configuration_Reader.getCR().getFRM().getSupplierId());
		getRow(3, 1, Configuration_Reader.getCR().getFRM().getSupplierId());

		Properties_Writer.getProperties_Writer().setSupplierInvoicNo();

		getRow(1, 2, Configuration_Reader.getCR().getFRM().getSupplierInvoicNo());
		getRow(2, 2, Configuration_Reader.getCR().getFRM().getSupplierInvoicNo());
		getRow(3, 2, Configuration_Reader.getCR().getFRM().getSupplierInvoicNo());

//		Properties_Writer.getProperties_Writer().setDate();
//		
//		getRow(1, 3, Configuration_Reader.getCR().getFRM().getDate());
//		getRow(2, 3, Configuration_Reader.getCR().getFRM().getDate());
//		getRow(3, 3, Configuration_Reader.getCR().getFRM().getDate());

		getfileWrite();
	}

	public static void getfileWrite() throws IOException {

		FileOutputStream fileWrite = new FileOutputStream(path);

		workbook.write(fileWrite);

//		fs.close();
//		fileWrite.close();
//		workbook.close();

	}
}
