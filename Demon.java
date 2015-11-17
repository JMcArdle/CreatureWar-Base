import java.util.Random;

/**
 * Write a description of class Demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    private static final Random r = new Random();
    private static final float PERCENTAGE = 0.05f;
    private int numAttacks = 1;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        super();
    }

    public int damage() {
            float chance = r.nextFloat();
            
            if (chance <= PERCENTAGE) {
                return super.damage() + 50;
            }
            return 0;
            
    }
    
    public void setNumAttacks(int numAttacks) {
        this.numAttacks = numAttacks;
    }
}
