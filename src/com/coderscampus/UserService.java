package com.coderscampus;

public class UserService {

	public User createUser (String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
				
		}
	
	String input = "exampleUsername,examplePassword,exampleName";
	
	public String[] parseText(String input) {
		this.input = input;
		String[] parse = input.split(",");
		return parse;
		
	}
	
	
	
}