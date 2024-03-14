// package com.java.practice.sequenceForStudentHeight;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int num = Integer.parseInt(input);
		String height[] = br.readLine().split(" ");
		int heightArray[] = new int[num];
		

		for(int i = 0; i < num; i++){
			heightArray[i] = Integer.parseInt(height[i]);
		}

		int answer = 1;
		int max = heightArray[0];

		for(int i = 1; i < num; i++){
			if(heightArray[i] > max){
				max = heightArray[i];
				answer++;
			}
		}
		
		System.out.println(answer);
    }
}