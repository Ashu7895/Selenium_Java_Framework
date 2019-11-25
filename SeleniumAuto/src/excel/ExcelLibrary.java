package excel;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelLibrary {
	
	Workbook workbook = null;
	
	/*
	 * Creating Constructor for Excel Library class 
	 */
	public ExcelLibrary(String path)
	{
		try {
			workbook = Workbook.getWorkbook(new File(path));
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * Method to fetch celll value in Excel Sheet
	 * @param colNumber : get the Column Number of Sheet
	 * @param rowNumber : get the Row Number of Sheet 
	 */
	public String getCellValue(int colNumber, int rowNumber)
	{
		return workbook.getSheet(0).getCell(colNumber, rowNumber).getContents();
	}
}
