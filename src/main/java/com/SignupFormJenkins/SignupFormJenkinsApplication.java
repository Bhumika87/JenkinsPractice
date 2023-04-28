package com.SignupFormJenkins;

import com.SignupFormJenkins.DAO.EmpDao;
import com.SignupFormJenkins.Entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class SignupFormJenkinsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(SignupFormJenkinsApplication.class, args);

	}

}
