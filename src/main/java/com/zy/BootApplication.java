package com.zy;

import com.zy.bean.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
@SpringBootApplication
public class BootApplication {


	@RequestMapping("/")
	public String index(){
		return "spring boot application";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
