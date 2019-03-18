package kr.co.uclick.controller;

import java.util.HashMap;
import java.util.List;

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
import kr.co.uclick.service.UserService;

@Controller
public class UserController {

   private static final Logger logger = LoggerFactory.getLogger(UserController.class);

   @Autowired
   private UserService userService;

   @RequestMapping(value = "list.html")
   public String list(Model model) {
      model.addAttribute("users", userService.findAll());
      return "list";
   }

   @RequestMapping(value = "newForm.html")
   public String newForm(Model model) {
      return "newForm";
   }
   
	@RequestMapping(value="view/{id}.html")
	public String findById(Model model,@PathVariable int id) {
	
		
		List<User> user = userService.findById(id);
		model.addAttribute("user", user);
		
		return "view";
	}

   
   @RequestMapping(value = "editForm.html")
   public String editForm(int userId, Model model) {
	   
	   userService.findById(userId);
	   
      return "editForm";
   }

   @RequestMapping(value = "save.html")
   public String save(User user, Model model, @RequestParam HashMap<String, String> map) {
	   
		String name = map.get("name");
		String PhoneNumber = map.get("PhoneNumber");

	      User u = new User(name);        
	      u.addPhone(new Phone(PhoneNumber));  
	      userService.save(u);   


      return "redirect:list.html";
   }
//
//   @RequestMapping(value = "delete.html")
//   public String delete(Long sampleId, Model model) {
//      return "redirect:list.html";
//   }
//
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