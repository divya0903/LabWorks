package com.cg.product.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Method: Main method
 * @author gudivya
 * Date of creation:08/08/2018
 */

@SpringBootApplication
@EnableJpaRepositories("com.cg.product.dao")
@ComponentScan("com.cg.product")
@EntityScan("com.cg.product.bean")
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
}
