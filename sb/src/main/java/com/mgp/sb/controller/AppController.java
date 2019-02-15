package com.mgp.sb.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgp.sb.beans.User;
import com.mgp.sb.service.UserService;

@RestController  //这个注解默认这个文件返回的数据格式都是json
@RequestMapping("app")
public class AppController {
	
	@Autowired(required=false)@Qualifier("userService")
	private UserService userService;
	
   @RequestMapping("index")
   public Map<String,Object> getMap(){
	   Map<String,Object> map = new HashMap<String,Object>();
	   User user = new User();
	   user.setNickname("12");
	   user.setUsername("mgp");
	   //userService.insert(user);
	   userService.test(user);
	   map.put("1", "map");
	return map;
   }
   
   /*public static void main(String[] args){
	   SpringApplication.run(AppController.class, args);  //这个相当于程序入口
   }*/
}
