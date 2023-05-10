package xl_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File_Reader {

	public static Sheet sheetAt;

	public static Row row;

	public static Workbook workbook;

	public static Cell cell;

	public static CellType cellType;

	public static File filePath;

	public static FileInputStream fileReading;
	
	static int num;
	
	static String stringCellValue;

	public File_Reader() throws IOException {

		filePath = new File(System.getProperty("user.dir") + "/ImportGDN/Test_New_GDN.xlsx");

		fileReading = new FileInputStream(filePath);

		workbook = new XSSFWorkbook(fileReading);

		sheetAt = workbook.getSheet("template");
	}

	@SuppressWarnings("unused")
	public String cell_TypeFor_String(int rownum, int cellnum) throws IOException {
		
		row = sheetAt.getRow(rownum);

		cell = row.getCell(cellnum);

		cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			stringCellValue = cell.getStringCellValue();
			
		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			int num = (int) numericCellValue;
		}
		
		fileReading.close();
		
		return stringCellValue;
	}
	
	@SuppressWarnings("unused")
	public String cell_TypeFor_int(int rownum, int cellnum) throws IOException {
		
		row = sheetAt.getRow(rownum);

		cell = row.getCell(cellnum);

		cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			
		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();

			num = (int) numericCellValue;
			
		}
		
		fileReading.close();
		
		return Integer.toString(num);
	}

	public static File_Reader getFile_Reader() throws IOException {
		
		File_Reader object = new File_Reader();
		
		return object;
	}
	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println(getFile_Reader().cell_TypeFor_int(1, 6));
		
	}

}
