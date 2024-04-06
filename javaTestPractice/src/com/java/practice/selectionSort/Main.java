import java.util.*;

/*��������, ����for������ �ð����⵵O(n^2)*/

class Main
{
	private int[] Solution(int n, int[] arr){

		int temp = 0, min = 0;
		// �ּҰ� Ž��, ���������� �� ��ü
		for(int i = 0; i < n; i++){
			min = arr[i];
			for(int j = n-1; j > i; j--){
				// �ּҰ� �˻�
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
