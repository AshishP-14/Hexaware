package training;
import java.util.*;

public class HelloWorld {
	static String greet = "hello";
	
	static Date today ;
	
	public static void main(String args[]) {
		
			System.out.println("Hello world");
			System.out.println( greet + " from Ashish ");
//			System.out.println(greet+ " " +args[0] +" " + args[2]); 
			
			today = new Date();
			System.out.println("todays date and time is" + today);
			
			
			int a =10;
			int b = 33;
			System.out.println(a+b);
			
	}

}
