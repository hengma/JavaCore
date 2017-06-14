package com.mao.test.javacore.finalize;

public class FinalizeObject {


	/**
	 * The finalize() method is invoked each time before the object is garbage collected. 
	 * This method can be used to perform cleanup processing. 
	 * This method is defined in Object class as:
	 */
	protected void finalize() {
		System.out.println("object is garbage collected");
	}
    
}
