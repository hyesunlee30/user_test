package kr.co.uclick.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;
import kr.co.uclick.entity.UserDto;
import kr.co.uclick.repository.PhoneRepository;
import kr.co.uclick.repository.UserRepository;

@Service
public class UserSeviceImple implements UserService {

	@Autowired UserRepository userrepository;
	
	@Autowired PhoneRepository phoneRepository;
	
	@Override
	public void save(String name, String phoneNumber) {
		
	    User u = new User(name);        
	    u.addPhone(new Phone(phoneNumber)); 
	    userrepository.save(u);           
	}


	@Override
	public List<User> findByName(String name) {

		return userrepository.findByNameLike(name);
	}

	@Override
	public List<User> findAll() {
	

		return userrepository.findAll();
	}

	@Override
	public void updateUser(String name, int id) {
		
		User u = userrepository.findById(id).get();
		
		u.setName(name);
			
		userrepository.save(u);
		
	}

	@Override
	public void deleteUser(int userId) {
		
		userrepository.deleteById(userId);

	}

	@Override
	public User findById(int id) {
		
		return userrepository.findById(id).get();
	}




	@Override
	public UserDto findBypage(int page, boolean search, String title) {
		 int total = 0;
	      // 기본 화면일 때
//	      if (search==true) {
//	         total = userrepository.findAllByOrderByIdDesc(PageRequest.of(0, 10)).getTotalPages();
//	      }
//	      // 검색할 때
//	      else if (search == false && title.equals("name")) {
//	         total = userrepository.findAllSearchByTitle(title, PageRequest.of(0, 10)).getTotalPages();   
//	      } else if (search == false && title.equals("name")) {
//	         total = userrepository.findAllSearchByUser(title, PageRequest.of(0, 10)).getTotalPages();
//	      } 
	      
	      int start = (page / 10) * 10 + 1; 
	      int end = start + 9;
	      
	      UserDto n = new UserDto();
	      n.setStart(start);
	      n.setEnd(end);
	      n.setTotalpage(total);
	      
	      return n;
	   }

	
	// 이름 byte 체크
		public boolean checkNameByte(String name) {
			if(name.getBytes().length > 20) {
				System.out.println("이름은 20byte를 초과할 수 없습니다.");
				return false;
			}
			return true;
		}


	@Override
	public User findPhone(String phone) {
		
		
		Phone p = phoneRepository.findByNo(phone);
		
	
		User u = p.getUser();
		
				
		
		return u;
	}


 

	
}
