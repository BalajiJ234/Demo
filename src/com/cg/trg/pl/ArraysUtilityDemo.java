package com.cg.trg.pl;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtilityDemo {
	private static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter number of users: ");
//		int size=scanner.nextInt(); //KBD (4\n) ->KBD Buffer(\n) -> memory (4)
//		scanner.nextLine();//clears KBD buffer
		
		int size = Integer.parseInt(scanner.nextLine());
		String userNames[] = new String[size];
		getNames(userNames);
		System.out.println("Before sorting...");
		showNames(userNames);
		Arrays.sort(userNames);
		System.out.println("After sorting...");
		showNames(userNames);
	}

	private static void getNames(String[] userNames) {
		for(int i=0;i<userNames.length;i++) {
			System.out.println("Enter name of user:"+(i+1));
			userNames[i]= scanner.nextLine();					
		}
		
	}

	private static void showNames(String[] userNames) {
		//for each loop
		for(String s: userNames) {
			System.out.println(s);
		}
		
	}

}
