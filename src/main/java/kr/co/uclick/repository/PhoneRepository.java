package kr.co.uclick.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import kr.co.uclick.entity.Phone;
import kr.co.uclick.entity.User;


public interface PhoneRepository extends JpaRepository<Phone, Integer> {


	void deleteByno(String phoneNumber);

	List<Phone> findByNoLike(@Param("phoneNumber")String phoneNumber);

	public List<Phone> findAllByUser(User user);

	
	Phone findByNo(@Param("phoneNumber")String phoneNumber);
}