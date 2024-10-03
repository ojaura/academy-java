package com.bptn.course._daily_challenges._week2._monday;

import java.util.Scanner;

public class Player {
	
	//Declare instance variables- player names, player numbers
	private String name; // Specifies this player’s name
	private int playerNumber; // Specifies the number of the player’s token
	
	//Create constructor for Player object
	public Player(String name, int playerNumber) {
		this.name = name; // sets instance variable to the name argument
		this.playerNumber = playerNumber;  // sets instance variable to the playerNumber argument
	}
	
	//Create Scanner object
	private static Scanner scan = new Scanner(System.in);
	
	//Create methods
	
	//Create getName() method- returns the player's name
	public String getName() {
		return name;
	}
	
	//Create getPlayerNumber() method- returns the player's number
		public String getPlayerNumber() {
			return playerNumber;
		}
		
	//Create makeMove() method- returns the value of the move made by player
	public int makeMove() {
		System.out.println("Make your move. What column do you want to put a token in?");
		int column = scan.nextInt();
		return column;
	}
	
	//Create toString() method
	@Override
	public String toString() {
		return "Player [" + playerNumber + "] is [" + name + "]";
	}



	public static void main(String[] args) {
		Player p1 = new Player("Uche", 1);
		System.out.println(p1.name);
		p1.toString();

	}

}

//Player
//create constructor that sets player's names and numbers to instance variables'
//create getName() method and getPlayerNumber() method-- player number represents player token (1 = player1 etc.)
//create makeMove method() -- prompt user for the column they want to drop their token in, then return the value