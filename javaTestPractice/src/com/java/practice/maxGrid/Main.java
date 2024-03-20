// package = "";

import java.io.*;
import java.util.*;

class Main
{
	protected int Program(int num, String str){
		
		int answer = 0;
		
		// System.out.println("num :"+num+", str : "+str);

		return answer;
	}

	public static void main(String[] args) throws Exception 
	{
		Main m = new Main();
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] strArray = new int[5][5]; 

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.println(strArray[i][j]);
			}
		}
	}
}
