package com.syntax.class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class excelDemo {

    public static void main(String[] args) throws IOException {


    String path = "C:\\Users\\apmcm\\OneDrive\\Documents\\test.xlsx";
    FileInputStream fileInputStream = new FileInputStream(path);
    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.getRow(1);
}
}