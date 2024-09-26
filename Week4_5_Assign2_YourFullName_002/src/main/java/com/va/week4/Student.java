package com.va.week4;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="student")
@Table
public class Student {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	 @Column
	 private String userName;
	 
	 @Column
	 private String password;
	 
	 @Column
	 private String firstName;
	 
	 @Column
	 private String address;
	 
	 
	 

	public Student() {
	}

	public Student(int studentId, String userName, String password, String firstName, String address) {
		super();
		this.studentId = studentId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", address=" + address + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	 
	 //.. do others!!
	 

}
