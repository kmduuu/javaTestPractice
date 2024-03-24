// package = "";
import java.io.*;

class Main
{
    protected int Tsolution(int num, int[][] grid){
        
        int answer = 0; // 봉우리 개수
        
        for(int i = 1; i < num+1; i++){
            for(int j = 1; j < num+1; j++){
                if(j <= num+1){
                    // System.out.print(grid[i][j]); // 잘 입력되었는지 확인용
                }
                // 1. 상하좌우 값 비교
                int comp = grid[i][j];
                if(comp > grid[i+1][j] && comp > grid[i-1][j] && comp > grid[i][j-1] && comp > grid[i][j+1]){
                    // System.out.println(" grid"+"["+i+"]"+"["+j+"]"+" = "+grid[i][j]);
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception    {
        Main m = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 입력받기
        int num = Integer.parseInt(br.readLine());
        int gridEdge = 2;
        int grid[][] = new int[num+gridEdge][num+gridEdge];

        for(int i = 1; i <= num; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 1; j <= num; j++){
                grid[i][j] = Integer.parseInt(input[j-1]);
            }
        }

        System.out.println(m.Tsolution(num,grid));
    }
}
