/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the elephant model walking to bump into the giraffe.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class ElephantA extends Thread // creates a class called ElephantA that is in the thread class
{
    private Console c; //class that allows access to the ouput window
    public void display ()
    {
	//local colour variable for the main elephant body
	Color elephantGrey = new Color (188, 182, 196);
	//local colour variable for the elephant nose
	Color darkGrey = new Color (176, 161, 196);
	//local colour variable for the trousers
	Color orange = new Color (255, 160, 0);
	//local colour variable for trouser straps
	Color lightOrange = new Color (255, 179, 0);
	//local colour variable for ears
	Color pink = new Color (252, 186, 187);
	//local colour variable for the top of the stage
	Color lightBrown = new Color (215, 169, 101);
	for (int i = 0 ; i <= 470 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (-75 + i, 200, 70, 91); //erase
		c.setColor (elephantGrey);
		c.fillOval (-53 + i, 232, 40, 45); //body
		c.fillOval (-53 + i, 200, 40, 40); //head
		c.fillOval (-65 + i, 200, 20, 40); //left ear
		c.fillOval (-21 + i, 200, 20, 40); //right ear
		c.fillRect (-64 + i, 245, 13, 12); //left arm
		c.fillRect (-15 + i, 245, 13, 12); //right arm
		c.fillRect (-47 + i, 270, 12, 21); //left foot
		c.fillRect (-31 + i, 270, 12, 21); //right foot
		c.setColor (pink);
		c.fillOval (-59 + i, 211, 8, 19); //left ear highlight
		c.fillOval (-15 + i, 211, 8, 19); //right ear highlight
		c.setColor (Color.black);
		c.fillOval (-46 + i, 213, 9, 9); //left eye
		c.fillOval (-29 + i, 213, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (-43 + i, 216, 2, 2); //left eye highlight
		c.fillOval (-26 + i, 216, 2, 2); //right eye highlight
		c.setColor (darkGrey);
		c.fillArc (-35 + i, 220, 35, 15, 180, 180); //bottom of trunk
		c.fillArc (-12 + i, 205, 15, 30, 230, 180); //top of trunk
		//trousers
		c.setColor (lightOrange);
		c.fillArc (-53 + i, 242, 40, 35, 180, 180); //stomach part of trousers
		c.fillRect (-47 + i, 270, 12, 16); //left leg trouser
		c.fillRect (-31 + i, 270, 12, 16); //right leg trouser
		c.setColor (orange);
		c.fillRect (-47 + i, 239, 7, 26); //left strap
		c.fillRect (-27 + i, 239, 7, 26); //left strap
		c.setColor (Color.red);
		c.fillMapleLeaf (-41 + i, 261, 15, 15);
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


    public ElephantA (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}


