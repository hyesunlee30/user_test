package kr.co.uclick.entity;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;

@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE) //엔티티의 컬렉션을 캐시
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	@Column(name = "name", nullable = true, length = 20) // 이름 컬럼 길이 20으로 제한
	private String name;

	//이게 있으면 member를 지우면 폰도 지워짐 ALL(전파되는 부분) 디테일하게 조절가능
	//회원 하나에 핸드폰을 여러개 가지니 1:N 관계
	//이것을 JPA 어노테이션으로는 @OneToMany라고 표현
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // cascade : 현 Entity 변경에 대해 관계를 맺는 Entity도 변경 전략을 결정합니다.
//	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE) // L2 Cache 적용
	private Collection<Phone> phones;


	public User() {
		
	}

	
	public User(String name) {
		setName(name);
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Phone> getPhones() {
		
		if( phones == null ) {
			phones = new ArrayList<Phone>();
		}
		return phones;
	}
	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}
	public void addPhone(Phone p) {
		Collection<Phone> phones = getPhones();
		p.setUser(this);
		phones.add(p);
	}
}