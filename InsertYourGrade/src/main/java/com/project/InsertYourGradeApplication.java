package com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

import com.project.excel.ReadExcel;
import com.project.model.SubjectVO;

@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
public class InsertYourGradeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(InsertYourGradeApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		
		ReadExcel readExcel = new ReadExcel("C:/Users/Owner/Desktop/InsertYourGrade.xlsx");
		
	}

}
