/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the hippo model walking off the runway.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class HippoD extends Thread // creates a class called HippoD that is in the thread class
{
    private Console c; //class that allows access to the ouput window
    public void display ()
    {
	//local colour variable for the main hippo body
	Color purple = new Color (204, 153, 212);
	//local colour variable for highlights in the bear body
	Color darkPurple = new Color (163, 111, 171);
	//local colour variable for stomach
	Color lightPurple = new Color (225, 190, 231);
	//local colour variable for ballet attire
	Color pink = new Color (252, 186, 187);
	//local colour variable for ballet attire
	Color flowerYellow = new Color (242, 198, 55);
	//local colour variable for the top of the stage
	Color lightBrown = new Color (215, 169, 101);
	//for loop used to move the hippo up
	for (int i = 0 ; i <= 102 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (473, 192 - i, 65, 101); //erase
		c.setColor (purple);
		c.fillOval (485, 201 - i, 40, 45); //head
		c.fillOval (479, 221 - i, 51, 25); //snout
		c.fillOval (485, 238 - i, 40, 45); //body
		c.fillOval (488, 193 - i, 10, 20); //left ear
		c.fillOval (513, 193 - i, 10, 20); //right ear
		c.fillRect (475, 250 - i, 13, 10); //left arm
		c.fillRect (522, 250 - i, 13, 10); //right arm
		c.fillOval (490, 271 - i, 14, 20); //left foot
		c.fillOval (508, 271 - i, 14, 20); //right foot
		c.setColor (darkPurple);
		c.fillOval (489, 227 - i, 8, 12); //left nostril
		c.fillOval (512, 227 - i, 8, 12); //right nostril
		c.setColor (lightPurple);
		c.fillOval (493, 247 - i, 23, 25); //stomach
		c.setColor (Color.black);
		c.fillOval (492, 212 - i, 9, 9); //left eye
		c.fillOval (510, 212 - i, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (495, 215 - i, 2, 2); //left eye highlight
		c.fillOval (513, 215 - i, 2, 2); //right eye highlight
		c.setColor (pink);
		c.fillOval (494, 198 - i, 10, 10); //flower petals
		c.setColor (Color.white);
		c.fillOval (496, 201 - i, 5, 5); //flower center
		//tutu
		c.setColor (pink);
		c.fillOval (479, 265 - i, 12, 15); //left oval of tutu
		c.fillOval (489, 265 - i, 12, 15); //next oval on the right of the previous one
		c.fillOval (499, 265 - i, 12, 15); //next oval on the right of the previous one
		c.fillOval (509, 265 - i, 12, 15); //next oval on the right of the previous one
		c.fillOval (519, 265 - i, 12, 15); //last oval
		//ballet shoes
		c.fillArc (490, 280 - i, 14, 10, 180, 180); //left shoe
		c.fillArc (508, 280 - i, 14, 10, 180, 180); //right shoe
		c.drawLine (490, 285 - i, 505, 277 - i); //left shoe strap
		c.drawLine (503, 285 - i, 490, 278 - i); //left shoe strap
		c.drawLine (508, 285 - i, 523, 277 - i); //left shoe strap
		c.drawLine (521, 285 - i, 508, 278 - i); //left shoe strap
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
	//for loop used to move the hippo left so she can exit off the stage
	for (int i = 0 ; i <= 550 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (474 - i, 90, 65, 101); //erase
		c.setColor (purple);
		c.fillOval (485 - i, 99, 40, 45); //head
		c.fillOval (479 - i, 119, 51, 25); //snout
		c.fillOval (485 - i, 136, 40, 45); //body
		c.fillOval (488 - i, 91, 10, 20); //left ear
		c.fillOval (513 - i, 91, 10, 20); //right ear
		c.fillRect (475 - i, 148, 13, 10); //left arm
		c.fillRect (522 - i, 148, 13, 10); //right arm
		c.fillOval (490 - i, 169, 14, 20); //left foot
		c.fillOval (508 - i, 169, 14, 20); //right foot
		c.setColor (darkPurple);
		c.fillOval (489 - i, 125, 8, 12); //left nostril
		c.fillOval (512 - i, 125, 8, 12); //right nostril
		c.setColor (lightPurple);
		c.fillOval (493 - i, 145, 23, 25); //stomach
		c.setColor (Color.black);
		c.fillOval (492 - i, 110, 9, 9); //left eye
		c.fillOval (510 - i, 110, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (495 - i, 113, 2, 2); //left eye highlight
		c.fillOval (513 - i, 113, 2, 2); //right eye highlight
		c.setColor (pink);
		c.fillOval (494 - i, 96, 10, 10); //flower petals
		c.setColor (Color.white);
		c.fillOval (496 - i, 99, 5, 5); //flower center
		//tutu
		c.setColor (pink);
		c.fillOval (479 - i, 163, 12, 15); //left oval of tutu
		c.fillOval (489 - i, 163, 12, 15); //next oval on the right of the previous one
		c.fillOval (499 - i, 163, 12, 15); //next oval on the right of the previous one
		c.fillOval (509 - i, 163, 12, 15); //next oval on the right of the previous one
		c.fillOval (519 - i, 163, 12, 15); //last oval
		//ballet shoes
		c.fillArc (490 - i, 178, 14, 10, 180, 180); //left shoe
		c.fillArc (508 - i, 178, 14, 10, 180, 180); //right shoe
		c.drawLine (490 - i, 183, 505 - i, 175); //left shoe strap
		c.drawLine (503 - i, 183, 490 - i, 176); //left shoe strap
		c.drawLine (508 - i, 183, 523 - i, 175); //left shoe strap
		c.drawLine (521 - i, 183, 508 - i, 176); //left shoe strap
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


    public HippoD (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
