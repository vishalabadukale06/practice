package Selenium;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	XSSFWorkbook workbook;

	public ExcelReader(String path) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		workbook = new XSSFWorkbook(fis);
	}

	public int getRowCount(int sheetIndex) {

		XSSFSheet sheet = workbook.getSheetAt(sheetIndex);

		return sheet.getLastRowNum() + 1;
	}

	public int getCellCount(int sheetIndex) {

		XSSFSheet sheet = workbook.getSheetAt(sheetIndex);

		return sheet.getRow(0).getLastCellNum();
	}

	public Object getSpecificCellData(int sheetIndex, int row, int cell) {

		XSSFSheet sheet = workbook.getSheetAt(sheetIndex);

		XSSFCell cells = sheet.getRow(row).getCell(cell);

		if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {

			return cells.getStringCellValue();
		}

		else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

			return cells.getRawValue();
		}

		else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {

			return cells.getBooleanCellValue();
		}

		else if (cells.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {

			return cells.getCellFormula();
		}

		else {

			return cells.getErrorCellValue();
		}
	}

	public Object[][] getAllSheetData(int sheetIndex) {

		int row = getRowCount(sheetIndex);

		int cell = getCellCount(sheetIndex);

		Object[][] data = new Object[row][cell];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < cell; j++) {

				data[i][j] = getSpecificCellData(sheetIndex, i, j);

			}
		}

		return data;
	}

}
