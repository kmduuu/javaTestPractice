import java.util.*;

class Person
{
	int id;
	int priority;
	public Person(int id, int priority){
		this.id = id;
		this.priority = priority;
	}
}

class Main
{
	private int Solution(int n, int m, int[] arr){
		
		LinkedList<Person> queue = new LinkedList<>();
		int answer = 0;

		for(int i = 0; i < n; i++){
			queue.add(new Person(i,arr[i]));
		}

		while(!queue.isEmpty()){
			Person tmp = queue.poll(); // 먼저 추정 값을 빼기
			for(Person p : queue){
				if(p.priority > tmp.priority){
					queue.offer(tmp);
					tmp = null;
					break;
				} // 가능, 이유는 p의 값이 tmp보다 작은경우만 보고, 같은 경우에는 애초에 저 조건문에 못들어감
			}if(tmp != null){
				if(tmp.id == m){
					return answer+1;
				}
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) 
	{
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(main.Solution(n,m,arr));
	}
}
