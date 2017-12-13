/*
Prompter class encapsulates all the I/O of the game.
The name of item should be repeated in the second prompt. For example, if the administrator specifies “gumballs” as the name of item, the next prompt should ask “What is the maximum amount of gumballs?”
Implemented by Amir Yousef
12/09/2017 - Version 1.4.0
Expectations: The prompt should read "How many jellybeans are in the jar? Pick a number between 1 and maximum".
Completed the third story: "As a player of the game, I should be shown the maximum possible number of items in the jar."
12/10/2017 - Version 2.0.0
Expectations: If the jar can only have 1,000 items, the player should be prompted with "Your guess must be less than 1000." Do not include over-the-maximum guesses in the total guess count."
Completed the extra credit story1: "Prevent the player from guessing over the maximum number of items in the jar."
12/10/2017 - Version 2.2.0
Expectations: Prompt the player with "Your guess is too high" or "Your guess is too low" depending on the player's guess.
Completed the extra credit story2: "As a player of the game, I should know if my guess is too high or too low, so that I can improve my answers and be encouraged to improve."
*/

import java.util.Scanner;																																												//Calling Scanner class library.
import java.util.Random;																																												//Calling Random class library.

public class Prompter 
{
private String name; 																																														//Class datatypes
private int max; 
private int guess;

Scanner reader = new Scanner(System.in);																																				//Created reader object from the Scanner system class to read the administrator input from System.in "keyboard".
Random random = new Random();																																										//Created random object from the Random system class to generate random mumbers.

	public void admin()																																														//Prints the admin setup menu.
	{
		System.out.println("\n\nThe Administrator's Game Settings: \n==================================");				
	}
   
  public void user()																																															//Prints the user game welcome message.
	{
		System.out.println("\n\nHow Many Are In The Jar Game Started: \n=====================================");		
	} 

	public String name()																																														//Method to return the name of items. 
	{
		System.out.println("\nWhat type of item should fill the jar? ");																							//Prompts the administrator to enter the name of items.
		name = reader.nextLine();																																											//Store the name of items from the keyboard into "name" String.
		return name;																	      																													//Returns the name of items.
	}
	
	public int size()																										  																					//Method to return the maximum size of items.
	{
		System.out.println("\nWhat is the maximum number of " + name + " the jar can hold? ");												//Prompts the administrator to enter the maximum number of items.
		int size = reader.nextInt();                                                                 									//Store the maximum number of items from the keyboard into "max" integer.
		max = size;                                                                              											//Update the maximum number with the new size. 
		return size;                                                                                  								//Returns the maximum number of items.
	}
   
	public int play()																																																//Method to return the user's guessing number. 
	{
      System.out.println("\nHow many " + name + " are in the jar? Pick a number between 1 and " + max);						//Prompts the player to enter the guessing number of items between 1 & max.
      if (!reader.hasNextInt()) 																																									//If the user's input is not a number. 
      {
      System.out.println("Your guess is not a positive number. Your game will now exit.\n");  										//Print the error message.
      System.exit(0);																																															//Exit the game. 
      }
      guess = reader.nextInt();                                                                          					//Store the guessing number of items from the keyboard into "guess" integer.
      if (guess < 1)																																															//If the user's input. 
      {
      System.out.println("Your guess is not a positive number. Your game will now exit.\n"); 											//Print the error message.
      }
      return guess;                                                                                        				//Returns the player guessing.
	}  
   
  public void maximum()																																														//Method to print "Your guess must be less than maximum fill amount." message. 
	{
      System.out.println("Your guess must be less than maximum fill amount."); 
	} 
   
  public void high()																																															//Method to print "Your guess is too high." message. 
	{
       System.out.println("Your guess is too high.");
	} 
   
  public void low()																																																//Method to print "Your guess is too low." message. 
	{
       System.out.println("Your guess is too low.");
	} 

}
