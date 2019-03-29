package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Generator {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		
		Random rand = new Random();
		int ret;
		Scanner userInput= new Scanner(System.in); 
		System.out.println("type a number in, Ill print the Nth smallest :"); 
		int userValue;
		userValue=Integer.parseInt(userInput.next());  
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int counter = 0; counter < 500; counter++)
		{
			ret = rand.nextInt();
			System.out.println(ret);
			list.add(ret);
		}
		Collections.sort(list);
		System.out.println();
		System.out.println(list);
		System.out.println();
		System.out.println(list.get(userValue-1));
	

	}
}
