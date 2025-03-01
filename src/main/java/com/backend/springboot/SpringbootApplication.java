package com.backend.springboot;

import com.backend.springboot.component.DemoBean;
import com.backend.springboot.component.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");

		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		String[] beanNames = context.getBeanNamesForType(DemoBean.class);
		boolean containsBean = beanNames.length > 0;

		logger.debug("Checking Context: {} ", containsBean);

		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.displayEmployeeInfo();

		logger.debug("**** Example Using @Autowire annotation on property ****");
	}
}
