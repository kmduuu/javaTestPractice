// package com.java.practice.rockScissorPaper;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] humanA = br.readLine().split(" ");
		String[] humanB = br.readLine().split(" ");
		int a[] = new int[num];
		int b[] = new int[num];
		char[] answer = new char[num];
	
		for(int i = 0; i < num; i++){
			a[i] = Integer.parseInt(humanA[i]);
			b[i] = Integer.parseInt(humanB[i]);

			if(a[i] == b[i]){
				answer[i] += 'D';
			}else if(a[i] - b[i] == 2 || a[i] - b[i] == -1){
				answer[i] += 'B';
			}
			else{
				answer[i] += 'A';
			}
		} // end of for

		for(char printChar : answer) {
			System.out.println(printChar);
		}
	}

}
