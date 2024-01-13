package com.java.practice.mostShortWordDistance;

import java.util.Scanner;

public class Main {

	public String Tsolution(String str, char c) {
		
		char[] charArray = str.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			System.out.println(str.indexOf(c));
			
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		char c = sc.nextLine().charAt(0);
		String inputStr = sc.nextLine();
		
		System.out.println(m.Tsolution(inputStr,c));
		
	}

}