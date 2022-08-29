package com.example.springBoot;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@SpringBootApplication
public class Application {

	@RequestMapping
	public String index() {
		return "<h1>hello world !</h1>";
	}
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
//		ObjectMapper mymapper = new ObjectMapper();
//		
//		Student student;
//		try {
//			student = mymapper.readValue(new File("data/sample.json"), Student.class);
//			System.out.println(student.getName());
//			System.out.println(student.getAddress().getCity());
//			System.out.println(student.getAddress());
//			System.out.println(student.getNicknames());
//			System.out.println(student.getNicknames()[0]);
//			
//			Address studentAddress = student.getAddress();
//			System.out.println(studentAddress.getCity());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
		
	}

}
