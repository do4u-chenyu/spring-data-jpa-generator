package com.yuchu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yuchu.dao")
public class CrudGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudGeneratorApplication.class, args);
	}
}
