// package = "";

import java.io.*;

class MainMod
{
	private int Appoint(int num, int nArray[][]){
		
		int answer = 0;
		int max = Integer.MIN_VALUE; // => ���� ���� �ϴ� �ּҰ����� ��Ƶд�.

		for(int i = 1; i <= num; i++){ // �л���ȣ
			int cnt = 0;
			for(int j = 1; j <= num; j++){ // ��
				for(int k = 1; k <= 5; k++) // ��
				{
					System.out.println(nArray[i][k]+", "+nArray[j][k]);
					if(i != j && nArray[i][k] == nArray[j][k]){
						cnt++;
						break;
					}
				}
			}
			if(max < cnt){
				if(answer < i){

					System.out.println(i+"��° �л� ����, "+"cnt ���� "+cnt);
					answer = i;
					max = cnt;
				}
			}
		} // end of for

		return answer;
	} // end of method

	public static void main(String[] args) throws Exception
	{
		MainMod m = new MainMod();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int [][] nArray = new int[num+1][6];

		for(int i = 1; i <= num; i++){
			String[] inputArray = br.readLine().split(" ");
			for(int j = 1; j < 6; j++){
				// System.out.println("i = "+i+", j = "+j);
				nArray[i][j] = Integer.parseInt(inputArray[j-1]);
			}
		} // end of for
		System.out.println(m.Appoint(num, nArray));
	}
}
