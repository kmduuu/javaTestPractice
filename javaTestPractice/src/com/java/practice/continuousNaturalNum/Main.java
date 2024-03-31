// package = "";

import java.io.*;

class Main
{
	private int Solution(int num){

		int numArr[] = new int[num-1];
		
		int sum = 0, lt = 0, rt = 0, answer = 0;

		for(int i = 0; i < num-1; i++){
			numArr[i] = i+1;
		}

		for(rt = 0; rt < num-1; rt++){
			sum += numArr[rt];
			if(sum == num) {
				// System.out.println(sum);
				answer++;
			}
			while(sum >= num){
				sum -= numArr[lt++];
				if(sum == num) {
					answer++;
					// System.out.println(sum);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) throws Exception{
		
		Main m = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		System.out.println(m.Solution(num));
	}
}
