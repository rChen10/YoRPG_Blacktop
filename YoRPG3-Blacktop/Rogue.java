// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved 
// Team Blacktop - Samantha, Datian, Ricky

import java.io.*;
import java.util.*;

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

	// Tools for magicPrompt()
	isr = new InputStreamReader(System.in);
	in  = new BufferedReader(isr);
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
    public void magicPrompt(Character mon){
	String s;
	int i = 1;
	
	s = "What shall thou cast? \n";
	s += "\t1: Steal -- Steals Monster's strength by half, and adds it to thy own strength. Loses all defense.\n";
	s += "\t2: Swap -- Swap strength with opponent, but loses all defense."
	System.out.println(s);
	
	try {
	    i = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	
	if (i == 1) steal(mon);
	if (i == 2) swap(mon);
    }

    public void steal(Character mon){
	addStrength = (int) (0.5 * mon.getStrength());
	strength += addStrength;
	mon.setStrength(addStrength);
	System.out.println( "\n" + name + " dealt " + strength + " points of damage.");
	
	defense -= 10;
	System.out.println( "\n" + name + " lost 10 defense!");
    }
    
    public void swap(Character mon){
	int rogueStrength = strength;
	strength = mon.getStrength();
	mon.setStrength(thisStrength);
	
	System.out.println( "\n" + name + " dealt " + strength + " points of damage.");
	System.out.println("\n" + name + " lost 10 defense!";
	defense = 0;
	}
}
