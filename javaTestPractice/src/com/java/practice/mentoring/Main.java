// package = " ";

import java.io.*;
import java.util.*;

class Main
{
	public int Solution(int n, int m, int arr[][]){
		
		String mathMark = "";

		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<String, Integer> countMap = new HashMap<>();

		for(int i = 0; i < n; i++){ // 첫째부터 계속 다음 줄 내려가서 검사
			for(int j = 0; j < m; j++){ // 
				for(int k = 0; k < m; k++){
					// System.out.println("j값 : "+j+", "+"k값 : "+k);
					if(j != k && j < k){
						// System.out.println(arr[i][j]+", "+arr[i][k]);
						if(i == n-1 && j == m-1 && k == m-1){
							mathMark += arr[i][j]+""+arr[i][k];
						}
						else{
							mathMark += arr[i][j]+""+arr[i][k]+" ";
						}
						
					}
				}
			}
		}
		
		/* m개 값을 가지고 있는 수 찾기 */
		String numArray[] = mathMark.split(" ");

		// 숫자 등장 횟수 카운트
		for(int i = 0; i < numArray.length; i++){
			countMap.put(numArray[i],countMap.getOrDefault(numArray[i],0) + 1);
		}
		
		// 등장 횟수가 3 이상인 숫자 Count
		
		for(Map.Entry<String, Integer> entry : countMap.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue() == n){
				ans.add(1);
			}
		}

		return ans.size();
	}

	public static void main(String[] args) throws Exception{
		Main m = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] numStr = br.readLine().split(" "); // 1. N과 M 입력받기
		int column = Integer.parseInt(numStr[0]);
		int raw = Integer.parseInt(numStr[1]);
		int arr[][] = new int[raw][column];

		for(int i = 0; i < raw; i++){
			String[] test = br.readLine().split(" ");
			for(int j = 0; j < column; j++){
				arr[i][j] = Integer.parseInt(test[j]);
			}
		}

		System.out.println(m.Solution(raw, column, arr));
		
		br.close();
	}
}
