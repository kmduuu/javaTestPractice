// package = "";
import java.io.*;

class Main
{
    protected int Tsolution(int num, int[][] grid){
        
        int answer = 0; // ���츮 ����
        
        for(int i = 1; i < num+1; i++){
            for(int j = 1; j < num+1; j++){
                if(j <= num+1){
                    // System.out.print(grid[i][j]); // �� �ԷµǾ����� Ȯ�ο�
                }
                // 1. �����¿� �� ��
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

        // 1. �Է¹ޱ�
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
