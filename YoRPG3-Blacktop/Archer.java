// Ricky Chen
// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved
// 2016-11-18
// Team Blacktop - Samantha, Datian, Ricky

public class Archer extends Character{
    private String name;

    public Archer(String n){
	name = n;

	life = 80;
	strength = 120;
	defense = 10;
	attackRating = 0.5;
    }

    public String about(){
	return "Archer";
    }

    public String getName(){
	return name;
    }
    
    public void normalize(){
	setDef(10);
	setStr(120);
    }
    
    public void specialize(){
	strength += 10;
	defense -=10;
    }
}
