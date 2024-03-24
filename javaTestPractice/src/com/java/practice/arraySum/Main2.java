// package = "";

import java.io.*;
import java.util.*;

class Main2
{
	public String Solution(int n1, int[] arr1, int n2, int[] arr2){
		
		String answer = "";
		
		int sumArr[] = new int[n1+n2];

		for(int i = 0; i < n1; i++){
			sumArr[i] = arr1[i];	
			// System.out.println("sumArr = "+sumArr[i]+", i의 값 : "+i);
		}
		for(int i = 0; i < n2; i++){
			sumArr[n1+i] = arr2[i];
			// System.out.println("sumArr = "+sumArr[i]+" j의 값 : "+i);
		}
		
		Arrays.sort(sumArr);

		for(int sum : sumArr){
			answer += sum+" ";
		}

		return answer;
	}

	public static void main(String[] args) throws Exception{
		Main2 m = new Main2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());
		int numArr1[] = new int[num1];

		String numStr1[] = br.readLine().split(" ");

		for(int i = 0; i < num1; i++){
			numArr1[i] = Integer.parseInt(numStr1[i]);
		}
	
		int num2 = Integer.parseInt(br.readLine());
		int numArr2[] = new int[num2];
		
		String numStr2[] = br.readLine().split(" ");

		for(int i = 0; i < num2; i++){
			numArr2[i] = Integer.parseInt(numStr2[i]);
		}

		System.out.println(m.Solution(num1, numArr1, num2, numArr2));
	}
}
