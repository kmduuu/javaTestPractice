// package = "";
import java.util.*;

class Main 
{
	private String Solution(String[] strArr){
	
		String ans = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : strArr[0].toCharArray()){
			map.put(c,map.getOrDefault(c,0)+1);
		}

		for(char c : strArr[1].toCharArray()){
			if(!map.containsKey(c) || map.get(c) == 0) return "NO";
			else{
				map.put(c, map.get(c)-1);
			}
		}

		return ans;
	}
	

	public static void main(String[] args) 
	{
		Main m = new Main();
		Scanner sc = new Scanner(System.in);

		String strArray[] = new String[2];

		for(int i = 0; i < 2; i++){
			strArray[i] = sc.nextLine();
		}

		System.out.println(m.Solution(strArray));
	}
}
