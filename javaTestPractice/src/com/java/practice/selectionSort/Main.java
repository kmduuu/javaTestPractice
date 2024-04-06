import java.util.*;

/*선택정렬, 이중for문으로 시간복잡도O(n^2)*/

class Main
{
	private int[] Solution(int n, int[] arr){

		int temp = 0, min = 0;
		// 최소값 탐색, 순서에따라 값 교체
		for(int i = 0; i < n; i++){
			min = arr[i];
			for(int j = n-1; j > i; j--){
				// 최소값 검색
				if(min > arr[j]){
					min = arr[j];
					temp = j;
				}
			}
			if(min != arr[i]){
				arr[temp] = arr[i];
				arr[i] = min;
			}
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		Main m = new Main();
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int ans : m.Solution(n,arr)){
			System.out.print(ans+" ");	
		}
	}
}
