// package = "";

import java.io.*;
import java.util.*;

class Main 
{
	private String Solution(char[] c){

		Stack<Character> stack = new Stack<>();

		String answer = "";
		
		for(char element : c){
			if(element == '('){
				stack.push(element);
			}else if(element == ')'){
				stack.pop();
			}else if(stack.empty()){
				answer+=element;
			}
		}

		return answer;
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
