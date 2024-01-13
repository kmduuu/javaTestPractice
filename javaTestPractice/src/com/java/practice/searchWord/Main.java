package com.java.practice.searchWord;

import java.util.Scanner;

public class Main {
	
	public int solution(String str, char a) {
		
		int result = 0; // 결과 값 출력
		
		char value[] = str.toUpperCase().toCharArray();
		a = Character.toUpperCase(a);
		
		for(int i = 0; i < value.length; i++) {
			if(value[i] == a) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main search = new Main();
		
		String stringStr = in.next();
		char char1 = in.next().charAt(0);
		
		System.out.println(search.solution(stringStr, char1));
	}

}