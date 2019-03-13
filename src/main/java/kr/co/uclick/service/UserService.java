package kr.co.uclick.service;


import java.util.List;

import org.springframework.stereotype.Service;
import kr.co.uclick.entity.User;


@Service
interface UserService {

	
	List<User> findAll();
	
	void save(User user);

	List<User> findByName(String name);

	void updateUser(String name, int id);
	
	void deleteUser(int userId);

//	boolean checkNameByte(String name);
	
}