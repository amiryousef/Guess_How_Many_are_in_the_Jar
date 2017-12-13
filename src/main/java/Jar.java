/*
Jar class accepts an item name and a max number of items that can fit in the jar. 
Implemented by Amir Yousef
12/03/2017 - Version 1.0.0
Expectations: Program contains a Jar class with a constructor that accepts an item name and a maximum number. 
Completed the first story: "As an administrator of the game, I should be able to specify what name of item will be stored in the jar, as well as the total how many could reasonably fit in jar, so that the game stays in the bounds of reality."
12/06/2017 - Version 1.2.0
Expectations: fill method that uses the Random class to fill a jar with a random number of items. Jar always contains a random number of items between one item and the maximum.
Completed the second story: "As a player of the game, for each new game I should be presented with a new jar filled with a random number of items, so that I can play multiple games and still find the game challenging."
*/

import java.util.Random;										//Using Random class.

public class Jar	
{
private String name; 												//Class datatypes.
private int max;
private int rand;

Random random = new Random();	       			 	//Declared random object.
Prompter prompter = new Prompter();     		//Declared prompter object.

	public Jar (String item, int size)				//Jar class constructor accepts an item name and a maximum number.
	{
		name = item;                         		//Initialize the name of the items.
		max = size;                           	//Initialize the maximum number of items.
  }
	
	public int fill()		                       //Method to return the random item number to be guessed.	
	{
		rand = random.nextInt(max) + 1;      		//Generated random number.    
		return rand;    												//Return the random number.                          
	}
      
}