// package = "";

import java.util.*;

class Main 
{

	public int Solution(int n, int k, int[] arr){
	
		int answer = 0, rt = 0, lt = 0, cnt = 0, sum = 0;

		for(rt = 0; rt < n; rt++){
			// System.out.println(rt+"번째 배열 값 : "+arr[rt]);
			if(arr[rt] == 1){
				// System.out.println("cnt : "+cnt+", "+"answer : "+answer);
				answer = Math.max(answer, rt-lt+1);
			}
			else if(arr[rt] == 0){
				cnt++;
				if(cnt > k){
					while(lt<rt){
						if(arr[lt] == 1){
							lt++;
						}
						else if(arr[lt] == 0){
							lt++;
							cnt--;
							answer = Math.max(answer, rt-lt+1);
							break;
						}
					}
				}
			}
		}

		return answer;
	}
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		Main m = new Main();

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int[] seq = new int[num1];

		for(int i = 0; i < num1; i++){
			seq[i] = sc.nextInt();
		}

		System.out.println(m.Solution(num1, num2, seq));
	}
}
