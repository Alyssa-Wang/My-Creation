/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the giraffe model walking onto the stage by himself.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class GiraffeA extends Thread // creates a class called BearA that is in the thread class
{
    private Console c; //class that allows access to the ouput window
    public void display ()
    {
	//local colour variable for the main giraffe body
	Color yellow = new Color (247, 220, 111);
	//local colour variable for the main giraffe body
	Color lightYellow = new Color (249, 241, 197);
	//local colour variable for the giraffe spots
	Color giraffeBrown = new Color (175, 96, 26);
	//local colour variable for the raincoat
	Color red = new Color (242, 12, 12);
	//local colour variable for the raincoat
	Color darkRed = new Color (173, 1, 1);
	//local colour variable for the top of the stage
	Color lightBrown = new Color (215, 169, 101);
	//for loop that allows the Giraffe to move to the center of the stage
	for (int i = 0 ; i <= 340 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (-73 + i, 199, 67, 92); //erase
		c.setColor (yellow);
		c.fillOval (-72 + i, 250, 20, 11); //left arm
		c.fillOval (-30 + i, 250, 20, 11); //right arm
		c.setColor (red);
		c.fillRect (-57 + i, 243, 33, 40); //main jacket
		c.fillRect (-29 + i, 248, 12, 15); //right sleeve
		c.fillRect (-65 + i, 248, 12, 15); //left sleeve
		//top of umbrella
		int x[] = { - 19 + i, -6 + i, -13 + i}; //list of all x-coordintes
		int y[] = {269, 269, 291}; // list of all y-coordinates
		c.fillPolygon (x, y, 3);
		c.setColor (darkRed);
		c.drawLine (-41 + i, 243, -41 + i, 282); //line down the jacket
		c.fillOval (-39 + i, 250, 4, 4); //top button
		c.fillOval (-40 + i, 256, 4, 4); //second button
		c.fillOval (-40 + i, 262, 4, 4); //third button
		c.fillOval (-40 + i, 268, 4, 4); //fourth button
		c.fillOval (-40 + i, 274, 4, 4); //fifth button
		c.fillArc (-34 + i, 262, 9, 12, 180, 180); //right pocket
		c.fillArc (-55 + i, 262, 9, 12, 180, 180); //left pocket
		c.setColor (yellow);
		c.fillOval (-62 + i, 206, 42, 42); //head
		c.fillOval (-68 + i, 213, 15, 7); //left ear
		c.fillOval (-29 + i, 213, 15, 7); //right ear
		c.fillRect (-52 + i, 202, 3, 9); //left horn
		c.fillRect (-33 + i, 202, 3, 9); //right horn
		c.fillRect (-54 + i, 283, 12, 8); //left foot
		c.fillRect (-38 + i, 283, 12, 8); //right foot
		c.setColor (lightYellow);
		c.fillOval (-52 + i, 225, 22, 22); //snout
		c.setColor (giraffeBrown);
		c.fillOval (-54 + i, 199, 6, 6); //left horn topper
		c.fillOval (-34 + i, 199, 6, 6); //left horn topper
		c.drawArc (-46 + i, 231, 8, 11, 180, 180); //smile
		c.fillOval (-47 + i, 231, 4, 2); //left nostril
		c.fillOval (-40 + i, 231, 4, 2); //right nostril
		c.fillArc (-45 + i, 201, 9, 10, 180, 180); //center spot
		c.fillArc (-55 + i, 205, 9, 10, 200, 190); //left spot
		c.fillArc (-34 + i, 205, 9, 10, 150, 185); //left spot
		c.setColor (Color.black);
		c.fillOval (-56 + i, 218, 9, 9); //left eye
		c.fillOval (-34 + i, 218, 9, 9); //right eye
		c.fillRect (-13 + i, 257, 2, 12); //umbrella handle
		c.setColor (Color.white);
		c.fillOval (-54 + i, 221, 2, 2); //left eye highlight
		c.fillOval (-31 + i, 221, 2, 2); //right eye highlight
	    }
	    //used to delay the animation
	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public GiraffeA (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
