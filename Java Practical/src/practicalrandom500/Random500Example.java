package practicalrandom500;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Random500Example {
	static Scanner userInput;

	public static void main(String[] args) {

		//Generating random numbers. First Create a RANDOM OBJECT.
		Random rand = new Random(); //Object + Import Random Java utility
		int r = rand.nextInt(900) + 100; //define variable for random number. [Can also be defined in loop.]
		//900+100 is Maximum and 100 is minimum
		
		//Create a TreeSet because it prevents duplicate data. So, no duplicate randoms will appear.
		Set<Integer> random500 = new TreeSet<Integer>(); //Create TreeSet Object. Import Set & TreeSet. 
		//Integer in Caps. Integer is considered a non-primitive data type or object.
		
		while(random500.size()!=500) { //Loop to keep creating random numbers until treeset is 500.
			r=rand.nextInt(900) + 100; //random variable defined for loop. 
			random500.add(r); //Adds a random number every loop.
		}
		
		System.out.println(random500);
		System.out.println("Size of Random TreeSet: " + random500.size());
		
		System.out.println("Enter a number. 1: Lowest Value. "+random500.size()+": Highest Value");
		userInput = new Scanner(System.in); //Ask User for Input
		int userData = userInput.nextInt(); //Input is an integer
		
		//Set has no .get() function so we have to convert to Array
		Object[] randomNumbersArray = random500.toArray(); //Create an object to save random numbers into an Array
		
		if(userData <= 0 || userData >=501) { //|| is OR Statement
			System.out.println("Not Possible. Enter a number between 1 and "+ random500.size());
			userInput = new Scanner(System.in);
			userData = userInput.nextInt();
			while(userData <= 0 || userData >=500) { //If the value is not 1-500, keep asking user to enter #.
				System.out.println("Not Possible. Enter a number between 1 and "+ random500.size());
				userInput = new Scanner(System.in);
				userData = userInput.nextInt();
			}
		System.out.println(randomNumbersArray[userData-1]);
		
		}
		
		else {
			System.out.println(randomNumbersArray[userData-1]); //Shows the index location of the array
			//Since Treeset is in numerical order a User Input of 1 will bring up the smallest number.
			//A User input of 500 will bring up the largest number.
			//We -1 from user input to account for the index, which starts at 0.
		}
	}
}
