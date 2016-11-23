// Ricky Chen
// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved
// 2016-11-18
// Team Blacktop - Samantha, Datian, Ricky

public class Warrior extends Character{
    private String name;
    // Overloaded Constructor that sets name
    public Warrior(String n) {
	name = n;

	life = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }
    // returns value of name attribute
    public String getName(){
	return name;
    }

    public String about(){
	return "Warrior";
    }

    public void normalize(){
	defense = 40;
	strength = 100;
    }
    public void specialize(){
	strength += 10;
	defense -=10;
    }
}
