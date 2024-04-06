// package = "";

import java.util.*;

class Main
{
	private int Solution(char[] c){
		
		Stack<Character> stack = new Stack<>();

		int answer = 0;
		// char lt = '(';

		for(int i = 0; i < c.length; i++){
			
			// 조건 1. c[i]가 '(' 일 때
			if(c[i] == '('){
				stack.push(c[i]);
				// lt = '(';
			}

			// 조건 2. c[i]가 ')' 이면서 이전 값(lt)이 '(' 였을 경우
/*			else if(c[i] == ')' && lt == '('){
				stack.pop();
				lt = c[i];
				answer += stack.size();
				lt = ')';
			}
			// 조건 3. c[i]가 ')' 이면서 이전 값(lt)도 ')' 였을 경우
			else{
				stack.pop();
				answer += 1;
				lt = ')'
			}*/


			// 조건 2,3 최적화 : c[i-1]로 하면 이전꺼로 비교 가능함.
			else{
				stack.pop();
				if(c[i-1] == '(') answer += stack.size();
				else answer++;
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
