package com.bridgeit;

public class RegisterBean {
private	String studentid ;
private	String studentName;
private	String password;

private	String gender;
private	String department;
private	String emailId;
private	String address;
private	String city;
private	String district;
private	String state ;
private String pincode;
private String mobileNo;
public String getStudentid() {
	return studentid;
}
public void setStudentid(String studentid) {
	this.studentid = studentid;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getPassword() {
	System.out.println("password");
	return password;
}
public String getGender() {
	System.out.println("in gnder"+gender);
	return gender;
}
public String getDepartment() {
	return department;
}
public String getEmailId() {
	return emailId;
}
public String getAddress() {
	return address;
}
public String getCity() {
	return city;
}
public String getDistrict() {
	return district;
}
public String getState() {
	return state;
}
public String getPincode() {
	return pincode;
}
public String getMobileNo() {
	return mobileNo;
}

public void setPassword(String password) {
	this.password = password;
}
public void setGender(String gender) {
	this.gender = gender;
}
public void setDepartment(String department) {
	this.department = department;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public void setAddress(String address) {
	this.address = address;
}
public void setCity(String city) {
	this.city = city;
}
public void setDistrict(String district) {
	this.district = district;
}
public void setState(String state) {
	this.state = state;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

}
