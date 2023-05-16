package com.ojas.springboot.util;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.lowagie.text.Cell;
import com.lowagie.text.Row;
import com.ojas.springboot.model.Product;


/*
 XSSFWorkbook is creating a Workbook that is our excel file.
We are creating an instance of XSSFWorkbook then we are calling the "createSheet()" method for creating an excel file with a name.
We are creating Rows and cells of an excel sheet.
After that we are writing data into the excel sheet. 
 */
public class ExcelGenerator {

	private List < Product > productList;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    public ExcelGenerator(List < Product > productList) {
        this.productList = productList;
        workbook = new XSSFWorkbook();
    }
    private void writeHeader() {
        sheet = workbook.createSheet("Product");
        XSSFRow row = sheet.createRow(0);
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
        createCell(row, 0, "ID", style);
        createCell(row, 1, "Product Name", style);
        createCell(row, 2, "Product Qty", style);
        createCell(row, 3, "Product Price.", style);
    }
    private void createCell(XSSFRow row, int columnCount, Object valueOfCell, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        XSSFCell cell = row.createCell(columnCount);
        if (valueOfCell instanceof Integer) {
            cell.setCellValue((Integer) valueOfCell);
        } else if (valueOfCell instanceof Long) {
            cell.setCellValue((Long) valueOfCell);
        } else if (valueOfCell instanceof String) {
            cell.setCellValue((String) valueOfCell);
        } else {
            cell.setCellValue((Boolean) valueOfCell);
        }
        cell.setCellStyle(style);
    }
    private void write() {
        int rowCount = 1;
        CellStyle style = workbook.createCellStyle();
          XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
        for (Product record: productList) {
            XSSFRow row = sheet.createRow(rowCount++);
            int columnCount = 0;
            createCell(row, columnCount++, record.getpId(), style);
            createCell(row, columnCount++, record.getpName(), style);
            createCell(row, columnCount++, record.getQty(), style);
            createCell(row, columnCount++, record.getPrice(), style);
        }
    }
    public void generateExcelFile(HttpServletResponse response) throws IOException {
        writeHeader();
        write();
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}


	