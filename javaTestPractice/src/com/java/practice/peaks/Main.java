// package = "";
import java.io.*;
import java.util.*;

class Main
{
	protected int Tsolution(int num, int[][] grid){
		
		int answer = 0;

		return answer;
	}

	public static void main(String[] args) throws Exception	{
		Main m = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader ir = new InputStreamReader(System.in);

		// 1. 입력받기
		int num = Integer.parseInt(br.readLine());
		int gridEdge = 1;
		int grid[][] = new int[num+gridEdge][num+gridEdge];

		for(int i = 1; i < num; i++){
			for(int j = 1; j < num; j++){
				grid[i][j] = ir.read();
				ir.read();
				System.out.println();
			}
		}

		System.out.println("Hello World!");
	}
}
