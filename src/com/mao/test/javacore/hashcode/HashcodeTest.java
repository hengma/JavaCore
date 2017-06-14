package com.mao.test.javacore.hashcode;

public class HashcodeTest {

	public static void main(String arg[]) {
		
		//Override equal method with hashcode
		User user1 = new User("mao", 35, "1234567");
	    User user2 = new User("mao", 35, "1234567");
	    System.out.println(user1.equals(user2));
	    
	}
}
