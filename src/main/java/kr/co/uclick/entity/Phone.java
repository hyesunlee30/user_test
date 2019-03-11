package kr.co.uclick.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;

@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;
	
	@Column(unique=true)
	private String phoneNumber;
	
	//이게 있으면 member를 지우면 폰도 지워짐 ALL(전파되는 부분) 디테일하게 조절가능
	//이것을 JPA 어노테이션으로는 @ManyToOne이라고 표현
	// User Entity를 참조하여  Phone 테이블에 ownerId 컬럼을 만듬
	@ManyToOne(optional=false)
	@JoinColumn(name = "ownerId")
	private User user;

	public Phone() {
	}

	public Phone(User user, String phoneNumber) {
		this.user = user;
		this.phoneNumber = phoneNumber;
	}

	public Phone(String phone) {
		phoneNumber = phone;
	}

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}