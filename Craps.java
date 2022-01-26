
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
            if (answer.substring(0,1).equalsIgnoreCase("Y"))
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
                        System.out.println("Congratulations! You Win!");
                        KeepPlaying = false; //breaks playing loop
                    }
                    else if(rollAgain == 7)
                    {
                        System.out.println("You lose!");
                        KeepPlaying = false; 
                    }
                }
                System.out.println("Good game!");
            }
            System.out.println("Do you want to play again?(Y/N): "); //loops while true
            answer = in.nextLine();
            if (answer.substring(0,1).equalsIgnoreCase("N"))
            {
                break;
            }
        }
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

This is a perfectly functional little program, Eliana, that correctly implements
the rules of the game of Craps--nice work!

There is always room for improvement, however! ;)  Here are a couple of things I
noticed.

1. You have a boolean variable `KeepPlaying`. You should name variables with a
   lowercase first letter, and use uppercase first letters for class names. That's
   not a Java rule, but that's a rule that all Java programmers have decided to 
   follow, and you should, too.

2. You have some Yes/No questions that the user has to answer in the game, and  
   one of the details metioned in the handout was implementing a "default value"
   for these questions, so that the user can indicate Yes (or No) simply by
   hitting the [Enter] key. That's a really useful feature that makes playing the
   game much better. You should take a look at that part of the assignment and
   use it in future projects.

Otherwise, this is just wonderful. I'm looking forward to seeing more of your work
in our upcoming projects!

SCORE: 48/50

*/

