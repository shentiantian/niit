package org.njgc.com.controller;

import javax.annotation.Resource;

import org.njgc.com.bean.Login;
import org.njgc.com.service.DbService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterController {
	//����bean������ȥƥ��
	@Resource
	private DbService dbService;//�˴���dbService����Ҫƥ���bean������
	
	public void setDbService(DbService dbService) {
		this.dbService = dbService;
	}
	
	 @RequestMapping()
	 public String register(
			@RequestParam("usernamesignup") String usernamesignup,
			@RequestParam("passwordsignup") String passwordsignup,
			@RequestParam("passwordsignup_confirm") String passwordsignup_confirm,
			ModelMap model){
		 	
		 		if(!passwordsignup.equals(passwordsignup_confirm))
		 		{
		 			model.addAttribute("msg", "�����������벻һ��!");
		 			return "/register";		
		 		}
		 		else
		 		{
		 			Login login=new Login();
		 			login.setLoginName(usernamesignup);
		 			login.setLoginPassword(passwordsignup);
		 			if(dbService.insertLogin(login)>0){		 			
		 				model.addAttribute("msg", "��ϲ�㣬ע��ɹ�!");
		 			}
		 			return "/register";		
		 		}
		 		
	}
}
