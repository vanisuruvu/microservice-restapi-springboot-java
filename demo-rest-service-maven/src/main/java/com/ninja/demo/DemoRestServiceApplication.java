/* package com.numpyninja.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRestServiceMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestServiceMavenApplication.class, args);
	}

}
*/

package com.ninja.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication 
//@ComponentScan({ "com.numpyninja.demo.controller, com.ninja.demo.entity, com.ninja.demo.jpa" })
@ComponentScan(basePackages="com.ninja.demo")
//@EnableSwagger2
@Configuration
@EnableWebMvc
public class DemoRestServiceApplication {


 public static void main(String[] args) {
 SpringApplication.run(DemoRestServiceApplication.class, args);
 }
 
 @Bean
   public Docket demoApi() {
  return new Docket(DocumentationType.SWAGGER_2).select()
		  .apis(RequestHandlerSelectors.basePackage("com.ninja.demo")).build();
   }
 
}