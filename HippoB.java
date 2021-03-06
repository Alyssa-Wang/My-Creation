/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the hippo model walking.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class HippoB extends Thread // creates a class called HippoB that is in the thread class
{
    private Console c; //class that allows access to the ouput window

    //class to make background
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
	for (int i = 0 ; i <= 150 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (83 + i, 192, 65, 101);
		c.setColor (purple);
		c.fillOval (95 + i, 201, 40, 45); //head
		c.fillOval (89 + i, 221, 51, 25); //snout
		c.fillOval (95 + i, 238, 40, 45); //body
		c.fillOval (98 + i, 193, 10, 20); //left ear
		c.fillOval (123 + i, 193, 10, 20); //right ear
		c.fillRect (85 + i, 250, 13, 10); //left arm
		c.fillRect (132 + i, 250, 13, 10); //right arm
		c.fillOval (100 + i, 271, 14, 20); //left foot
		c.fillOval (118 + i, 271, 14, 20); //right foot
		c.setColor (darkPurple);
		c.fillOval (99 + i, 227, 8, 12); //left nostril
		c.fillOval (122 + i, 227, 8, 12); //right nostril
		c.setColor (lightPurple);
		c.fillOval (103 + i, 247, 23, 25); //stomach
		c.setColor (Color.black);
		c.fillOval (102 + i, 212, 9, 9); //left eye
		c.fillOval (120 + i, 212, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (105 + i, 215, 2, 2); //left eye highlight
		c.fillOval (123 + i, 215, 2, 2); //right eye highlight
		c.setColor (pink);
		c.fillOval (104 + i, 198, 10, 10); //flower petals
		c.setColor (Color.white);
		c.fillOval (106 + i, 201, 5, 5); //flower center
		//tutu
		c.setColor (pink);
		c.fillOval (89 + i, 265, 12, 15); //left oval of tutu
		c.fillOval (99 + i, 265, 12, 15); //next oval on the right of the previous one
		c.fillOval (109 + i, 265, 12, 15); //next oval on the right of the previous one
		c.fillOval (119 + i, 265, 12, 15); //next oval on the right of the previous one
		c.fillOval (129 + i, 265, 12, 15); //last oval
		//ballet shoes
		c.fillArc (100 + i, 280, 14, 10, 180, 180); //left shoe
		c.fillArc (118 + i, 280, 14, 10, 180, 180); //right shoe
		c.drawLine (100 + i, 285, 115 + i, 277); //left shoe strap
		c.drawLine (113 + i, 285, 100 + i, 278); //left shoe strap
		c.drawLine (118 + i, 285, 133 + i, 277); //left shoe strap
		c.drawLine (131 + i, 285, 118 + i, 278); //left shoe strap
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


    public HippoB (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
