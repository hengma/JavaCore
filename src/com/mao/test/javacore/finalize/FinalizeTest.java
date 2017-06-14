package com.mao.test.javacore.finalize;

public class FinalizeTest {

	public static void main(String arg[]) {
		
		//How can an object be unreferenced?
		
		//1- By nulling a reference
		FinalizeObject obj = new FinalizeObject();		
		obj = null;
		//The gc() method is used to invoke the garbage collector to perform cleanup processing. 
		//The gc() is found in System and Runtime classes.
		System.gc();
				
		//2- By assigning a reference to another:		
		FinalizeObject e1 = new FinalizeObject();  
		FinalizeObject e2 = new FinalizeObject();  
		e1 = e2;
		
		//The gc() method is used to invoke the garbage collector to perform cleanup processing. 
		//The gc() is found in System and Runtime classes.
		System.gc();
		
		//3- By annonymous object:
		new FinalizeObject();
		System.gc();
	}
}
