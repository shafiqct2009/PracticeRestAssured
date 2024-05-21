package SelfPractice.PracticeatHome;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner (System.in);
		 	System.out.println ("Enter a number");	
		 try {	
		 	int number = input.nextInt();
		 	System.out.println(number/2);
		 }
		 catch (Exception e) {
			 System.out.println ("An error occurd,Please run the code again!");
			 System.out.println(e);
			 
		 }
		
		
		

	}

}
