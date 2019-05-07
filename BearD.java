/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the bear model walking to the top of the runway.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class BearD extends Thread // creates a class called BearA that is in the thread class
{
    private Console c; //allows access to the ouput window
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
	//for loop to make the bear walk up
	for (int i = 0 ; i <= 100 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (475, 191 - i, 58, 101);
		c.setColor (brown);
		c.fillOval (482, 200 - i, 45, 42); //head
		c.fillOval (484, 233 - i, 41, 48); //body
		c.fillOval (476, 200 - i, 18, 18); //left ear
		c.fillOval (515, 200 - i, 18, 18); //right ear
		c.fillOval (475, 243 - i, 20, 15); //left arm
		c.fillOval (513, 243 - i, 20, 15); //right arm
		c.fillOval (489, 271 - i, 14, 20); //left foot
		c.fillOval (507, 271 - i, 14, 20); //right foot
		c.setColor (mediumBrown);
		c.fillOval (494, 221 - i, 22, 15); //snout
		c.fillOval (493, 241 - i, 23, 30); //stomach
		c.setColor (Color.black);
		c.fillArc (489, 275 - i, 14, 15, 180, 180); //left shoe
		c.fillArc (507, 275 - i, 14, 15, 180, 180); //right shoe
		c.fillOval (490, 212 - i, 9, 9); //left eye
		c.fillOval (511, 212 - i, 9, 9); //right eye
		c.fillRect (487, 200 - i, 37, 10); //bottom of hat
		c.fillRect (493, 191 - i, 25, 9); //top of hat
		c.setColor (Color.white);
		c.fillOval (493, 215 - i, 2, 2); //left eye
		c.fillOval (514, 215 - i, 2, 2); //right eye
		c.setColor (darkBrown);
		c.fillOval (501, 224 - i, 8, 4); //nose
		c.drawArc (499, 225 - i, 12, 7, 180, 180); //smile
		c.drawLine (505, 228 - i, 505, 231 - i); //nose connector
		c.setColor (red);
		c.fillOval (488, 236 - i, 15, 6); //top left part of bow
		c.fillOval (489, 236 - i, 15, 6); //top left part of bow
		c.fillOval (488, 242 - i, 15, 6); //bottom left part of bow
		c.fillOval (489, 242 - i, 15, 6); //bottom left part of bow
		c.fillOval (505, 236 - i, 15, 6); //top right part of bow
		c.fillOval (506, 236 - i, 15, 6); //top right part of bow
		c.fillOval (505, 242 - i, 15, 6); //bottom right part of bow
		c.fillOval (506, 242 - i, 15, 6); //bottom right part of bow
		c.fillStar (501, 193 - i, 9, 9); //star on the hat
		c.setColor (darkRed);
		c.fillOval (500, 238 - i, 8, 8); //middle of bow
		c.fillOval (501, 238 - i, 8, 8); //middle of bow
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


    public BearD (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
