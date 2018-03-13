package com.uninsured.rest.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uninsured.data.entity.User;
import com.uninsured.rest.repository.UserRepository;


@RestController
public class UserRestController {
	
	private static final Logger LOGGER = Logger.getLogger(UserRestController.class);
	
	
	
	@Autowired
	UserRepository userRepository;
	

	@RequestMapping(value = "/users", method = RequestMethod.GET,produces="application/json") 	
    public @ResponseBody  String  getAllUsers() throws JsonProcessingException
    {
	   LOGGER.info("getAllUsers() ...");	 
	   String allUsersListJson= StringUtils.EMPTY;
	  
	   if(StringUtils.isBlank(allUsersListJson)){		   
		   List<User> userList = userRepository.getAllUsersList();   
		   ObjectMapper mapper = new ObjectMapper();       
		   allUsersListJson =  mapper.writeValueAsString(userList);	       
		   
	   } 	 
	   return allUsersListJson;       
    } 
	
	@RequestMapping(value = "/searchcounty/{County}", method = RequestMethod.GET,produces="application/json") 	
    public @ResponseBody  String  searchCounty(@PathVariable("County") String County) throws JsonProcessingException
    {
	   LOGGER.info("search county ...");
	   List<User> tutor = userRepository.searchCounty(County);   
       ObjectMapper mapper = new ObjectMapper();
       return  mapper.writeValueAsString(tutor);     
      
    }
	
	@RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.GET,produces="application/json") 	
    public @ResponseBody  String  login(@PathVariable("username") String username,@PathVariable("password") String password) throws JsonProcessingException
    {
	   LOGGER.info("loginning as ..."+"------"+username);
       Boolean isLogin = userRepository.Login(username, password);   
       ObjectMapper mapper = new ObjectMapper();
       return  mapper.writeValueAsString(isLogin);     
     
    }
	
}
