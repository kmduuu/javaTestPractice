// package = "";

import java.io.*;
import java.util.*;

class Main
{
	private void Solution(int n, int k, int arr[]){
		
		TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
		// Iterator<Integer> iterator = tree.iterator();
		
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){ // j = 1로 두면 초기화가 되서 다시 1부터 시작하게됨. 그거 방지해야함
				for(int l = j+1; l < n; l++){
					tree.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int count = 0;
		for(int element : tree){
			count++;
			if(count == k){
				System.out.println(element);
				break;
			} 
		}if(count != k) System.out.println(-1);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Main m = new Main();

		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		m.Solution(n,k,arr);
	}
}
