// package = "";
/* ���� ���, �ٸ� ���� */

import java.io.*;

class Main3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int []ch = new int[n+1]; // 20���� �����ϱ� ���� OG : 0~19, Now : 0~20
		int answer = 0;

		for(int i = 2; i <= n; i++){
			if(ch[i] == 0){
				answer++; // �Ҽ� �����ֱ�
				for(int j = i; j <= n; j = i+j){
					ch[j] = 1;
				}
			}
		}

		System.out.println(answer);
	}
}
