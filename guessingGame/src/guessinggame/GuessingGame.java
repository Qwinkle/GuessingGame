package guessinggame;
import java.util.Scanner;


public class GuessingGame 
{

    public static void main(String[] args) 
    {
        
        Scanner userInput = new Scanner(System.in);
        int specialNumber = 67;
        int numberOfGuesses = 0;
        int playerNumber = 0;
        
        while(playerNumber != specialNumber)
        {
            System.out.println("I am thinking of a number between 1 and 100, Guess.: ");
            playerNumber = userInput.nextInt();
            numberOfGuesses += 1;
            if(playerNumber < specialNumber)
            {    
             System.out.println("Wrong! The right number is greater than: " + playerNumber);
            } 
            else if(playerNumber > specialNumber)
            {
                System.out.println("Wrong! The right number is less than:  " + playerNumber);
            }    
            else
            {
                System.out.println("Congrats!! Number of Guesses:" + numberOfGuesses);
            }
        }
    }    
}

