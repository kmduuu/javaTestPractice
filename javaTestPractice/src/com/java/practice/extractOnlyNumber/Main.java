package com.java.practice.extractOnlyNumber;

import java.util.Scanner;

public class Main {

	public String Tsolution(String str) {
		
		char[] c = str.toCharArray();
		
		String answer = "";
		
		for(int i = 0; i < c.length; i++) {
		
			if(Character.getType(c[i]) == 9) {
				answer+= c[i];
				if(answer.charAt(0) == '0') {
					answer = "";
				}
			}
			
		} // end of for
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		String inputStr = sc.nextLine();
		
		System.out.println(m.Tsolution(inputStr));
		
	}

}