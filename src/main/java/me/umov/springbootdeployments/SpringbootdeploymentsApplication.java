package me.umov.springbootdeployments;

import me.umov.springbootdeployments.controller.BookController;
import me.umov.springbootdeployments.controller.StatusController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@SpringBootApplication
@Import({ BookController.class, StatusController.class})
public class SpringbootdeploymentsApplication {

	@Bean
	public HandlerMapping handlerMapping() {
		return new RequestMappingHandlerMapping();
	}

	@Bean
	public HandlerAdapter handlerAdapter() {
		return new RequestMappingHandlerAdapter();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdeploymentsApplication.class, args);
	}

}
