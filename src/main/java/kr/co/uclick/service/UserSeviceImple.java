package kr.co.uclick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.uclick.entity.User;
import kr.co.uclick.repository.UserRepository;

@Service
public class UserSeviceImple implements UserService {

	@Autowired UserRepository userrepository;
	
	@Override
	public void save(User user) {

		userrepository.save(user);
		
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


	
}
