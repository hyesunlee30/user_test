package kr.co.uclick.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


import kr.co.uclick.configuration.SpringConfiguration;
import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class UserServicetest {
	   @Autowired
	   private UserService userService;
	   
	   
//	   @Test
//	   public void userAdd() {
//	      User first = new User("Jang");        
//	      first.addPhone(new Phone("010-1234-1111"));
//	      first.addPhone(new Phone("010-1234-2222"));
//	      
//	      User second = new User("Ha");       
//	      second.addPhone(new Phone("010-1234-3333"));
//	      
//	      User third = new User("Lee");       
//	      third.addPhone(new Phone("010-1234-4444"));
//	      
//	      userService.save(first);           
//	      userService.save(second);         
//	      userService.save(third);         
//	      
//	      List<User> list = userService.findAll();
//	      
//	      for( User m : list ) {            
//	         System.out.println(m.toString());
//	      }                           
//
//	   }
//	   
//	   @Test
//	   public void userFind() {
//		   
//		      List<User> list = userService.findByName("Lee");
//		      
//		      for( User m : list ) {            
//		         System.out.println(m.toString());
//		      }       
//	   }
	   
//	   @Test
//	   public void userUpdate() {
//		   
//		  userService.updateUser("Su", 1);
//		   
//	      List<User> list = userService.findAll();
//	      
//	      for( User m : list ) {            
//	         System.out.println(m.toString());
//	      } 
//
//	   }
	   
//	   @Test
//	   public void userDelete() {
//		   
//		  userService.deleteUser(102);
//		   
//	      List<User> list = userService.findAll();
//	      
//	      for( User m : list ) {            
//	         System.out.println(m.toString());
//	      } 
//
//	   }
	   

	   
}
