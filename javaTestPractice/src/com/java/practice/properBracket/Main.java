// package = "";

import java.io.*;
import java.util.*;

class Main
{
	private String Solution(char[] arr){
		
		int count = 0;
		// System.out.println(arr.length);

		// 1. 값 홀수이면 바로 리턴
		if(arr.length % 2 != 0 || arr[0] == ')' || arr[arr.length-1] == '('){
			return "NO";
		}

		for(int i = 0; i < arr.length; i++){
			if(arr[i] == '('){
				count++;
			}
			else{
				count--;
			}
		}

		if(count == 0){
			return "YES";
		}

		return "NO";
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Main m = new Main();

		String str = sc.nextLine();
		char[] c = str.toCharArray();

		System.out.println(m.Solution(c));
	}
}
