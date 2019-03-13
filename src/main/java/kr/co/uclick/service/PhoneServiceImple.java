package kr.co.uclick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.repository.PhoneRepository;

@Service
public class PhoneServiceImple implements PhoneService {

	@Autowired PhoneRepository phoneRepository;
	
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


}
