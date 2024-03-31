// package = "";

import java.util.*;
import java.io.*;

class Main
{
	public ArrayList Solution(int n, int k, int rev[]){
		
		ArrayList<Integer> answer = new ArrayList<>();

		HashMap<Integer,Integer> map = new HashMap<>();

		// 1. 초기값 정하기
		for(int i = 0; i < k; i++){
			map.put(rev[i], map.getOrDefault(rev[i],0)+1);
		}
		answer.add(map.size());
		
		int lt = 0;
		int rt = k;

		while(rt < n){
			if(map.get(rev[lt])==1){
				map.remove(rev[lt]);
				map.put(rev[rt], map.getOrDefault(rev[rt],0)+1);
			}else{
				map.put(rev[lt], map.getOrDefault(rev[lt],0)-1);
				map.put(rev[rt], map.getOrDefault(rev[rt],0)+1);
			}
			lt++;
			rt++;
			answer.add(map.size());
		}

		return answer;
	}

	public static void main(String[] args) throws Exception{
		Main m = new Main();
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] part = str.split(" ");
		int n = Integer.parseInt(part[0]);
		int k = Integer.parseInt(part[1]);

		str = br.readLine();
		part = str.split(" ");

		int rev[] = new int[n];

		for(int i = 0; i < n; i++){
			rev[i] = Integer.parseInt(part[i]);
		}

		for(Object ans : m.Solution(n,k,rev)){
			System.out.print(ans+" ");
		}
	}
}
