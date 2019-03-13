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
public class PhoneServicetest {
	
	   
	   @Autowired
	   private PhoneService phoneService;
	
	   
//	   @Test
//	   public void phoneAdd() {
//           
//		   User user1 = new User("Kim");
//		   
//		   
//		   userService.save(user1);
//		   
//		   Phone p = new Phone(user1,"010-0010-1111");
//
//		
//		   phoneService.save(p);
//		   
//		   List<Phone> list = phoneService.findAll();
//		   
//		  for( Phone ph : list ) {            
//	         System.out.println(ph.toString());
//	      } 
//
//	   }
	   
//	   @Test
//	   public void phoneUpdate() {
//		   
//		   phoneService.updatePhone("010-1212-1212", 1);
//		
//			List<Phone> phone = phoneService.findAll();
//
//			for (Phone p : phone) {
//				System.out.println(
//						"[PHONE ID]: " + p.getUser().getId() + " [PHONE NUMBER]: " + p.getNo());
//			}
//		   
//	   }
	   
//	   @Test
//	   public void phoneUpdate() {
//		   
//		   phoneService.updatePhone("010-1212-1212", 1);
//		
//			List<Phone> phone = phoneService.findAll();
//
//			for (Phone p : phone) {
//				System.out.println(
//						"[PHONE ID]: " + p.getUser().getId() + " [PHONE NUMBER]: " + p.getNo());
//			}
//		   
//	   }
	   
	   @Test
	   public void phoneDelete() {
		   
		   phoneService.deletePhone(1);

			List<Phone> phone = phoneService.findAll();

			for (Phone p : phone) {
				System.out.println(
						"[PHONE ID]: " + p.getUser().getId() + " [PHONE NUMBER]: " + p.getNo());
			}
		   
	   }   

	   
	   
}
