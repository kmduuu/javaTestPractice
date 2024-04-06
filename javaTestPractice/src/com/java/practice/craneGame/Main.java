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
					j = n+1; // n������ ũ�� �ؼ� for���� ��������. ==> ���ϸ� ��� for�� ���Ƽ� �� 0���� ����
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

/* Ʋ�� ����*/

/*
1. 18line�� �ִ� if���� grid�迭�� 0���� �ʱ�ȭ��Ű�� ����
2. �������� �䱸�ϴ� ���� ����� ���� �����ε�, ���� ���� stack�� �����ִ� �� ��� ������

���� : 1�� �Ǽ��� �׷����� ������... 2�� ������ ������ �� ������ �� ����. ������ �� ����.
*/
