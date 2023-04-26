package com.SignupFormJenkins;

import com.SignupFormJenkins.DAO.EmpDao;
import com.SignupFormJenkins.Entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SignupFormJenkinsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SignupFormJenkinsApplication.class, args);

	}

}
