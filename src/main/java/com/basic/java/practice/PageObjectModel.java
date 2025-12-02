package com.basic.java.practice;

public class PageObjectModel {
public static final String APPLink = "file:///C:/Users/Queenie/Documents/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html";
public static final String user = "//*[@id='username']";
public static final String password = "//*[@id='password']";
public static final String loginBtn = "//*[@value='Login']";
public static final String logOutButton = "//*[@id='logoutButton']";

public static String getApplink() {
	return APPLink;
}
public static String getUser() {
	return user;
}
public static String getPassword() {
	return password;
}
public static String getLoginbtn() {
	return loginBtn;
}
public static String getLogoutbutton() {
	return logOutButton;
}
public String getAPPLink2() {
	return APPLink2;
}
public String getUser2() {
	return user2;
}
public String getPassword2() {
	return password2;
}
public String getLoginBtn2() {
	return loginBtn2;
}
public String getLogOutButton2() {
	return logOutButton2;
}
private String APPLink2 = "file:///C:/Users/Queenie/Documents/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html";
private String user2 = "//*[@id='username']";
private String password2 = "//*[@id='password']";
private String loginBtn2 = "//*[@value='Login']";
private String logOutButton2 = "//*[@id='logoutButton']";
}

