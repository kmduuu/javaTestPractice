// package = "";

import java.util.*;

class Main
{
	private int Solution(char[] c){
		
		Stack<Character> stack = new Stack<>();

		int answer = 0;
		// char lt = '(';

		for(int i = 0; i < c.length; i++){
			
			// ���� 1. c[i]�� '(' �� ��
			if(c[i] == '('){
				stack.push(c[i]);
				// lt = '(';
			}

			// ���� 2. c[i]�� ')' �̸鼭 ���� ��(lt)�� '(' ���� ���
/*			else if(c[i] == ')' && lt == '('){
				stack.pop();
				lt = c[i];
				answer += stack.size();
				lt = ')';
			}
			// ���� 3. c[i]�� ')' �̸鼭 ���� ��(lt)�� ')' ���� ���
			else{
				stack.pop();
				answer += 1;
				lt = ')'
			}*/


			// ���� 2,3 ����ȭ : c[i-1]�� �ϸ� �������� �� ������.
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
