// package = "";

import java.io.*;
import java.util.*;

class Main
{
	public static void main(String[] args) {
	
		ArrayList<Integer> sumList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // 1. 정수 입력
		int[] numArr1 = new int[num1]; // 2. 배열 입력

		for(int i = 0; i < num1; i++){
			numArr1[i] = sc.nextInt();
		}
		
		int num2 = sc.nextInt(); // 3. 정수 입력
		int[] numArr2 = new int[num2]; // 4. 배열 입력

		for(int i = 0; i < num2; i++){
			numArr2[i] = sc.nextInt();
		}

		int p1 = 0, p2 = 0;

		for(; p1 < num1 && p2 < num2; ){
			// System.out.println(p1+", "+p2);
			if(numArr1[p1] < numArr2[p2]){
				sumList.add(numArr1[p1++]);
				
				}
			else {
				
				sumList.add(numArr2[p2++]);
				}
		}
		while(p1 < num1){sumList.add(numArr1[p1++]);}
		while(p2 < num2){sumList.add(numArr2[p2++]);}

		for(int answer : sumList){
			System.out.print(answer+" ");
		}
	}
}
