package com.java.practice.biggerNumber;

import java.util.Scanner;

// issue : 12값이 1, 2 단일로 출력되는 문제점
// ==> split으로 해결하면 될듯

public class Main {

	protected String Tsolution(int num, String str) {
		
		String answer = "";
		
		String[] integer = str.split(" ");
		
//		for (String string : integer) {
//			
//		} // enforced for not works.

		int intArray[] = new int[num];
		
		answer += integer[0]+" ";
		
		for (int i = 1; i < num; i++) {
			
			intArray[i] = Integer.parseInt(integer[i]);
			intArray[i-1] = Integer.parseInt(integer[i-1]);
			
			if(intArray[i] > intArray[i-1]) {answer+= integer[i]+" "; }
			
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Main m = new Main();
		
		int number = s.nextInt();
		s.nextLine();
		String str = s.nextLine();
		
		System.out.println(m.Tsolution(number,str));
		
	}

}
