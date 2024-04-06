// package = "";

import java.io.*;
import java.util.*;

class Main
{
	private int Solution(char[] arr){
		Stack<Integer> stack = new Stack<>();
		
		int lt = 0, rt = 0, op = 0;

		for(int i = 0; i < arr.length; i++){
			if(Character.isDigit(arr[i])){
				stack.push(Character.getNumericValue(arr[i]));
				// System.out.println(stack);
				if(stack.size() >= 2){
					lt++;
				}
			}else{
				// pop 후, 계산하고 다시 push해야함.
				rt = stack.peek(); // int 확실함.
				stack.pop();
				lt = stack.peek(); // int 확실함.
				stack.pop();
				if(arr[i] == '+'){
					op = lt + rt;
				}
				else if(arr[i] == '-'){
					op = lt - rt;
				}
				else if(arr[i] == '*'){
					op = lt * rt;		
				}
				else if(arr[i] == '/'){
					op = lt / rt;
				}

				stack.push(op);
			}
		}
		
		return stack.peek();
	}

	public static void main(String[] args) 
	{
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		
		System.out.println(m.Solution(c));
	}
}
