package com.java.practice.upperCaseOrLowerCase;

import java.util.Scanner;

public class Main2 {
	
	public String solution(String str) {
		
		String result = "";
		
		char value[] = str.toCharArray();
		
		for(int i = 0; i < value.length; i++) {
			
			if(Character.isUpperCase(value[i])) {
				char upToLow = (char) (value[i] + 32);
				result += upToLow;
			}
			else {
				char lowToUp = (char) (value[i] - 32);
				result += lowToUp;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main2 search = new Main2();
		
		String stringStr = in.next();
		
		System.out.println(search.solution(stringStr));
	}

}