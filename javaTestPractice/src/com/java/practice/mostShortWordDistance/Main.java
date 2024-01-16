package com.java.practice.mostShortWordDistance;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public String Tsolution(String str, char c) {
		
		int answer[] = new int[str.length()];
		int t = 1000;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				t = 0;
				answer[i] = t;
			}else {
				t++;
				answer[i] = t;
			}
		}
		
		t = 1000;
		for(int j = str.length() - 1; j >= 0; j--) {
			if(str.charAt(j) == c) {
				t = 0;
			}else {
				t++;
				if(answer[j] > t) {
					answer[j] = t;
				}
			}
		}
		return Arrays.toString(answer).replace("[", "").replace("]", "").replace(",", "");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		String inputStr = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(m.Tsolution(inputStr,c));
		
	}

}