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
			Person tmp = queue.poll(); // ���� ���� ���� ����
			for(Person p : queue){
				if(p.priority > tmp.priority){
					queue.offer(tmp);
					tmp = null;
					break;
				} // ����, ������ p�� ���� tmp���� ������츸 ����, ���� ��쿡�� ���ʿ� �� ���ǹ��� ����
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
