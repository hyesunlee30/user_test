package kr.co.uclick.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.uclick.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}