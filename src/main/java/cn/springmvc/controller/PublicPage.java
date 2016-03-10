package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/")
public class PublicPage {
	
	
	 	  @RequestMapping("PublicPage")
	 	    public String getPage(@PathVariable String key){
	 	    	if(key == "left"){
	 	    		return "gallerry";
	 	    	}
	 	    	return "";
	 	    }
	 	     
}
