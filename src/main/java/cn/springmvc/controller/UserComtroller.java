package cn.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
 
@Controller
@RequestMapping("/")
public class UserComtroller {
	
	@Autowired
	private UserService userService;
	private User user;
 
 	@RequestMapping("index")
    public String index(){
 		user = userService.selectByPrimaryKey(null);
        return "index";
    }	
}