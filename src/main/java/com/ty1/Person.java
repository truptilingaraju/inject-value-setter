package com.ty1;

public class Person {

	private Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void use() {
		System.out.println("person is using");
		mobile.ring();
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
}
