package org.njgc.com.controller;

import java.util.List;

import javax.annotation.Resource;


import org.njgc.com.bean.Information;

import org.njgc.com.service.DbService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/queryInformation")
public class InformationQueryController {	
	
	//����bean������ȥƥ��
			@Resource
			private DbService dbService;//�˴���dbService����Ҫƥ���bean������
			
			public void setDbService(DbService dbService) {
				this.dbService = dbService;
			}

		@RequestMapping()
		public String queryResult(@RequestParam("name") String name,ModelMap model){
			/*String result="";
			List<Information> infoList=dbService.getInformation(name);
			for(Information i:infoList){
				result+=i.getName()+i.getAge()+"\n";
			}*/
			List<Information> infoList=dbService.getInformation("Tom");
			//System.out.println(infoList.get(0).getName());
			model.addAttribute("msg",name);
			return "queryResult";
		}

}
