/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the bear model walking off the runway.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*;     // allows access to Thread class

public class BearE extends Thread // creates a class called BearA that is in the thread class
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
	//for loop used to make the bear walk left
	for (int i = 0 ; i <= 535 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie CPT facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (476 - i, 91, 58, 101);
		c.setColor (brown);
		c.fillOval (482 - i, 100, 45, 42); //head
		c.fillOval (484 - i, 133, 41, 48); //body
		c.fillOval (476 - i, 100, 18, 18); //left ear
		c.fillOval (515 - i, 100, 18, 18); //right ear
		c.fillOval (475 - i, 143, 20, 15); //left arm
		c.fillOval (513 - i, 143, 20, 15); //right arm
		c.fillOval (489 - i, 171, 14, 20); //left foot
		c.fillOval (507 - i, 171, 14, 20); //right foot
		c.setColor (mediumBrown);
		c.fillOval (494 - i, 121, 22, 15); //snout
		c.fillOval (493 - i, 141, 23, 30); //stomach
		c.setColor (Color.black);
		c.fillArc (489 - i, 175, 14, 15, 180, 180); //left shoe
		c.fillArc (507 - i, 175, 14, 15, 180, 180); //right shoe
		c.fillOval (490 - i, 112, 9, 9); //left eye
		c.fillOval (511 - i, 112, 9, 9); //right eye
		c.fillRect (487 - i, 100, 37, 10); //bottom of hat
		c.fillRect (493 - i, 91, 25, 9); //top of hat
		c.setColor (Color.white);
		c.fillOval (493 - i, 115, 2, 2); //left eye
		c.fillOval (514 - i, 115, 2, 2); //right eye
		c.setColor (darkBrown);
		c.fillOval (501 - i, 124, 8, 4); //nose
		c.drawArc (499 - i, 125, 12, 7, 180, 180); //smile
		c.drawLine (505 - i, 128, 505 - i, 131); //nose connector
		c.setColor (red);
		c.fillOval (488 - i, 136, 15, 6); //top left part of bow
		c.fillOval (489 - i, 136, 15, 6); //top left part of bow
		c.fillOval (488 - i, 142, 15, 6); //bottom left part of bow
		c.fillOval (489 - i, 142, 15, 6); //bottom left part of bow
		c.fillOval (505 - i, 136, 15, 6); //top right part of bow
		c.fillOval (506 - i, 136, 15, 6); //top right part of bow
		c.fillOval (505 - i, 142, 15, 6); //bottom right part of bow
		c.fillOval (506 - i, 142, 15, 6); //bottom right part of bow
		c.fillStar (501 - i, 93, 9, 9); //star on the hat
		c.setColor (darkRed);
		c.fillOval (500 - i, 138, 8, 8); //middle of bow
		c.fillOval (501 - i, 138, 8, 8); //middle of bow
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


    public BearE (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
