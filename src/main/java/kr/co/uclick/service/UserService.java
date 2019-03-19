package kr.co.uclick.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import kr.co.uclick.entity.User;


@Service
public interface UserService {

	
	List<User> findAll();
	

	List<User> findByName(String name);

	void updateUser(String name, int id);
	
	void deleteUser(int userId);

	public User findById(int id);

	void save(String name, String phoneNumber);






	
}