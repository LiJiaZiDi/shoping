package com.shop.wg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.shop.service.entity.UserEntity;
/**
 * @author xhh
 */
@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping(value = "/test1")
	public @ResponseBody UserEntity test1(UserEntity userEntity) {
		System.out.println(JSON.toJSONString(userEntity));
		return userEntity;
	}
	@RequestMapping(value = "/test2")
	public @ResponseBody UserEntity test2(Integer userId) {
		System.out.println("test2 param ===>"+userId);
		UserEntity user = new UserEntity();
		user.setUserId(23);
		return user;
	}

}
