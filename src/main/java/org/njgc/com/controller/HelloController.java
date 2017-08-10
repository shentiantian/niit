package org.njgc.com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.njgc.com.bean.Info;
import org.njgc.com.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class HelloController {
	/*�Զ�ƥ�䣬����������Ӧ��beanȥƥ�䣬ֻ����һ��ע��DbService���bean
	 * @Autowired
	private DbService dbService;*/
	
	//����bean������ȥƥ��
	@Resource
	private DbService dbService;//�˴���dbService����Ҫƥ���bean������
	
	public void setDbService(DbService dbService) {
		this.dbService = dbService;
	}

	
/*	@RequestMapping()
	public String hello(ModelMap model){		
		
		model.addAttribute("msg", "This is helloworld");
		return "hello";
	}*/
	
	@RequestMapping()
	public String hello(ModelMap model){		
		/*List<Info> infoList=dbService.getInfo(0);
		model.addAttribute("info", infoList.get(3));*/
		return "hello";
	}
	
	@RequestMapping("/form")
	public String showForm(@RequestParam("name") String name,@RequestParam("name2") String name2,ModelMap model){
		model.addAttribute("name", name);
		model.addAttribute("name2", name2);
		return "showForm";
	}
	
	/*@RequestMapping()
	public String hellobaby(){
		return "hellobaby";
	}*/
}
