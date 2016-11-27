// Samantha Ngo
// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved 
// 2016-11-18
// Team Blacktop - Samantha, Datian, Ricky

public class Mage extends Character{
    private String name;

    public Mage(String n){
	name = n;

	life = 100;
	strength = 50;
	defense = 20;
	attackRating = 0.7;
	
	stats[0] = strength;
	stats[1] = defense;
	savedAttackRating = attackRating;
    }

    public String about(){
	return "Mage";
    }

    public String getName(){
	return name;
    }
    
    public void specialize(){
	strength += 10;
	defense -=10;
    }
}
