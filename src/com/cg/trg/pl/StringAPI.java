package com.cg.trg.pl;

public class StringAPI {

	public static void main(String[] args) {
		String s1="Hello"; //"Hello" is stored in String pool
		String s2="Hello";
		String s3= new String("Hello");
		String s4= new String("Hello");
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		System.out.println(s2.equals(s3));//true
		
		/*
		 * JVM implicitly  generates a unique integer value for 
		 * each object created  by new operator
		 */
		/*
		 * According Java docs, if 2 objects of same type have same state,
		 * then their hashCodes have to be same.
		 * But, JVM generated hashcode is not based on state of an object, it
		 * always generates a unique hashCode
		 * Note: State of an object indicates current values in its data members.
		 */
		
		/*String class has overridden hashCode() and equals() methods
		 * such a way that if two String objects have same data, they return
		 * same hashCode
		 */
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		

	}

}
