package kr.co.uclick.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;
import kr.co.uclick.service.PhoneService;
import kr.co.uclick.service.UserService;

@Controller
public class UserController {

   private static final Logger logger = LoggerFactory.getLogger(UserController.class);

   @Autowired
   private UserService userService;
   
   @Autowired
   private PhoneService phoneService;
   
   @RequestMapping(value = "list")
   public String list(Model model,  @RequestParam HashMap<String, String> map) {
	
//	    String pageS = map.get("page");
//	     if(pageS == null || pageS.equals("")) {
//	        pageS = "0";
//	     }
	     
	     // 검색관련기능
	     String opt = map.get("opt");
	     String title = map.get("title");
	     boolean search = false; // false 검색, true 미검색
//	     int page = Integer.parseInt(pageS);
//	     
//	     int start = userService.findBypage(page, search, title).getStart(); 
//	     int end = userService.findBypage(page, search, title).getEnd();
//	     int total = userService.findBypage(page, search, title).getTotalpage();
//	     if (end > total) {
//	        end = total;
//	     }
	     
	     List<User> list = null;
	     List<Phone> phone = null;
	     //미검색일 때
	     if(title==null || title.equals("")) {
	        search = true;
	        list = userService.findAll(); //리스트 변수에 결과값을 담는다.
	     } 
	     //검색일 때
	     else {
	        search = false;
	        if(opt.equals("name")) {
	           list = userService.findByName(title); //리스트 변수에 결과값을 담는다.
	        } else if(opt.equals("phone")) {	        
	        	
	           User u = userService.findPhone(title);
	           list = new ArrayList<User>(); //객체화
	           list.add(u);
	           System.out.println(list.size());
	           
//	           list = userService.findAllById(userid);
	           
	        }
	     }
	     
	     model.addAttribute("list",list); //모델에 name, value 를 담는다.
	     model.addAttribute("phone",phone); //모델에 name, value 를 담는다.
//	     model.addAttribute("start",start);
//	     model.addAttribute("end",end);
	     // 검색관련
	     model.addAttribute("search",search);
	     model.addAttribute("opt",opt);
	     model.addAttribute("title",title);
	   
 
      return "list";
   }

   @RequestMapping(value = "newForm")
   public String newForm(Model model) {
      return "newForm";
   }
   
   
   @RequestMapping(value = "editForm")
   public String editForm(int id, Model model) {
	   	  
	  User user = userService.findById(id);
	  
	  List<Phone> phones = phoneService.findAllByUserId(id);
	 
	  
	  model.addAttribute("user", user);
	  model.addAttribute("phones", phones);
	  
      return "editForm";
   }
   
   
   @RequestMapping(value = "updateForm")
   public String updateForm(int id, Model model) {
	   	  
	  User user = userService.findById(id);
	  
	  List<Phone> phones = phoneService.findAllByUserId(id);
	 
	  
	  model.addAttribute("user", user);
	  model.addAttribute("phones", phones);
	  
      return "updateForm";
   }
   
   @RequestMapping(value = "phoneAddForm")
   public String phoneAddForm(int id, Model model) {
	   	  
	  User user = userService.findById(id);
	  
	  List<Phone> phones = phoneService.findAllByUserId(id);
	 
	  
	  model.addAttribute("user", user);
	  model.addAttribute("phones", phones);
	  
      return "phoneAddForm";
   }
   
   @RequestMapping(value = "phoneUpdateForm")
   public String phoneUpdateForm(int phoneid, Model model,  @RequestParam HashMap<String, String> map) {

	   Phone p = phoneService.findById(phoneid);
	   model.addAttribute("phones", p);
	  
      return "phoneUpdateForm";
   }
   
   

   @RequestMapping(value = "save")
   public String save(int id, @RequestParam HashMap<String, String> map) {

		String name1 = map.get("name");

		String PhoneNumber1 = map.get("PhoneNumber");
		
		int ids = 0;
		
		ids = id;
		



		if(ids != 0) {
			User user1 = userService.findById(ids);
	
			Phone p = new Phone(user1, PhoneNumber1);
	
	
			phoneService.save(p);

		}
		else {

			userService.save(name1,PhoneNumber1); 
			
		}



      return "redirect:list.html";
   }
   
   @RequestMapping(value = "update")
   public String update(@RequestParam HashMap<String, String> map) {

	   
//	    String ids = map.get("id");
//	       
//		
//		int id = 0;
//		id = Integer.parseInt(ids);
//		
//	
//
//		
//		if(id != 0) {
//
//			String name1 =map.get("name");
//
//			userService.updateUser(name1, id);
//			
//		}
//		else {
	
			String phoneid = map.get("phoneid");
			
			
			String phoneNumber = map.get("phoneNumber");
			
			int Pi = 0;
			Pi = Integer.parseInt(phoneid);

			phoneService.updatePhone(phoneNumber, Pi);
			
//		}
		
			
      return "redirect:list.html";
   }
   
   
   

   @RequestMapping(value = "delete")
   public String delete(int phoneid, Model model, @RequestParam HashMap<String, String> map) {
	   
	  
	   
	   String ids = map.get("id");
		

		if (ids != null) {
			int id = Integer.parseInt(ids);
			
			 userService.deleteUser(id);
			
		} else {
			
			 phoneService.deletePhone(phoneid);

	   }
	   
	   
	   
      return "redirect:list.html";
   }

//   @RequestMapping(value = "sample.html")
//   public String sample(String name, User user, Model model) {
//
//      logger.debug("sample name : {}", name);
//      logger.debug("Sample.name : {}", user.getName());
//
//      model.addAttribute("Users", userService.findAll());
//      model.addAttribute("user", user);
//      model.addAttribute("findSampleByName", userService.findByName(name));
//      return "sample";
//   }
}