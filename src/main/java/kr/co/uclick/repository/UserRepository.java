package kr.co.uclick.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import kr.co.uclick.entity.User;

public interface UserRepository extends JpaRepository<User, Long> { 

} 