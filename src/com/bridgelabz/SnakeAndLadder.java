package com.bridgelabz;

public class SnakeAndLadder {
	/**
	 * UC-6 --> Number of time dice rolled to win the game 
	 * 
	 */
		static final int WinningPosition = 100;

	public static void main(String[] args) {
		
			int position = 0, role = 0;
			int roll = (int)(Math.random()*(6-1))+1;
			System.out.println("Number after rolling die: " + roll);
			
			while(position < WinningPosition) {
				
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
				role++;
				System.out.println("Position of the Single player: " + position);

			}
			System.out.println(" \n Player wins the game!!!");
			System.out.println(" \n Number of roles to win: " + role);
	}

}
