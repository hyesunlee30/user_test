package kr.co.uclick.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;



@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Phone {

	@Id
	@TableGenerator(name = "phone")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "phone")//기본키를 자동생성(id값을 자동으로 계속 늘려주는 형태)
	@Column
	private Integer id;
	
	@Column
	private String no;
	
	//이게 있으면 member를 지우면 폰도 지워짐 ALL(전파되는 부분) 디테일하게 조절가능
	//이것을 JPA 어노테이션으로는 @OneToMany라고 표현합니다.
	@ManyToOne(optional=false)
	@JoinColumn(name="user_id")
	private User user;
	
	public Phone() {
		
	}

	public Phone(String no) {
		this.no = no;
	}
	public Phone(User user1, String string) {
		this.user = user1;
		this.no = string;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public User getUser() {

		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		String result = "[phone_"+id+"]"+no;
		return result;
	}

}