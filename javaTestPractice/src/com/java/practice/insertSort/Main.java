// package = "";

import java.util.*;


/* �������� ���� �ٽ� �����ϱ� */
class Main
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		int j = 0;

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 1; i < n; i++){
			int temp = arr[i]; // 5
			for(j = i-1; j >= 0; j--){	
				if(temp < arr[j]){ // 5 < 8
					arr[j+1] = arr[j];
				} // ������ ��� �ؾ�����?
			}arr[j+1] = temp;
		}
		for(int t : arr){
			System.out.print(t+" ");
		}
	}
}
