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
	s += "\t1: Steal -- Doubles thy own strength. Loses all defense.\n";
	s += "\t2: HealthSteal -- Steal opponent's health and adds it to your own.";
	System.out.println(s);
	
	try {
	    i = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	
	if (i == 1) steal(mon);
	if (i == 2) healthSteal(mon);
    }

    public void steal(Character mon){
        strength *= 2;
	System.out.println( "\n" + name + " dealt " + strength + " points of damage.");
	
	defense -= 10;
	System.out.println( "\n" + name + " lost 10 defense!");
    }
    
    public void healthSteal(Character mon){
	life += 20;
	mon.lowerHP(20);	   
	
	System.out.println( "\n" + name + " dealt 20 points of damage.");
	}
}
