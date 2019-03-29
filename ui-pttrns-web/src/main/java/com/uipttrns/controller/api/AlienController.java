package com.uipttrns.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ui_pttrns.model.Alien;
import com.uipttrns.generic.dao.AlienRepoDao;

@Controller
public class AlienController {
	
	@Autowired	//9.
	AlienRepoDao<Alien> alienRepoDao; //8.
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		
		System.out.println(alien);
		alienRepoDao.save(alien); //10.
		System.out.println(alien);
		return "home.jsp";
	}

}