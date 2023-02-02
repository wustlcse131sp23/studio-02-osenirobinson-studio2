package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("startAmount");
		int startAmount = in.nextInt();
	
		System.out.println("winChance");
		double winChance = in.nextDouble();
	
		System.out.println("winLimit");
		int winLimit = in.nextInt();
		
		System.out.println("looseLimit");
		int looseLimit = in.nextInt();
	
		System.out.println("Balance");
		int balance = startAmount;
		
		//if winLimit is = 150, then "success"
		//if winLimit is = 0, then "ruin"
		
		while (balance >= winLimit && balance <= winLimit)
		{ if (Math.random() < winChance);
			{ balance --; }
			
		{ if (Math.random() > winChance);
			{balance ++; }
		}
		}
		System.out.println (balance);
		
	}

}
