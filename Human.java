
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Creature
{
   private static final int MAXIMUM_HIT_POINTS = 30;
   private static final int MAXIMUM_STRENGTH = 18;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super();
    }

   public void setHP(int hp) {
       if (hp > MAXIMUM_HIT_POINTS) {
           super.setHP(hp);
        } else {
            System.out.println("Hit points cannot be greater than " + MAXIMUM_HIT_POINTS);
        }
    }
    
   public void setStrength(int strength) {
       if (strength > MAXIMUM_STRENGTH) {
           super.setStrength(strength);
        } else {
            System.out.println("Strength cannot be greater than " + MAXIMUM_STRENGTH);
        }
    }
    
    
}
