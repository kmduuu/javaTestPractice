// package = "";

import java.io.*;
import java.util.*;

class Main2
{
	private String Solution(char[] c){
		
		String answer = "";

		Stack<Character> stack = new Stack<>();

		for(char element : c){
			stack.push(element);
			if(stack.search(')') == 1){
				// System.out.println(stack.search(')')+" , "+stack.search('('));
				int stackGPS = stack.search('(');
				for(int i = 0; i < stackGPS; i++){ 
					// System.out.println(stack.search(')')+" "+stack.search('('));
					stack.pop();
					// System.out.println("i = "+i);
					
				}
			} 
		}

		for(char ch : stack){
			System.out.print(ch);
		}

		return answer;
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
