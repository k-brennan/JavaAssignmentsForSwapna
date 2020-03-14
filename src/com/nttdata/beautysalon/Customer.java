package com.nttdata.beautysalon;

public class Customer {

	private String name, memberType;
	private boolean member;
	
	public Customer() {
		this.member = false;
	}
	
	public Customer(String name, String memberType) {
		this.member = true;
		this.name = name;
		this.memberType = memberType;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String memberType) {
		this.memberType = memberType.toUpperCase();
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean member) {
		this.member = member;
	}

	
	public String toString() {
		return "Customer [name=" + name + ", memberType=" + memberType + ", member=" + member + "]";
	}	
}