package kr.co.uclick.configuration;

import javax.jdo.annotations.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.uclick.repository.UserRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class UserTest {

	@Autowired 
	private UserRepository userRepository;
		
	@Test
	@Transactional
	public void oneToMany_TwoWay() {
		
		
//		  User first = new User("Jung");
//	      first.addPhone(new Phone("010-xxxx-xxxx"));
//	      first.addPhone(new Phone("010-yyyy-yyyy"));
//	      
//
//	      userRepository.save(first);
//
//	      
//	      //모든 엔티티를 취득 
//	      List<User> list = userRepositoryfindAll();
//	      
//	      for( Member m : list ) {
//	         System.out.println(m.toString());
//	      }
//	      memberRepository.deleteAll();

	}
}
