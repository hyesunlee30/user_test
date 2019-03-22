package kr.co.uclick.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import kr.co.uclick.entity.User;
import kr.co.uclick.entity.UserDto;


@Service
public interface UserService {

	
	public List<User> findAll(); //게시판 목록 
	
	public UserDto findBypage(int page , boolean search, String title); //페이징 

	public List<User> findByName(String name); // 이름검색

	void updateUser(String name, int id);
	
	void deleteUser(int userId);

	public User findById(int id);

	void save(String name, String phoneNumber);


	User findPhone(String phone);
	


	
}