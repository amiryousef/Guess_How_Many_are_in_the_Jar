/*
GuessingGame class is the driver class that contains main() method to run the project "Guess How Many Are in the Jar?".
Implemented by Amir Yousef
12/03/2017 - Version 1.0.0
Expectations: Program contains a Jar class with a constructor that accepts an item name and a maximum number. 
Completed the first story: "As an administrator of the game, I should be able to specify what type of item will be stored in the jar, as well as the total how many could reasonably fit in jar, so that the game stays in the bounds of reality."
12/06/2017 - Version 1.2.0
Expectations: fill method that uses the Random class to fill a jar with a random number of items. Jar always contains a random number of items between one item and the maximum.
Completed the second story: "As a player of the game, for each new game I should be presented with a new jar filled with a random number of items, so that I can play multiple games and still find the game challenging."
12/09/2017 - Version 1.4.0
Expectations: The prompt should read "How many jellybeans are in the jar? Pick a number between 1 and maximum".
Completed the third story: "As a player of the game, I should be shown the maximum possible number of items in the jar."
12/10/2017 - Version 1.6.0
Expectations: Use a while loop to prompt the user for a new guess until the correct answer is guessed.
Completed the fourth story: "As a player of the game, I should be prompted to guess the number of the items until I get the correct answer."
12/10/2017 - Version 1.8.0
Expectations: Your winning message should be in this format: "You got it in X attempt(s)". When returning the number of guesses, be careful of off by 1 errors! 
Completed the fifth story: "As a winner of the game, I should know how many attempts it took me to get to the right answer, so that I am encouraged to beat my score."
12/10/2017 - Version 2.0.0
Expectations: If the jar can only have 1,000 items, the player should be prompted with "Your guess must be less than 1000." Do not include over-the-maximum guesses in the total guess count."
Completed the extra credit story1: "Prevent the player from guessing over the maximum number of items in the jar."
12/10/2017 - Version 2.2.0
Expectations: Prompt the player with "Your guess is too high" or "Your guess is too low" depending on the player's guess.
Completed the extra credit story2: "As a player of the game, I should know if my guess is too high or too low, so that I can improve my answers and be encouraged to improve."
*/

public class GuessingGame                      																//Driver class to run the game. 
{
    public static void main(String[] args)     																//Start execution at main().
	{
		Prompter prompter = new Prompter();    																		//Instantiate Prompter class object.
		prompter.admin();                      																		//Calls admin() method to print the admin's menu.
    String name = prompter.name();																						//Calls name() method to get the item name.
		int max = prompter.size();             																		//Calls size() method to get the max jar size.
		Jar jar = new Jar (name, max);        																		//Instantiate Jar class object to initializ the items name and number.
		int rand = jar.fill();                 																		//Call fill() method to fill a jar with a random number of items.
		prompter.user(); 																													//Call user() method to print the user's game welcome message.
    int attempt = 0;																													//Declared attempts to store the user attempts.
		int guess = prompter.play();																							//Declared guess to call play() to store the user's guessing number.
    while (guess >= 1)																												//Loop the user guessing number.
		{
    if(guess == rand)																													//If the user's guess == random items number. 
		{
    ++attempt;							   																								//Increment the number of user attempts.
    System.out.println("You got it in " + attempt + " attempt(s).\n");				//Print the "You got it in X attempt(s)" message.
    System.exit(0);																														//Exit the program successfully. 
		}
    else if(guess > rand)																											//If the user's guess > random items number.
		{
		prompter.high(); 																													//Call high() method to print the corresponding user error message.
		++attempt;																																//Increment the number of user attempts.
    guess = prompter.play();																									//Call play() to store the user's guessing number.												
    }																																					//Increment the number of user attempts.
		else if(guess < rand)																											//If the user's guess < random items number.
		{
		prompter.low(); 																													//Call low() method to print the corresponding user error message.
		++attempt;																																//Increment the number of user attempts.
		guess = prompter.play();																									//Call play() to store the user's guessing number.
    }
    else if(guess > max)																											//If the user's guess > maximum items number.
		{
		prompter.maximum();																												//Call maximum() method to print the corresponding user error message.
		++attempt;																																//Increment the number of user attempts.
		guess = prompter.play();																									//Call play() to store the user's guessing number.
    }
    }
	}
}
