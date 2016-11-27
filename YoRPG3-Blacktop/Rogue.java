public class Rogue extends Character{
    private String name;

    public Rogue(String n){
	name = n;
	life = 90;
	strength = 80;
	defense = 10;
	attackRating = 0.7;
	
	stats[0] = strength;
	stats[1] = defense;
	savedAttackRating = attackRating;
    }

    public String about(){
	return "Rogue";
    }

    public String getName(){
	return name;
    }
    
    public void specialize(){
	strength += 10;
	defense -=10;
    }
}
