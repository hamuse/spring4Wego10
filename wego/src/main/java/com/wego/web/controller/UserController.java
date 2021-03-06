package com.wego.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wego.web.domains.UserDTO;
import com.wego.web.serviceimpl.UserServiceImpl;

@Controller

@RequestMapping("/user/*")    //
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
  @Autowired Map<String, Object>map;
  @Autowired UserDTO user;
  @Autowired UserServiceImpl userServiceImpl;
    
    @PostMapping("/join")    //
    public @ResponseBody Map<?,?> join(@RequestBody UserDTO param) {   
    	logger.info("aaaa");
        HashMap<String, Object> map = new HashMap<>();
        logger.info("AJAX가 보낸 아이디와 비번 {} ", param.getUid() + ", " + param.getPwd());
        map.put("uid", param.getUid());
        map.put("pwd", param.getPwd());
       userServiceImpl.join(param);
        logger.info("map에 담긴 아이디와 비번 {} ", map.get("uid") + ", " + map.get("pwd"));
        return map;
    }
    
    @PostMapping("/login")
    public @ResponseBody UserDTO login(@RequestBody UserDTO param){
    	System.out.println("로그인 컨트롤러");
    	logger.info("login 성공 서블user Controller");
    user.setUid(param.getUid());
    user.setPwd(param.getPwd());
    param= userServiceImpl.login(param);
      logger.info("AJAX가 보낸 로그인 아이디와 비번{}",param.toString());
      
    	return param;
    }
    
}