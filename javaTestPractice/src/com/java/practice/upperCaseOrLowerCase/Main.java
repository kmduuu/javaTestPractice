package com.java.practice.upperCaseOrLowerCase;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		
		String result = "";
		
		char value[] = str.toCharArray();
		
		for(int i = 0; i < value.length; i++) {
			
			if(Character.isUpperCase(value[i])) {
				result += Character.toLowerCase(value[i]);
			}
			else {
				result += Character.toUpperCase(value[i]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main search = new Main();
		
		String stringStr = in.next();
		
		System.out.println(search.solution(stringStr));
	}

}