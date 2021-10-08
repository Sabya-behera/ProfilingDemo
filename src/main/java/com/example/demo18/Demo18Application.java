package com.example.demo18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class Demo18Application implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;
	public static void main(String[] args) {
		SpringApplication.run(Demo18Application.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception
	{
		System.out.println("DataSource= "+dataSource);
	}
}
