package org.njgc.com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.njgc.com.bean.Info;
import org.njgc.com.bean.Login;
import org.njgc.com.service.DbService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//����bean������ȥƥ��
		@Resource
		private DbService dbService;//�˴���dbService����Ҫƥ���bean������
		
		public void setDbService(DbService dbService) {
			this.dbService = dbService;
		}

	@RequestMapping()
	public String login(ModelMap model){		
		return "login";
	}
	
	/*@RequestMapping("/checkLogin")	
    public String loginResult(@RequestParam("username") String username,@RequestParam("username") String password,ModelMap model)
	{
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
		
	}*/
}
