package com.dannycode;

public class WelcomeMessage {
	String message = "";
	
	public WelcomeMessage(String message) {
		this.message = message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void PrintMessage(){
		System.out.println(message);
	}
}
