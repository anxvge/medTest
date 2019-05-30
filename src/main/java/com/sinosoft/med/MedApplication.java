package com.sinosoft.med;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sinosoft.med.mapper")
public class MedApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedApplication.class, args);
	}

}
