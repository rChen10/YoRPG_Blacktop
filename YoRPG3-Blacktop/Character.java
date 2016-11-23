// Ricky Chen
// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved 
// 2016-11-18
// Team Blacktop - Samantha, Datian, Ricky

public abstract class Character{
    protected int life;
    protected int strength;
    protected int defense;
    protected  double attackRating;

    // Initialize variables
    public Character(){	
    }
    
    // Change health
    public void setLife(int nlife){
	life = nlife;
    }
    // Change strength
    public void setStr(int nStr){
	strength = nStr;
    }
    // Change defense
    public void setDef(int nDef){
	defense = nDef;
    }
    // Change attack
    public void setAR(int AR){
	attackRating = AR;
    }
    // returns boolean indicating living or dead
    public Boolean isAlive() {
	return life > 0;
    }
    // returns an empty string if invoked (to be overwritten in subclasses)
    public String getName(){
	return "";
    }
    // returns value of defense attribute
    public int getDefense(){
	return defense;
    }

    // takes an int parameter, decreases life attribute by that amount
    public void lowerHP(int amount){
	life = life - amount;
    }
    // Calculates and returns daamage
    public int attack(Character mon){
	int damage = (int) ((strength * attackRating) - mon.getDefense());
	if (damage < 0) damage = 0;
        mon.lowerHP(damage);
	return damage;
    }

    // Prepares for attack; decreases defense, increases attack
    public abstract void specialize();
    // Returns to normal by resetting defense and attack
    public abstract void normalize();
    // Returns string describing class name
    public abstract String about();
    /* Prepares for attack; decreases defense, increases attack
    public static void main(String[] args){
	
    }
    */
}
