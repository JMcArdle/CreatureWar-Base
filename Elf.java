import java.util.Random;

/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature {

    private static final Random r = new Random();
    private static final float PERCENTAGE = 0.10f;


    public Elf()
    {
       super();
    }

    
    public int damage() {
    
        float chance = r.nextFloat();
        
        if (chance <= PERCENTAGE) {
            return super.damage() * 2;
        }
        return 0;
    }
    
    
}
