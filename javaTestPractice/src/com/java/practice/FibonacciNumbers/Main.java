// package = ;
// package = "";

/* 1. 배열 사용했을 때 */

import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int[] numbers = new int[num];
		String answer = "";

		numbers[0] = 1;
		numbers[1] = 1;

		for(int i = 2; i < num; i++){
			numbers[i] += numbers[i-1] + numbers[i-2];
			answer += numbers[i]+" ";
		}
		System.out.println(answer);
	}
}
