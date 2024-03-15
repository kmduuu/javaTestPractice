// package = "";

/* 2. 배열 사용하지 않았을 때 */

import java.io.*;

public class Main2
{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int a = 1, b = 1;

		System.out.print(a+" "+b+" ");

		for(int i = 2; i < num; i++){
			int c = a + b;
			System.out.print(c+" ");
			b = a;
			a = c;
		}
	}
}
