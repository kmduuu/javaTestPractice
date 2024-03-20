// package = "";
import java.io.*;

class Main 
{
	private int Mark(String nStr){
		
		int sum = 0;
		String[] strArray = nStr.split(" ");
		int changeMark = 0;

		for(int i = 0; i < strArray.length; i++){
			
			// System.out.println(strArray[i]); // Àß ³ª¿È
			int answer = Integer.parseInt(strArray[i]);

			if(answer == 1){
				changeMark++;
				sum += changeMark;
			}
			else{
				changeMark = 0;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) throws Exception{
		Main m = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String answerStr = br.readLine();

		System.out.println(m.Mark(answerStr));
	}
}
