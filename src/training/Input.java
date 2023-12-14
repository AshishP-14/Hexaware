package training;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		System.out.println("Your number is :  "+ num);
		System.out.println("Your String is :  "+str);
		sc.close();
		
	}

}
