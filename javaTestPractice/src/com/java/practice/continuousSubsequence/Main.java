// package = "";

import java.util.*;

class Main
{
	public int Solution(int n1, int n2, int arr[]){

		int answer = 0;
		int sum = 0;
		
		int lt = 0, rt = 0;

		for(rt=0; rt < n1; rt++){
			sum += arr[rt];
			if(sum == n2) answer++;
			while(sum >= n2){
				// System.out.println("sum : "+sum);
				sum -= arr[lt++];
				if(sum == n2) answer++;
			}
		}
				

		return answer;
	}

	public static void main(String[] args) 
	{	
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int subsq[] = new int[num1];
		
		for(int i = 0; i < num1; i++){
			subsq[i] = sc.nextInt();
		}
		
		System.out.println(m.Solution(num1, num2, subsq));
	}
}
