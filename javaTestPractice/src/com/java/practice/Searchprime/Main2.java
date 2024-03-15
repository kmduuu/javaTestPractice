// package = "";

/* 에라토스테네스의 체로 구현 */

import java.io.*;

class Main2  
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		boolean[] isPrime = new boolean[n+1];
		
		for(int i = 2; i <= n; i++){
			isPrime[i] = true; // 전부 소수로 만들기
		}
		for(int i = 2; i * i <= n; i++){
			if(isPrime[i]){
				for(int j = i * i; j <= n; j += i){
					isPrime[j] = false;
				}
			}
		}
		int answer = 0;
		for(int i = 2; i <= n; i++){
			if(isPrime[i]){
				answer++;
			}
		}
		System.out.println(answer);
	}
}