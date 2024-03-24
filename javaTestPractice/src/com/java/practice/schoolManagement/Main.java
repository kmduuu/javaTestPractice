import java.util.*;
class Main {	
	public int solution(int n, int m, int[][] arr){
		int answer=0;
		for(int i=1; i<=n; i++){ // 학생 번호
			for(int j=1; j<=n; j++){ // 학생 번호
				int cnt=0;
				for(int k=0; k<m; k++){
					int pi=0, pj=0;
					for(int s=0; s<n; s++){
							// System.out.println("i의 값 : "+i+", j의 값 : "+j);
						if(arr[k][s]==i && i != j) {pi=s;
							System.out.println("i의 값 : "+i+", j의 값 : ");
							System.out.println("arr["+k+"]"+"["+s+"] = "+i);
							System.out.println("pi의 값 : "+pi);
						}
						if(arr[k][s]==j && i != j) {pj=s;
							System.out.println("arr["+k+"]"+"["+s+"] = "+j+"(pj)");
							System.out.println("pj의 값 : "+pj);
						}
					}
					if(pi<pj) {
						
						cnt++;
						// System.out.println(cnt);}

				}
				if(cnt==m){
					answer++;
					//System.out.println(i+" "+j);
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}