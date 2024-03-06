package com.java.practice.compressString;

import java.util.Scanner;

public class Main {

	public String Tsolution(String str) {
		
		str += " ";
		String answer = "";
		char c;
		int num = 1;
		
		for(int i = 0; i < str.length() - 1; i++) {
			
			c = str.charAt(i);
			
			if(str.charAt(i+1) == c) {
				num++;
			}
			else {
				answer += str.charAt(i);
				if(num > 1) {
					answer += ""+num;
					num = 1;
				}
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		String Stringstr = sc.nextLine();
		
		System.out.println(m.Tsolution(Stringstr));
	}

}
