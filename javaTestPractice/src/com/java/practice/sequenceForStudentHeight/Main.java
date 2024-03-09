package com.java.practice.sequenceForStudentHeight;

import java.util.Scanner;

public class Main {

	private int Hsolution(int num, int arr[]) {
		
		int answer = 1;
		
		for(int i = 1; i < num; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[i] > arr[j-1]) {System.out.println("i값 : "+i+" j값 : "+j+","+"현재 값 : "+arr[i]);}
			}
		}
		System.out.println("수정 중...일단 커밋해두고 싶엉...");
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Main m = new Main();
		
		int number = s.nextInt();
		int arr[] = new int[number];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(m.Hsolution(number, arr));
	}

}
