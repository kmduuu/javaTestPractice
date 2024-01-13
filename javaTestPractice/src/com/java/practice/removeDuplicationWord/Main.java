package com.java.practice.removeDuplicationWord;

import java.util.Scanner;

public class Main {

	public String Tsolution(String str) {
		
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main n = new Main();
		
		String words = sc.next();
		
		System.out.println(n.Tsolution(words));
		
		sc.close();
	}

}