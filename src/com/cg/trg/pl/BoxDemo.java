package com.cg.trg.pl;

import com.cg.trg.service.Box;

public class BoxDemo {

	public static void main(String[] args) {
		Box b1= new Box(5.0,4.5,2.1);
		Box b2= new Box(5.0,4.5,2.1);
		
		/*
		 * All the instance methods implicitly receive the invoking object
		 * into "this" reference variable.
		 * Within an instance method, this means invoking object
		 */
		System.out.println(b1.getLength());
		System.out.println(b2.getLength());
		
		
		
		System.out.println(b1==b2);//false
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());

		/* To get the String representation of an Box object,
		 * override toString() method
		 */
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));
		
		String s1=new String("Hello");
		//String class has already overridden toString() method
		System.out.println(s1);
		

	}

}
