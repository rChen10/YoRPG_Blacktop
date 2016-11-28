// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved 
// Team Blacktop - Samantha, Datian, Ricky

import java.io.*;
import java.util.*;

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

	// Tools for magicPrompt()
	isr = new InputStreamReader(System.in);
	in  = new BufferedReader(isr);
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
    public void magicPrompt(Character mon){
	String s;
	int i = 1;
	
	s = "What shall thou cast? \n";
	s += "\t1: SilverSpell -- Full strength attack, but decrease defense by 10.\n";
	s += "\t2: MaxiSpell -- Double strength, but loses all defense.";
	System.out.println(s);
	
	try {
	    i = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }
	
	if (i == 1) SilverSpell(mon);
	if (i == 2) MaxiSpell(mon);
    }

    public void SilverSpell(Character mon){
	mon.lowerHP(strength);
	System.out.println( "\n" + name + " dealt " + strength + " points of damage.");
	
	defense -= 10;
	System.out.println( "\n" + name + " lost 10 defense!");
    }
    
    public void MaxiSpell(Character mon){
	int d1 = strength * 2;
	mon.lowerHP(d1);
	System.out.println( "\n" + name + " dealt " + d1 + " points of damage.");
	System.out.println("\n" + name + " lost all " + defense + " defense!");
	defense = 0;
    }
}
