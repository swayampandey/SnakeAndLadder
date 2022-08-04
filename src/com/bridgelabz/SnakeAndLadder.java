package com.bridgelabz;

public class SnakeAndLadder {
	/**
	 * UC-2 --> Player rolls a dice to get number b/w 1 to 
	 * 
	 */


	public static void main(String[] args) {
		
		int position = 0;
		System.out.println("Position of Player1 is : " +position);
		int roll = (int)(Math.random()*(6-1))+1;
		System.out.println("Number after rolling die: " + roll);


	}

}
