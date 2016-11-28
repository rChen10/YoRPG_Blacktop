// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved
// Team Blacktop - Samantha, Datian, Ricky

import java.io.*;
import java.util.*;

public class Warrior extends Character{
    private String name;
    // Overloaded Constructor that sets name
    public Warrior(String n) {
	name = n;

	life = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;

	
	stats[0] = strength;
	stats[1] = defense;
	savedAttackRating = attackRating;

	//to be used in magicPrompt()
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }
    // returns value of name attribute
    public String getName(){
	return name;
    }

    public String about(){
	return "Warrior";
    }
    
    public void specialize(){
	strength += 10;
	defense -=10;
    }
   public void magicPrompt(Character mon){
	String s;
	int i = 1;

	s = "What shall thou cast? \n";
        s += "\t1: Doubleshot -- Attack twice\n";
	s += "\t2: SwordSpin -- Double your strength. Decreases defense by two-thirds.\n";
	System.out.println(s);

	try {
	    i = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	if (i == 1) doubleShot(mon);
	if (i == 2) swordSpin(mon);
    }

    public void doubleShot(Character mon){
	int d1 = attack( mon );
	System.out.println( "\n" + name + " dealt " + d1 +
				    " points of damage.");
	int d2 = attack( mon );
	System.out.println( "\n" + name + " dealt " + d2 +
				    " points of damage.");
    }

    public void swordSpin(Character mon){
	mon.lowerHP(strength * 2);
	System.out.println( "\n" + name + " dealt " + strength +
				    " points of damage.");
	defense = (int) (defense * 0.3);
	System.out.println( "\n" + name + " lost 10 defense!");
    }
    
}
