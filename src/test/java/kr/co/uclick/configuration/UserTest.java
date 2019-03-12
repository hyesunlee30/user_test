package kr.co.uclick.configuration;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;
import kr.co.uclick.repository.UserRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class UserTest {

	   @Autowired
	   private UserRepository userRepository;
	   
	   @Test
	   @Transactional
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
	      
	      for( User u : list ) {            
	         System.out.println(u.toString());   
	      }                         
	      
	   }
	
}
