package com.san.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dreamersol")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Min(value = 999999999,message="must be 10 digit numeric")
	@Size(min=10,max=10)
	private String mobileNo;
	@Size(min=1, max=50, message="must be b/w 1-50")
	private String name;
	@Email
	@Size(min=3,max=50,message="must be email formated and range 1-50")
	private String emailId;
	@NotNull(message="age b/w 18-60")
	@Min(value = 18)
	@Max(value = 60)
    private int age;
	public User() {
		super();
	}

	public User(String mobileNo, String name, String emailId ,int age) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
		this.emailId = emailId;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", mobileNo=" + mobileNo + ", name=" + name + ", emailId=" + emailId + ", age=" + age
				+ "]";
	}

}
