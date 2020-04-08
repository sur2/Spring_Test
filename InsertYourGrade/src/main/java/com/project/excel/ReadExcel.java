package com.project.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.project.model.SubjectVO;

public class ReadExcel {

	private static File xlsx;
	private static XSSFWorkbook xssfWorkbook;
	private static XSSFSheet xssfSheet;

	public ReadExcel(String uri) {
		this.xlsx = new File(uri);

		try {
			// .xlsx 파일 탐색
			this.xssfWorkbook = new XSSFWorkbook(new FileInputStream(xlsx));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 첫 번째 sheet 탐색
		xssfSheet = xssfWorkbook.getSheetAt(0);

		System.out.println("ROW :: " + xssfSheet.getPhysicalNumberOfRows());
		System.out.println("CELL :: " + xssfSheet.getRow(0).getPhysicalNumberOfCells());

	}

	public List<SubjectVO> items(SubjectVO subject) {

		List<SubjectVO> list = new LinkedList<>();

		int rowIndex = 0;
		int cellIndex = 0;
		for (Row row : xssfSheet) {
			rowIndex++;
			for (Cell cell : row) {
				cellIndex++;
			
				if (rowIndex > 0 && cellIndex > 0) {
					
				}
				list.add(subject);
			}
		}
		return list;
	}

}
