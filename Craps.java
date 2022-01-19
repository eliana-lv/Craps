
/**
 * Craps.java
 *
 * @author Eliana Longoria-Valenzuela 
 * @version 01-18-21
 */
import java.util.Scanner; 

public class Craps
{
    /**
     * Prints instructions for Craps game if user asks
     */
    public static void getInstructions()
    {
        System.out.println(" 1. Roll two six-sided dice.");
        System.out.println("2. On first roll, if you get a 7 or 11 you win!");
        System.out.println("3. On first roll, if you get a 2, 3, or 12 you lose!");
        System.out.println("4. Any other number you don't win or lose. The die roll becomes your 'point.'");
        System.out.println("5. Keep rolling the dice again until: ");
        System.out.println("6. You roll the point again and win!");
        System.out.println("7. or you roll a 7 and lose.");
    }

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("Welcome to the game of Craps!");
            Scanner in = new Scanner(System.in);
            System.out.println("Do you need instructions? (Y/N)");
            String answer = in.nextLine();
            if (answer.equalsIgnoreCase("Y"))
            {
                getInstructions();
            }
            System.out.println("Let's start!");
            System.out.println("Press <enter> to roll the dice");
            in.nextLine();
            Die first = new Die();
            first.rollDie();
            int roll1 = first.getResults();
            System.out.println("You rolled a " +roll1);
            if (
            roll1 == 2 || 
            roll1 == 3 || 
            roll1 == 12)
            {
                System.out.println("Oh No! you lose! Better luck next time");
                //if this if clause is fufilled, the user's game will end and gbe asked if they wnat to play again
            }
            else if (
            roll1 == 7 ||
            roll1 == 11)
            {
                System.out.println("Congratulations! You win!");
            }
            else
            {
                boolean KeepPlaying = true;
                while (KeepPlaying == true)
                {
                    int point = roll1; //renaming roll1 to point 
                    System.out.println("Now,try to roll: " + roll1 + ".");
                    System.out.println("Press <enter> to roll the dice");
                    in.nextLine();
                    Die again = new Die(); //not specific to a
                    again.rollDie();
                    int rollAgain = again.getResults(); //do not declare again 
                    System.out.println("You rolled a " +rollAgain);
                    if (rollAgain == point)
                    {
                        System.out.println("You rolled a " +rollAgain);
                        System.out.println("Congratulations! You Win!");
                        KeepPlaying = false; //breaks playing loop
                    }
                    else if(rollAgain == 7)
                    {
                        System.out.println("You rolled a " +rollAgain);
                        System.out.println("You lose!");
                        KeepPlaying = false; 
                    }
                }
                System.out.println("Good game!");
            }
            System.out.println("Do you want to play again?(Y/N): "); //loops while true
            if (in.nextLine().equalsIgnoreCase("N"))
            {
                break;
            }
        }
    }
}
