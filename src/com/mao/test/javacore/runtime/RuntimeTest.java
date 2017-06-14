package com.mao.test.javacore.runtime;


public class RuntimeTest {

	public static void main(String arg[]) throws Exception {
		System.out.println(Runtime.getRuntime());
		
		//Runtime.getRuntime().exit(0);
		
		System.out.println("Hello");
		
		Runtime.getRuntime().exec("notepad");//will open a new notepad
	}
}
