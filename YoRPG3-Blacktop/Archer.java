// Ricky Chen
// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved
// 2016-11-18
// Team Blacktop - Samantha, Datian, Ricky

import java.io.*;
import java.util.*;

public class Archer extends Character{
    private String name;

    public Archer(String n){
	name = n;

	life = 80;
	strength = 120;
	defense = 10;
	attackRating = 0.5;

	stats[0] = strength;
	stats[1] = defense;
	savedAttackRating = attackRating;

	//to be used in magicPrompt()
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }

    public String about(){
	return "Archer";
    }

    public String getName(){
	return name;
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
	s += "\t2: Piercing Arrow -- You put all your strength into one shot. Decreases defense.\n";
	System.out.println(s);

	try {
	    i = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	if (i == 1) doubleShot(mon);
	if (i == 2) piercingArrow(mon);
    }

    public void doubleShot(Character mon){
	int d1 = attack( mon );
	System.out.println( "\n" + name + " dealt " + d1 +
				    " points of damage.");
	int d2 = attack( mon );
	System.out.println( "\n" + name + " dealt " + d2 +
				    " points of damage.");
    }

    public void piercingArrow(Character mon){
	mon.lowerHP(strength);
	System.out.println( "\n" + name + " dealt " + strength +
				    " points of damage.");

	defense -= 10;
	System.out.println( "\n" + name + " lost 10 defense!");
    }
}
