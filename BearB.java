/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the bear model walking after it bumps into the hippo.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class BearB extends Thread // creates a class called BearB that is in the thread class
{
    private Console c; //class that allows access to the ouput window
    public void display ()
    {
	//local colour variable for the main bear body
	Color brown = new Color (175, 116, 65);
	//local colour variable for highlights in the bear body
	Color mediumBrown = new Color (242, 184, 113);
	//local colour variable for the nose and mouth
	Color darkBrown = new Color (109, 62, 5);
	//local colour variable for the bow
	Color red = new Color (252, 33, 17);
	//local colour variable for the bow
	Color darkRed = new Color (168, 5, 5);
	//local colour variable for the top of the stage
	Color lightBrown = new Color (215, 169, 101);
	//for loop used to make bear walk further on the stage after it bumps into the hippo
	for (int i = 0 ; i <= 150 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (174 + i, 191, 58, 101); //erase
		c.setColor (brown);
		c.fillOval (182 + i, 200, 45, 42); //head
		c.fillOval (184 + i, 233, 41, 48); //body
		c.fillOval (176 + i, 200, 18, 18); //left ear
		c.fillOval (215 + i, 200, 18, 18); //right ear
		c.fillOval (175 + i, 243, 20, 15); //left arm
		c.fillOval (213 + i, 243, 20, 15); //right arm
		c.fillOval (189 + i, 271, 14, 20); //left foot
		c.fillOval (207 + i, 271, 14, 20); //right foot
		c.setColor (mediumBrown);
		c.fillOval (194 + i, 221, 22, 15); //snout
		c.fillOval (193 + i, 241, 23, 30); //stomach
		c.setColor (Color.black);
		c.fillArc (189 + i, 275, 14, 15, 180, 180); //left shoe
		c.fillArc (207 + i, 275, 14, 15, 180, 180); //right shoe
		c.fillOval (190 + i, 212, 9, 9); //left eye
		c.fillOval (211 + i, 212, 9, 9); //right eye
		c.fillRect (187 + i, 200, 37, 10); //bottom of hat
		c.fillRect (193 + i, 191, 25, 9); //top of hat
		c.setColor (Color.white);
		c.fillOval (193 + i, 215, 2, 2); //left eye
		c.fillOval (214 + i, 215, 2, 2); //right eye
		c.setColor (darkBrown);
		c.fillOval (201 + i, 224, 8, 4); //nose
		c.drawArc (199 + i, 225, 12, 7, 180, 180); //smile
		c.drawLine (205 + i, 228, 205 + i, 231); //nose connector
		c.setColor (red);
		c.fillOval (188 + i, 236, 15, 6); //top left part of bow
		c.fillOval (189 + i, 236, 15, 6); //top left part of bow
		c.fillOval (188 + i, 242, 15, 6); //bottom left part of bow
		c.fillOval (189 + i, 242, 15, 6); //bottom left part of bow
		c.fillOval (205 + i, 236, 15, 6); //top right part of bow
		c.fillOval (206 + i, 236, 15, 6); //top right part of bow
		c.fillOval (205 + i, 242, 15, 6); //bottom right part of bow
		c.fillOval (206 + i, 242, 15, 6); //bottom right part of bow
		c.fillStar (201 + i, 193, 9, 9); //star on the hat
		c.setColor (darkRed);
		c.fillOval (200 + i, 238, 8, 8); //middle of bow
		c.fillOval (201 + i, 238, 8, 8); //middle of bow
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


    public BearB (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}


