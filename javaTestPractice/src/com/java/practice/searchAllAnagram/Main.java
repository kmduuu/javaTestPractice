// package = "";

import java.util.*;
import java.io.*;

class Main
{
	public int Solution(String str1, String str2){

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		int answer = 0;
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		// 1. 초항 넣기
		for(int i = 0; i < arr2.length; i++){
			map1.put(arr2[i], map1.getOrDefault(arr2[i],0)+1);
		}

		// 2. 아나그램 찾기
		for(int i = 0; i < arr2.length; i++){
			map2.put(arr1[i], map2.getOrDefault(arr1[i],0)+1);

			if(map1.equals(map2)){
				answer++;
			}
		}
		
		int lt = 0, rt = arr2.length;

		while(rt < arr1.length){
			// System.out.println("lt : "+lt+", rt : "+rt+" || "+arr1[lt]+" "+arr1[rt]);
			if(map2.get(arr1[lt]) == 1){
				map2.remove(arr1[lt++]);
				map2.put(arr1[rt], map2.getOrDefault(arr1[rt++], 0)+1);
			}else{
				map2.put(arr1[lt], map2.getOrDefault(arr1[lt++], 0)-1);
				map2.put(arr1[rt], map2.getOrDefault(arr1[rt++], 0)+1);
			}
			if(map1.equals(map2)){
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();

		System.out.println(m.Solution(input1,input2));
	}
}
