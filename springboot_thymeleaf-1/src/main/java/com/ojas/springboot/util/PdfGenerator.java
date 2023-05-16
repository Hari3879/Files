package com.ojas.springboot.util;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.ojas.springboot.model.Product;


/*
 
  We can create a document by the defining page size of the document through the Document class.

→ We are getting a PdfWriter instance by providing the created document and OutputStream.

→ Creating paragraphs, tables, headings etc.
 
 
 */
public class PdfGenerator {
	public void generate(List<Product> productList, HttpServletResponse response) throws DocumentException, IOException {
	    // Creating the Object of Document
	    Document document = (Document) new com.lowagie.text.Document(PageSize.A4);
	    // Getting instance of PdfWriter
	    PdfWriter.getInstance((com.lowagie.text.Document) document, response.getOutputStream());
	    // Opening the created document to change it
	    ((PdfWriter) document).open();
	    // Creating font
	    // Setting font style and size
	    Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	    fontTiltle.setSize(20);
	    // Creating paragraph
	    Paragraph paragraph1 = new Paragraph("List of the Products", fontTiltle);
	    // Aligning the paragraph in the document
	    paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
	    // Adding the created paragraph in the document
	    ((Paragraph) document).add(paragraph1);
	    // Creating a table of the 4 columns
	    PdfPTable table = new PdfPTable(4);
	    // Setting width of the table, its columns and spacing
	    table.setWidthPercentage(100f);
	    table.setWidths(new int[] {3,3,3,3});
	    table.setSpacingBefore(5);
	    // Create Table Cells for the table header
	    PdfPCell cell = new PdfPCell();
	    // Setting the background color and padding of the table cell
	    cell.setBackgroundColor(CMYKColor.BLUE);
	    cell.setPadding(5);
	    // Creating font
	    // Setting font style and size
	    Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	    font.setColor(CMYKColor.WHITE);
	    // Adding headings in the created table cell or  header
	    // Adding Cell to table
	    cell.setPhrase(new Phrase("ID", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("Product Name", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("Product Price", font));
	    table.addCell(cell);
	    cell.setPhrase(new Phrase("Quantity", font));
	    table.addCell(cell);
	   
	    // Iterating the list of Employees
	    for (Product e: productList) {
	      // Adding Employee id
	      table.addCell(String.valueOf(e.getpId()));
	      // Adding Product name
	      table.addCell(String.valueOf((e.getpName())));
	      // Adding Employee Name
	      table.addCell(String.valueOf((e.getPrice())));
	      // Adding Employee salary
	      table.addCell(String.valueOf((e.getQty())));
	    }
	    // Adding the created table to the document
	    ((Paragraph) document).add(table);
	    // Closing the document
	    ((PdfWriter) document).close();
	  }
}