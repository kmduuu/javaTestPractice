import java.util.*;

class Main2
{
	private int Solution(int num1, int num2, int[][] arr){

		int answer = 0;
		int p1 = 0, p2 = 0;
		int count = 0;

		// �˻縦 ��� �ؾ���

		for(int i = 1; i <= num2; i++){ // i = 1,2,3,4
			for(int j = 1; j <= num2; j++){ // j = 1,2,3,4
				count = 0;
				for(int k = 0; k < num1; k++){ // raw
					p1 = 0;
					p2 = 0;
					for(int s = 0; s < num2; s++){ // column
						if(arr[k][s] == i) p1 = s; // �̹� s���� ���ֱ� ������ s���� ���߿� �����ϴ��� if���� �۵����ϸ� ����X
						if(arr[k][s] == j) p2 = s;
						// System.out.println("i�� �� : "+i+", p1�� �� : "+p1);
						// System.out.println("j�� �� : "+j+", p2�� �� : "+p2);
					}
					if(p1 < p2) {
					count++;
					// System.out.println(count);
					}
				}
				if(count == num1) {
					answer++;
			}
		}
	}
		return answer;
	}

	public static void main(String[] args) 
	{
		Main2 ma = new Main2();
		Scanner sc = new Scanner(System.in);

		int column = sc.nextInt();
		int raw = sc.nextInt();
		// System.out.println("��������");
		int[][] array = new int[raw][column];

		for(int i = 0; i < raw; i++){
			for(int j = 0; j < column; j++){
				array[i][j] = sc.nextInt();
			}
		}

		System.out.println(ma.Solution(raw, column, array));
	}
}
