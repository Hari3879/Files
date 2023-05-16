package com.ojas.springboot.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lowagie.text.DocumentException;
import com.ojas.springboot.model.Product;
import com.ojas.springboot.service.ProductServiceImpl;
import com.ojas.springboot.util.ExcelGenerator;
import com.ojas.springboot.util.PdfGenerator;

@Controller

public class ProductController {
	@Autowired
	private ProductServiceImpl service;

	@RequestMapping(value = { "/", "/loadForm" })
	public String loadForm(Model model) {
		Product p = new Product();
		model.addAttribute("product", p);

		return "addProduct";

	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String handleAddProduct(@Valid @ModelAttribute("product") Product product, BindingResult br, Model model) {
		if (br.hasErrors())
			return "addProduct";
		boolean saveProduct = service.saveProduct(product);
		String msg = "";
		if (saveProduct) {
			msg = "prduct added successfully";

		} else {
			msg = "product is not added ................";
		}
		model.addAttribute("msg", msg);
		return "redirect:/viewProducts";
	}

	@RequestMapping(value = "/viewProducts")
	public String viewAllProducts(Model model) {
		List<Product> allproducts = service.getAllProducts();
		/*
		 * for (Product pe : allproducts) { System.out.println(pe.getpId() + " \t" +
		 * pe.getpName()); }
		 */
		model.addAttribute("pro", allproducts);
		return "viewProducts";
	}

	@RequestMapping(value = "/editProduct/{pId}")
	public String edit(@PathVariable("pId") Integer pId, Model model) {

		Product product = service.getProductById(pId);

		model.addAttribute("product", product);

		return "editProduct";
	}

	@RequestMapping(value = "/editProduct", method = RequestMethod.POST)
	public String editSave(@ModelAttribute Product product, Model model) {
		boolean isSaved = service.saveProduct(product);

		String msg = "";
		if (isSaved) {
			msg = "Product Updated SuccessFully";
		} else {
			msg = "Failed to updated Record";
		}
		model.addAttribute("msg", msg);
		return "redirect:/viewProducts";
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("pId") Integer pId) {
		service.deleteProduct(pId);

	}

	@GetMapping("/excel")
	public void exportIntoExcelFile(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String currentDateTime = dateFormatter.format(new Date(0));

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=product" + currentDateTime + ".xlsx";
		response.setHeader(headerKey, headerValue);

		List<Product> listOfProducts = service.getAllProducts();
		ExcelGenerator generator = new ExcelGenerator(listOfProducts);
		generator.generateExcelFile(response);
	}

	@GetMapping("/pdf")
	public void generatePdfFile(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
		String currentDateTime = dateFormat.format(new Date(0));
		String headerkey = "Content-Disposition";
		String headervalue = "attachment; filename=product" + currentDateTime + ".pdf";
		response.setHeader(headerkey, headervalue);
		List<Product> listofStudents = service.getAllProducts();
		PdfGenerator generator = new PdfGenerator();
		generator.generate(listofStudents, response);
	}
}
