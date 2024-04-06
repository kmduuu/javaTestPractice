// package = "";

import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp = 0;

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int t : arr){
			System.out.print(t+" ");
		}
	}
}
