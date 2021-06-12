package com.cg.trg.pl;

public class Demo{
	private int serialNumber;
	private String message;
	private boolean status;
	private static int counter;


	public static void getCustomMessage(String message){
		//String myMessage;
		String myMessage="Hi";
		myMessage= myMessage+" "+message;
		System.out.println(myMessage);
	}

	public static void main(String []args){
		getCustomMessage("Hello"); //Hi Hello
		Demo aobj= new Demo();
		System.out.println(aobj.serialNumber);//0
		System.out.println(aobj.message); //null
		System.out.println(aobj.status); //false
		System.out.println(counter); // 0 
	}


}