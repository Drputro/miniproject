package com.eksad.miniproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.service.Tags;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

@EnableSwagger2
@Configuration
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
	
	@Bean
	public Docket eksadAPI() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.eksad.miniproject"))
				.paths(regex("/api.*")) //Scanning path dengan prefix/basepath yang diawali oleh '/api'
				.build()
				.apiInfo(metaInfo()) //Assign metaInfo
				.tags(
					new Tag("Employee","Brand Managament API"),
					new Tag("Get Data API",""),
					new Tag("Data Manipulation API","")
						);
	}
	//pembuatan metaInfo untuk apiInfo
	private ApiInfo metaInfo() {
		ApiInfo apiInfo= new ApiInfo(
				"Mini Project Data Employee REST API",//judul API
				"Rest API Collection for Mini Project Data Employee",//deskripsi API
				"1.0.0", //version API
				"http://google.com", //Term & service URL
				new Contact("Dani","https://www.instagram.com/dr_putro/","daniriyanto07042013@gmail.com"), //Contact information
				"Dani 2.0", //license name
				"http://www.google.com/license", //license URL
				Collections.emptyList());
		
		return apiInfo;
	}

}
