import java.io.*;

class Main
{
	private int Solution(int n, int k, int arr[]){
		
		int answer = 0, sum = 0;

		// int r1 = 0;
		// int r2 = k-1;

		// for(int i = 0; i < n-k+1; i++){
		//	sum = 0;
		//	while(r1 <= r2){
		//		sum += arr[r1++];
		//	}
		//	answer = Math.max(answer, sum);
		//	r1 = r1-k+1;
		//	r2++;
		//}
		
		for(int i = 0; i < k; i++){
			sum += arr[i];
		}
		answer = sum;
		// 처음 부분 k-1 까지 다 더하고 시작하기
		
		for(int i = k; i < n; i++){
			sum += (arr[i]-arr[i-k]); // ==> 가장 앞에있는 값을 빼서 계산
			answer = Math.max(answer, sum); // ==> Util의 Math 사용
		}

		return answer;
	}

	public static void main(String[] args) throws IOException{
		Main m = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input1 = br.readLine().split(" ");

		int days = Integer.parseInt(input1[0]);
		int contDays = Integer.parseInt(input1[1]);
		
		int[] revenues = new int[days];
		String[] input2 = br.readLine().split(" ");

		for(int i = 0; i < days; i++){
			revenues[i] = Integer.parseInt(input2[i]);
		}
		System.out.println(m.Solution(days, contDays, revenues));
	}
}
