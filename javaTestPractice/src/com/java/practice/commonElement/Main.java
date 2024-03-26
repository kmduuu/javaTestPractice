// package = "";

import java.util.*;

class Main
{
	private String Solution(int n1, int[] arr1, int n2, int[] arr2){
		
		int p1 = 0, p2 = 0;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		String answer = "";
		
		for(; p1 < n1 && p2 < n2; ){
			// System.out.println("arr1 : "+arr1[p1]+" arr2 : "+arr2[p2]);
			if(arr1[p1] != arr2[p2]){
				if(arr1[p1] > arr2[p2]){
					p2++;
				}
				else{
					p1++;
				}
			}else{
				// System.out.println("같은 경우 발생, 값은 "+arr1[p1]);
				answer += arr1[p1]+" ";
				p1++;
				p2++;
			}

		}
		
		return answer;
	}

	public static void main(String[] args) 
	{
		
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
	
		int num1 = sc.nextInt();
		int array1[] = new int[num1];
		
		for(int i = 0; i < num1; i++){
			array1[i] = sc.nextInt();
		}
		
		int num2 = sc.nextInt();
		int array2[] = new int[num2];
		
		for(int i = 0; i < num2; i++){
			array2[i] = sc.nextInt();
		}
		System.out.println(m.Solution(num1, array1, num2, array2));
	}
}
