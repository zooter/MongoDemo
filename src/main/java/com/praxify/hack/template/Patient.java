package com.praxify.hack.template;

public class Patient {

	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String date;
	private String mobile;
	private String id;
	
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	public Patient(String firstName, String lastName, String dob, String email, String date, String mobile, String id){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.mobile = mobile;
		this.id = id;
		
	}
	
	
	public String toString(){
		StringBuilder pat = new StringBuilder();
		pat.append(this.firstName).append(" ").
			append(this.lastName).append(" ").
			append(this.dob).append(" ").
			append(this.email).append(" ").
			append(this.mobile).append(" ").
			append(this.id).append(" ");
		
		return pat.toString();
		
	}
	
}
