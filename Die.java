
/**
 * Write a description of class Die here.
 *
 * @author Eliana LV
 * @version 01-11-21
 */
public class Die
{
    // instance variables - replace the example below with your own
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
        dice1 = (int) (Math.random() * 6);
        dice2 = (int) (Math.random() * 6 );
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getResults()
    {
        // put your code here
        return dice1 + dice2;
    }
}
