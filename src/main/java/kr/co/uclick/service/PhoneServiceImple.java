package kr.co.uclick.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;
import kr.co.uclick.repository.PhoneRepository;
import kr.co.uclick.repository.UserRepository;

@Service
public class PhoneServiceImple implements PhoneService {

	@Autowired PhoneRepository phoneRepository;
	
	@Autowired UserRepository userRepository;
	
	@Override
	public void save(Phone phone) {
		
		phoneRepository.save(phone);
		
	}

	@Override
	public List<Phone> findAll() {
		
		return phoneRepository.findAll();
	}

	@Override
	public void updatePhone(String phoneNumber, int phoneId) {
		
		Phone p = phoneRepository.findById(phoneId).get();
		
		p.setNo(phoneNumber);
		
		phoneRepository.save(p);
					
	}

	@Override
	public void deletePhone(int phoneId) {
	
		phoneRepository.deleteById(phoneId);
		
	}

	@Override
	public List<Phone> findByNoLike(String phoneNumber) {
		
		return phoneRepository.findByNoLike(phoneNumber);
	}

	@Override
	public List<Phone> findAllByUserId(int userId) {
	
		List<Phone> res = new ArrayList<Phone>();
	      User u = userRepository.findById(userId).get();
	      List<Phone> list = phoneRepository.findAllByUser(u);
	      for(Phone item: list) {
	         res.add(item);
	      }
	      return res;
		
	}

}
