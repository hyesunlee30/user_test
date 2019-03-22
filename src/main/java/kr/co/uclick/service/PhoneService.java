package kr.co.uclick.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.uclick.entity.Phone;



@Service
@Transactional
public interface PhoneService {

	void save(Phone phone);
	
	List<Phone> findAll();
	
	void updatePhone(String phoneNumber, int Pi);
	
	void deletePhone(int p);
	

	List<Phone> findByNoLike(String phoneNumber);

	public List<Phone> findAllByUserId(int userId);

	public  Phone findById(int phoneId);
	


}