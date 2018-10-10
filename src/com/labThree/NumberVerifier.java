package com.labThree;

import java.util.Scanner;

public class NumberVerifier {

	public static void NumberVerify() {

		
		
		int testNumber; //the number to be verified
		char userOption; //choice to continue (Y/N)
		boolean continueLoop = true; //allows repeated "Would you like to continue" prompt if user enters an invalid value
		String userName; //the user's name

		
		//new scanner to allow for user input
		
		Scanner scnr = new Scanner(System.in);	

		//I ask for the user's name
		
		System.out.println("Welcome to the Grand Circus number verifier!"
				+ "\nSorry, I might have forgotten.. What was your name again?:");
			userName = scnr.next();
			
		//I greet the user and prompt them to enter the test number
			
			System.out.println("\nOf course, " + userName + "! How could I have forgotten."
					+ "\nPlease enter an integer between 0 and 100:");
			testNumber = scnr.nextInt();
			
			//I validate that the test number is between 1 and 100
			//If the user enters an invalid number, I ask them if they'd like to continue.
			//If they enter an invalid value, the question is repeated.
			
			if (testNumber < 1 || testNumber > 100) {
				
				System.out.println("\nPlease make sure your integer is between 1 and 100, " + userName + "!");
				
				while (continueLoop) {
					
					System.out.println("\nWould you like to continue, " + userName + "? Please only enter Y/N:");
					userOption = scnr.next().charAt(0);
					
						if (userOption == 'Y' || userOption == 'y') {
							
							NumberVerify();
							
						}
						else if (userOption == 'N' || userOption == 'n') {
							
							System.out.println("\nGoodbye!");
							System.exit(0);
							
						}

				}
				
			}	
			
			//I test the number against the specifications in the lab instructions and print the results accordingly.
			
			if ((testNumber % 2 == 0) && 2 <= testNumber && 25 >= testNumber) {
				
				System.out.println("\nEven and less than 25.");
				
			}
			else if ((testNumber % 2 == 0) && 26 <= testNumber && 60 >= testNumber){
				
				System.out.println("\nEven.");
				
			}
			else if ((testNumber % 2 == 0) && testNumber > 60) {
				
				System.out.println("\n" + testNumber + " Even.");
				
			}
			else if ((testNumber % 2 != 0) && testNumber <= 60) {
				
				System.out.println("\n" +testNumber + " Odd.");
			}
			else if ((testNumber % 2 != 0) && testNumber > 60) {
				
				System.out.println("\nOdd and over 60 - not like you, " + userName + "."
						+ "\nYou'll always be young and hip!");	
			}
			
			//I ask the user if they'd like to continue. If they enter an invalid value, the question is repeated.
			
			while (continueLoop) {
			
				System.out.println("\nWould you like to continue, " + userName + "? Please only enter Y/N:");
				userOption = scnr.next().charAt(0);
				
					if (userOption == 'Y' || userOption == 'y') {
						
						NumberVerify();
						
					}
					else if (userOption == 'N' || userOption == 'n') {
						
						System.out.println("\nGoodbye, " + userName + "!");
						System.exit(0);
						
					}

			}
	
			scnr.close();

	}
	
	public static void main (String [] args) {
			
		NumberVerify();
			
	}
	
}
