package kr.co.uclick.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.uclick.entity.Phone;



@Service
@Transactional
interface PhoneService {

	void save(Phone phone);
	
	List<Phone> findAll();
	
	void updatePhone(String phoneNumber, int phoneId);
	
	void deletePhone(int p);
	

}