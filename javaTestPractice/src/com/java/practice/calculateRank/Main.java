// package = "";
import java.io.*;

class Main
{

	private String Calculate(int num, String str){

		String answer = "";
		String[] marksArray = str.split(" ");

		for(int i = 0; i < num; i++){
			// System.out.println("marksArray : "+marksArray[i]);
			int chNum = Integer.parseInt(marksArray[i]);
			int rank = num+1;
			
			for(int j = 0; j < num; j++){
				
				int compNum = Integer.parseInt(marksArray[j]);
				
				if(chNum >= compNum){
					rank--;
				}// end of if
			}// end of for
			answer += rank+" ";
		}

		return answer;
	}

	public static void main(String[] args) throws Exception
	{
		Main m = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()); 
		String marks = br.readLine();

		System.out.println(m.Calculate(num, marks));
	}
}
