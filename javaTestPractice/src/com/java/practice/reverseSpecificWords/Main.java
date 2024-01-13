package com.java.practice.reverseSpecificWords;

import java.util.Scanner;

public class Main {
	
	public String Tsolution(String str) {
		
		String answer;
		char words[] = str.toCharArray();
		
		int lt = 0;
		int rt = str.length() - 1;
		
		while(lt<rt) {
			
			if(!Character.isAlphabetic(words[lt])) lt++;
			else if(!Character.isAlphabetic(words[rt])) rt--;
			else {
				char temp = words[lt];
				words[lt] = words[rt];
				words[rt] = temp;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(words);
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Main method = new Main();
		
		String inputStr = in.nextLine();
		
		System.out.println(method.Tsolution(inputStr));
		
		in.close();
	}

}