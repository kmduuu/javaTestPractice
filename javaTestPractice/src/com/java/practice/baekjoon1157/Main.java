
import java.io.*;

public class Main 
{
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 1. System.in : 키보드로 데이터를 입력받기 위해 사용
		// 2. InputStreamReader : 문자를 입력받기 위해 사용, 문자 하나씩만 입력받을 수 있음
		// 3. BufferedReader : 한 줄씩 데이터를 읽어들일 수 있는 readLine() 메서드 존재

		String str = bf.readLine().toUpperCase();

		int[] count = new int[26];
		int maxValue = 0;
		char maxChar = '?';

		for(int i = 0; i < str.length(); i++){
			
			int index = str.charAt(i) - 'A';
			++count[index];
			// System.out.println("count : "+count[index]);
			if(maxValue < count[index]) {
				maxValue = count[index]; // 가장 큰 값으로 전환
				// System.out.println(count[index]+" : "+maxValue);
				maxChar = str.charAt(i);
			}
			else if(maxValue == count[index]){
				maxChar = '?';
			}
		}
		bw.write(maxChar);

		bf.close();
		bw.close();
	}
}
