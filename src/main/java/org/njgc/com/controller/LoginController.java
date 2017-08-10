package org.njgc.com.controller;

import javax.annotation.Resource;

import org.njgc.com.bean.Login;
import org.njgc.com.service.DbService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	//����bean������ȥƥ��
			@Resource
			private DbService dbService;//�˴���dbService����Ҫƥ���bean������
			
			public void setDbService(DbService dbService) {
				this.dbService = dbService;
			}
	
	   @RequestMapping()
	   public String login(@RequestParam("username") String username,@RequestParam("username") String password,ModelMap model){		
				
	    Login login=new Login();
		
		login.setLoginName(username);
		login.setLoginPassword(password);
		
		if(dbService.getLoginResult(login)==0){
			model.addAttribute("msg", "�û������������");
			return "login";
		}
		else
		{
			return "welcome";
		}
	}
}
