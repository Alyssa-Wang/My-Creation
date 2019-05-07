/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the bear model walking to the end of the runway.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class BearC extends Thread // creates a class called BearA that is in the thread class
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
	//for loop making the bear walk to the end of the stage
	for (int i = 0 ; i <= 150 ; i++)
	{
	    //keeps thread from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (324 + i, 191, 58, 101);
		c.setColor (brown);
		c.fillOval (332 + i, 200, 45, 42); //head
		c.fillOval (334 + i, 233, 41, 48); //body
		c.fillOval (326 + i, 200, 18, 18); //left ear
		c.fillOval (365 + i, 200, 18, 18); //right ear
		c.fillOval (325 + i, 243, 20, 15); //left arm
		c.fillOval (363 + i, 243, 20, 15); //right arm
		c.fillOval (339 + i, 271, 14, 20); //left foot
		c.fillOval (357 + i, 271, 14, 20); //right foot
		c.setColor (mediumBrown);
		c.fillOval (344 + i, 221, 22, 15); //snout
		c.fillOval (343 + i, 241, 23, 30); //stomach
		c.setColor (Color.black);
		c.fillArc (339 + i, 275, 14, 15, 180, 180); //left shoe
		c.fillArc (357 + i, 275, 14, 15, 180, 180); //right shoe
		c.fillOval (340 + i, 212, 9, 9); //left eye
		c.fillOval (361 + i, 212, 9, 9); //right eye
		c.fillRect (337 + i, 200, 37, 10); //bottom of hat
		c.fillRect (343 + i, 191, 25, 9); //top of hat
		c.setColor (Color.white);
		c.fillOval (343 + i, 215, 2, 2); //left eye
		c.fillOval (364 + i, 215, 2, 2); //right eye
		c.setColor (darkBrown);
		c.fillOval (351 + i, 224, 8, 4); //nose
		c.drawArc (349 + i, 225, 12, 7, 180, 180); //smile
		c.drawLine (355 + i, 228, 355 + i, 231); //nose connector
		c.setColor (red);
		c.fillOval (338 + i, 236, 15, 6); //top left part of bow
		c.fillOval (339 + i, 236, 15, 6); //top left part of bow
		c.fillOval (338 + i, 242, 15, 6); //bottom left part of bow
		c.fillOval (339 + i, 242, 15, 6); //bottom left part of bow
		c.fillOval (355 + i, 236, 15, 6); //top right part of bow
		c.fillOval (356 + i, 236, 15, 6); //top right part of bow
		c.fillOval (355 + i, 242, 15, 6); //bottom right part of bow
		c.fillOval (356 + i, 242, 15, 6); //bottom right part of bow
		c.fillStar (351 + i, 193, 9, 9); //star on the hat
		c.setColor (darkRed);
		c.fillOval (350 + i, 238, 8, 8); //middle of bow
		c.fillOval (351 + i, 238, 8, 8); //middle of bow
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


    public BearC (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
