import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Greeting{

	public static void main(String args[]){
		
		System.out.print("Please enter your name: ");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String name="";
		try {name = bf.readLine();} catch (IOException ex) {};
		
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		
		if (hour < 12) {
			System.out.println("Good Morning " + name + "!");			
		} else if (hour >=12 && hour <19) {
			System.out.println("Good Afternoon " + name + "!");
		} else if (hour >=19){
			System.out.println("Good Evening " + name + "!");
		}
	}
  
}