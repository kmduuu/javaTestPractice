package com.java.practice.palindromeTwo;

import java.util.Scanner;

public class Main {

	public String Tsolution(String str) {
		
		String modifyStr = "";
		String answer = "";
		char[] charArray = str.toCharArray();
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(charArray[i])) {
				modifyStr += charArray[i];
			}
		}
		
		int lt = 0;
		int rt = modifyStr.length() - 1;
		
		charArray = modifyStr.toCharArray();
		for(; lt<rt;) {
			if(Character.toUpperCase(charArray[lt]) == Character.toUpperCase(charArray[rt])) { lt++;rt--;}
			
			else {
				return "NO";
			}
		}
		if(lt==rt+1 || lt==rt) {
			return "YES";
		}
		
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
