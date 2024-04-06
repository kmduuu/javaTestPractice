// package = "";

import java.util.*;

class Main
{
	public String Solution(char cArr1[], char cArr2[]){
		
		LinkedList<Character> queue1 = new LinkedList<>();
		LinkedList<Character> queue2 = new LinkedList<>();

		String answer = "YES";

		for(int i = 0; i < cArr1.length; i++){
			queue1.add(cArr1[i]);
		}

		for(int i = 0; i < cArr2.length; i++){
			// System.out.println(i);
			if(queue1.contains(cArr2[i])){
				queue2.add(cArr2[i]);
			}
		}

		if(!queue1.equals(queue2)){
			return "NO";
		}

		return answer;
	}

	public static void main(String[] args) 
	{
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		char[] cArr1 = str1.toCharArray();
		char[] cArr2 = str2.toCharArray();

		System.out.println(m.Solution(cArr1, cArr2));
	}
}
