package com.cg.trg.pl;

public class CommandLineDemo {

	public static void main(String[] args) {
		try {
			int sum=0;
			for(int i=0;i<args.length;i++) {
				//convert String object to integer value
				sum = sum + Integer.parseInt(args[i]);
			}
			System.out.println(sum);
		}catch(NumberFormatException e) {
			System.err.println("Invalid data");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Accessing beyond array boundaries");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of program");
	}

}
