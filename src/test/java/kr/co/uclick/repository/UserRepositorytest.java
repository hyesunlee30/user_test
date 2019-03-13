package kr.co.uclick.repository;

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
public class UserRepositorytest {
	   @Autowired
	   private UserRepository userRepository;
	   
	   
	   @Test
//	   @Transactional
	   public void oneToMany_TwoWay() {
	      User first = new User("Jang");        
	      first.addPhone(new Phone("010-1234-1111"));
	      first.addPhone(new Phone("010-1234-2222"));
	      
	      User second = new User("Ha");       
	      second.addPhone(new Phone("010-1234-3333"));
	      
	      User third = new User("Lee");       
	      third.addPhone(new Phone("010-1234-4444"));
	      
	      userRepository.save(first);           
	      userRepository.save(second);         
	      userRepository.save(third);         
	      
	      List<User> list = userRepository.findAll();
	      
	      for( User m : list ) {            
	         System.out.println(m.toString());   
	      }                           
	      

	   }
}