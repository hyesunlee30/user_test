package kr.co.uclick.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.uclick.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {

	Optional<Phone> findById(Integer phoneId);

	void deleteByno(String phoneNumber);



}