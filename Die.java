
/**
 * Die Class
 * @author Eliana LV
 * @version 01-11-21
 */
public class Die
{
    private int dice1;
    private int dice2;
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        int dice1 = 0; 
        int dice2 = 0; 
    }
    /**
     * method to randomly roll two die. 
     */
    public void rollDie()
    {
        dice1 = (int) (Math.random() * 6 +1);
        dice2 = (int) (Math.random() * 6 +1 );
    }
    
    /**
     * calculates sum of the two die and returns result.
     * @return    the sum of dice1 and dice2
     */
    public int getResults()
    {
        return dice1 + dice2; //adds two dice before main game 
    }
}
