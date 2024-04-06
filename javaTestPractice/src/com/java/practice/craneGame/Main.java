// package = "";

import java.util.*;
import java.io.*;

class Main
{
	public int Solution(int n, int grid[][], int m, int c[]){

		Stack<Integer> stack = new Stack<>();

		int answer = 0;

		for(int i = 0; i < m; i++){
			for(int j = 1; j <= n; j++){
				// System.out.println("i = "+i+", j = "+j+", c[i] = "+c[i]);
				if(grid[j][c[i]] != 0){
					if(!stack.isEmpty() && stack.peek() == grid[j][c[i]]){
						answer+= 2;
						stack.pop();
						grid[j][c[i]] = 0;
					}
					else{
						stack.push(grid[j][c[i]]);
						grid[j][c[i]] = 0;
						// System.out.println("!! "+grid[j][c[i]]);
					}
					// System.out.println(j);
					j = n+1; // n값보다 크게 해서 for문을 빠져나옴. ==> 안하면 계속 for문 돌아서 다 0으로 만듬
				}
			}
		}

		// System.out.println(stack);
			
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Main main = new Main();

		int n = sc.nextInt();
		int[][] grid = new int[n+1][n+1];
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				grid[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int c[] = new int[m];
	
		for(int i = 0; i < m; i++){
			c[i] = sc.nextInt();
		}

		System.out.println(main.Solution(n,grid,m,c));
	}
}

/* 틀린 이유*/

/*
1. 18line에 있는 if문에 grid배열을 0으로 초기화시키지 않음
2. 문제에서 요구하는 답은 사라진 인형 개수인데, 나는 답을 stack에 남아있는 수 라고 생각함

교훈 : 1번 실수는 그러려니 하지만... 2번 문항은 문제를 잘 안읽은 거 같다. 문제좀 잘 읽자.
*/
