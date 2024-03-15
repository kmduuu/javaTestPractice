// package = "";

import java.io.*;

class Main
{
	public boolean IsPrime(int num){
		// System.out.println(num);
		if(num == 1) return false;
		
		for(int i = 2; i < num; i++){
			if(num % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. ���� �Է¹ޱ�
		int number = Integer.parseInt(br.readLine());
		String[] numStr = br.readLine().split(" ");
		int[] numArray = new int[number];
		String answer = "";
		Main m = new Main(); // isPrime �޼ҵ� ��� ����

		for(int i = 0; i < number; i++){
			// 2. ���ڿ� ������
			numStr[i] = new StringBuffer(numStr[i]).reverse().toString();
			// 3. ���ڿ� => ������ ��ȯ
			numArray[i] = Integer.parseInt(numStr[i]);
			// 4. �Ҽ� �Ǻ���
			if(m.IsPrime(numArray[i])){
				answer += numArray[i]+" ";
			}
		}
		System.out.println(answer.substring(0,answer.length() - 1));
		br.close();
	}
}