// Ricky Chen
// APCS - Pd 3
// HW#31 - Ye Olde Role Playing Game, Improved
// 2016-11-18
// Team Blacktop - Samantha, Datian, Ricky

import java.io.*;
import java.util.*;

public class Cleric extends Character{
    private String name;

    public Cleric(String n){
	name = n;

	life = 100;
	strength = 50;
	defense = 20;
	attackRating = 0.3;
	
	stats[0] = strength;
	stats[1] = defense;
	savedAttackRating = attackRating;

	//to be used in magicPrompt()
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
    }

    public String about(){
	return "Cleric";
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
        s += "\t1: Heal -- Restore 40 life.\n";
	s += "\t2: Purify -- Deal 40 true damage. Lose 10 health.\n";
	System.out.println(s);

	try {
	    i = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	if (i == 1) heal();
	if (i == 2) purify(mon);
    }

    public void heal(){
	life += 40;
	System.out.println( "\n" + name + " restored 40 health!");
    }

    public void purify(Character mon){
	mon.lowerHP(40);
	System.out.println( "\n" + name + " dealt 40 points of damage.");

	this.lowerHP(10);
	System.out.println( "\n" + name + " lost 10 health.");
    }
}
