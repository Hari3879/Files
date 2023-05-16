package com.ojas.spring.controller;

import com.ojas.spring.service.ExcelReportGenerationService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ExcelReportGenerationController {
	@Autowired
    ExcelReportGenerationService excelReportGenerationService;

    @GetMapping("/excelReportGeneration")
    public void excelReportGeneration(HttpServletResponse response) throws IOException {
        excelReportGenerationService.downloadTemplate(response);
}
}