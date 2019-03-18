package kr.co.uclick.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import kr.co.uclick.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> { 
	
	List<User> findByNameLike(@Param("searchString") String searchString);

	Optional<User> findById(int id);

} 