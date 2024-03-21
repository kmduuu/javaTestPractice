// package = "";

import java.io.*;
import java.util.*;

class Main
{
	protected int Program(int num, int[][] intArray){

	/* ==> 계산 방법을 무식 -> 다이나믹 프로그래밍 바꾸기 */

		int answer = 0;
		int value = 0;

		// 1. 각 행의 합 계산
		for(int i = 0; i < num; i++){

			value = 0;	

			for(int j = 0; j < num; j++){
				
				value += intArray[i][j];
			}
			if(answer <= value){
				answer = value;
			}
		}
		// 2. 각 열의 합 계산
		for(int i = 0; i < num; i++){

			value = 0;	

			for(int j = 0; j < num; j++){
				
				value += intArray[j][i];
			}
			if(answer <= value){
				answer = value;
			}
		}
		// 3. 대각선 합 계산 - 1
		value = 0;
		for(int i = 0; i < num; i++){

			value += intArray[i][i];

			if(answer <= value){
				answer = value;
			}
		}
		// 4. 대각선 합 계산 - 2
		value = 0;
		for(int i = num - 1; i >= 0; i--){
			
			int sqs = -1 * (i+1);

			value += intArray[i][num+sqs];

			if(answer <= value){
				answer = value;
			}
		}

		return answer;
	}

	public static void main(String[] args) throws Exception 
	{
		Main m = new Main();
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] intArray = new int[num][num]; 

		for(int i = 0; i < num; i++){
			for(int j = 0; j < num; j++){
				intArray[i][j] = sc.nextInt();
			}
		}
		System.out.println(m.Program(num, intArray));
	} 
}
