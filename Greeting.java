import java.util.Calendar;

public class Greeting{

	public static void main(String args[]){
		
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		
		if (hour < 12) {
			System.out.println("good morning!");			
		} else if (hour >=12 && hour <19) {
			System.out.println("good afternoon!");
		} else if (hour >=19){
			System.out.println("good evening!");
		}
	}
  
}