// package = "";

import java.io.*;
import java.util.*;

class Main2
{
	private String Solution(char[] arr){

		Stack<Integer> stack = new Stack<>();

		for(int element : arr){
			if(element == '('){
				stack.push(element);
			}else{
				if(stack.empty()){
					return "NO";
				}stack.pop();
			}
		}

		return "YES";
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Main2 m = new Main2();

		String str = sc.nextLine();
		char[] c = str.toCharArray();
		
		

		System.out.println(m.Solution(c));
	}
}
