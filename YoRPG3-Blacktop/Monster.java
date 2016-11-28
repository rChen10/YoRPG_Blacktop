// Ricky Chen
// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved 
// 2016-11-18
// Team Blacktop - Samantha, Datian, Ricky

public class Monster extends Character{
    
    public Monster(){
	// Initialize attributes
	strength = (int) ((Math.random() * 45) + 20);
	attackRating = 1;
	life = 150;
	defense = 20;
    }

    public String about(){
	return "Monster";
    }
    public void normalize(){
	
    }
    public void specialize(){
	
    }
    public int getStrength(){
	return strength;
    }

    public void magicPrompt(Character mon){
    }
}
