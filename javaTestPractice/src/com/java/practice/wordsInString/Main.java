package com.java.practice.wordsInString;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		
		char value[] = str.toCharArray();
		int num1 = 0, num2 = 0;
		String answer = "";
		
		for(int i = 0; i < value.length; i++) {
			num1++;
			if(value[i] == ' ') {
				if(num1 > num2) {
					num2 = num1;
					answer = "";
					
					for(int j = i - num1 + 1; j < i; j++) {
						answer += value[j];
					}
				}
				num1 = 0;
			}
		}
		if(num1 > answer.length()) {
			answer = "";
			for(int k = value.length - num1; k < value.length; k++) {
				answer += value[k];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main search = new Main();
		
		String stringStr = in.nextLine(); //공백 포함해서 문자열 받는 기능
		
		System.out.println(search.solution(stringStr));
	}

}