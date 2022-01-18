
/**
 * Write a description of class Craps here.
 *
 * @author Eliana Longoria-Valenzuela 
 * @version 01-11-21
 */
import java.util.Scanner; 

public class Craps
{
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
        }
        else if (
        roll1 == 7 ||
        roll1 == 12)
        {
            System.out.println("Congratulations! You win!");
        }
        System.out.println("You got a point! Your point is: " + roll1 + ".");
        System.out.println("Let's roll again!"); 
        Die second = new Die(); 
        second.rollDie();
        int roll2 = second.getResults();
        while (roll2 != roll1 || roll2 != 7)
        {
           System.out.println("You rolled a " +roll2);
            Die third = new Die();
            third.rollDie();
            roll2 = third.getResults();
            System.out.println("You rolled a " +roll2);

        }
        if (roll2 == roll1)
        {
            System.out.println("You rolled a " +roll2);
            System.out.println("Congratulations! You Win!");
        }
        else if( roll2 == 7)
        {
           System.out.println("You rolled a " +roll2);
           System.out.println("You lose!");
        }
    }
}
