package kr.co.uclick.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;
import kr.co.uclick.repository.UserRepository;

@Service
public class UserSeviceImple implements UserService {

	@Autowired UserRepository userrepository;
	
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




	
}
