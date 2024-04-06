// package = "";

import java.util.*;

class Main4
{
	public int Solution(int n, int k){
		
		Queue<Integer> queue = new LinkedList<>();

		int answer = 0;
		
		// 1. 1~8 �� queue�� �����ϱ�
		for(int i = 1; i <= n; i++){
			queue.add(i);
		}

		// 2. queue���� ����°�� �ƴϸ� �����ϰ� �ڷ� ������.
		while(!queue.isEmpty()){
			for(int i = 1; i <= k; i++){
				// System.out.println(queue);	
				if(i == (k)){
					int bye = queue.poll();
					// System.out.println("remove : "+bye);
					break;
				}
				queue.add(queue.poll());
			}
			if(queue.size() == 1){
				answer = queue.peek();
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) 
	{
	
		Main m = new Main();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(m.Solution(n,k));
	}
}
