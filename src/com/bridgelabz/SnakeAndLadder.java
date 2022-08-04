package com.bridgelabz;

public class SnakeAndLadder {
	/**
	 * UC-3 --> Player checking for condition that is Ladder
	 * snake and no play using  random function 
	 * 
	 */


	public static void main(String[] args) {
		
			int position = 0;
			int roll = (int)(Math.random()*(6-1))+1;
			System.out.println("Number after rolling die: " + roll);
			
			int option = (int)(Math.random() * 10 ) % 3;
			System.out.println("Option : "+option);
			switch (option) {
			case 1:
				System.out.println("It's Ladder!!");
				position +=roll;
				break;
			case 2:
				System.out.println("It's is Snake!!");
				position -=roll;
				if(position<0)
					position = 0;
				break;
			default:
				System.out.println("No Play!!");
			}
			System.out.println("Position of the Single player: " + position);


	}

}
