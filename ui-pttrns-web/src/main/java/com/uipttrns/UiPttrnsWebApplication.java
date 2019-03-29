package com.uipttrns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.uipttrns.controller.api.AlienController;
import com.uipttrns.generic.dao.AlienRepoDao;

@SpringBootApplication
@EntityScan(basePackages = {"com.ui_pttrns.model"})
//@Import(AlienRepoDao.class)
//@ComponentScan(basePackages = {"com.uipttrns.controller.api","com.uipttrns.generic.dao.AlienRepoDao"})
//@ComponentScan(basePackages = {"com.uipttrns.generic.dao"})
//@ComponentScan(basePackages = {"com"})
@ComponentScan(basePackageClasses = {AlienController.class, AlienRepoDao.class})
//@EnableJpaRepositories(basePackages = {"com.uipttrns.generic.dao"})
//@EnableJpaRepositories(basePackageClasses=AlienRepoDao.class)
@EnableJpaRepositories(basePackageClasses = {AlienRepoDao.class})
public class UiPttrnsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiPttrnsWebApplication.class, args);
		
		
	}

}
