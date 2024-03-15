// package = "";

import java.io.*;

class Main  
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = 0;

		for(int i = 2; i < n; i++){
			int check = 0;
			for(int j = i; j > 0; j--){
				if(i % j == 0){
					check++;
				}
			}
			if(check == 2){
					answer++;
				}
		}

		System.out.println(answer);
	}
}
// Time Limit Exceeded.