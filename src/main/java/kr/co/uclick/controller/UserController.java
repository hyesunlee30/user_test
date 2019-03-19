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
   public String list(Model model) {
      model.addAttribute("users", userService.findAll());
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
   public String editFormupdateForm(int id, Model model) {
	   	  
	  User user = userService.findById(id);
	  
	 List<Phone> phones = phoneService.findAllByUserId(id);
	 
	  
	  model.addAttribute("user", user);
	  model.addAttribute("phones", phones);
	  
      return "updateForm";
   }
   
   


   @RequestMapping(value = "save")
   public String save(@RequestParam HashMap<String, String> map) {


		String name1 = map.get("name");

		String PhoneNumber1 = map.get("PhoneNumber");
		

		userService.save(name1,PhoneNumber1); 



      return "redirect:list.html";
   }
   
   @RequestMapping(value = "update")
   public String update(User user, Model model, @RequestParam HashMap<String, String> map) {

	    String ids = map.get("id");
		System.out.println(ids);

		String name1 = map.get("name");

		int id = Integer.parseInt(ids);
		userService.updateUser(name1, id);
			
      return "redirect:list.html";
   }
   
   
   

   @RequestMapping(value = "delete")
   public String delete(int id, Model model) {
	   
	   userService.deleteUser(id);
	   
	   
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