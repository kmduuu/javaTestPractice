
import java.io.*;

public class Main 
{
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 1. System.in : Ű����� �����͸� �Է¹ޱ� ���� ���
		// 2. InputStreamReader : ���ڸ� �Է¹ޱ� ���� ���, ���� �ϳ����� �Է¹��� �� ����
		// 3. BufferedReader : �� �پ� �����͸� �о���� �� �ִ� readLine() �޼��� ����

		String str = bf.readLine().toUpperCase();

		int[] count = new int[26];
		int maxValue = 0;
		char maxChar = '?';

		for(int i = 0; i < str.length(); i++){
			
			int index = str.charAt(i) - 'A';
			++count[index];
			// System.out.println("count : "+count[index]);
			if(maxValue < count[index]) {
				maxValue = count[index]; // ���� ū ������ ��ȯ
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
