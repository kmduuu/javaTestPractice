package com.java.practice.biggerNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	protected String Tsolution(int num, String str) {
		
		String answer = "";
		str = str.replace(" ", "");
		
		System.out.println("바뀐 str : "+str);
		
		char val[] = str.toCharArray();
		
		System.out.println(Arrays.toString(val));
		
		answer += val[0]+" ";
		
		for(int i = 1; i < num; i++) {
			if(val[i] > val[i-1]) answer += val[i]+" "; System.out.println(answer);
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
