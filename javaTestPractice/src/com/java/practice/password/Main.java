package com.java.practice.password;
import java.util.Scanner;

public class Main {

	private String Tsolution(int num, String str) {
		
		String answer = "";
		
		for(int i = 0; i < num; i++) {
			
			String convert = str.substring(0,7).replace('#', '1').replace('*', '0');
			
			int decimal = Integer.parseInt(convert, 2);
			
			answer += (char)decimal;
			
			str = str.substring(7);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Main t = new Main();
		
		int number = s.nextInt();
		String password = s.next();
		
		System.out.println(t.Tsolution(number, password));
	}

}
