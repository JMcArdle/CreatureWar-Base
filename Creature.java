import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   private int hp;
   private int strength;
   private static final int MINIMUM = 5;
   private static final Random random = new Random();
   
   public Creature(){
       hp = 10;
       strength = 10;
   }
   
   public Creature(int hp, int strength) {
       this.hp = hp;
       this.strength = strength;
    
    }
   
   public int damage(){
          return random.nextInt(getStrength() + 1);
    }
   
   public int getHP() {
       return hp;
       
    }
    
   public void setHP(int hp) {
       if (hp > MINIMUM) {
           this.hp = hp;
        } else {
            System.out.println("Hit points must be 5 or greater");
        }
    }
    
   public int getStrength() {
       return strength;
    
    }
    
   public void setStrength(int strength) {
       if (strength > MINIMUM) {
           this.strength = strength;
        } else {
            System.out.println("Strength must be 5 or greater");
        }
    }
    
}
