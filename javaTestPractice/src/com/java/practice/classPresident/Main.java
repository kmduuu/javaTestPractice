// package = "";

import java.util.*;

class Main
{
	private char Solution(int num, String str){
		
		Map<Character, Integer> map = new HashMap<>();

		int max = 0;
		char ans = ' ';

		for(char tmp : str.toCharArray()){
			map.put(tmp, map.getOrDefault(tmp,0)+1);
			if(map.getOrDefault(tmp,0) > max){
				max = map.getOrDefault(tmp,0);
				ans = tmp;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) 
	{
		Main m = new Main();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String vt = sc.next();
		System.out.println(m.Solution(n,vt));
	}
}
