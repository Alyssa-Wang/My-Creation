/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the pig modelthat bumps into the bear model.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class PigA extends Thread // creates a class called BearA that is in the thread class
{
    private Console c; //class that allows access to the ouput window
    public void display ()
    {
	//local colour variable for the main pig body
	Color lightPink = new Color (252, 186, 187);
	//local colour variable for highlights in the pig body
	Color mediumPink = new Color (253, 136, 170);
	//local colour variable for the nostrils in the pig body
	Color darkPink = new Color (204, 106, 134);
	//local colour vairable for apron
	Color lightBlue = new Color (174, 249, 248);
	//local colour vairable for the apron pocket
	Color darkBlue = new Color (107, 213, 239);
	//local colour vairable for the maple leaf
	Color lightRed = new Color (229, 57, 53);
	//local colour variable for the top of the stage
	Color lightBrown = new Color (215, 169, 101);
	//for loop used to make the pig walk right
	for (int i = 0 ; i <= 476 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (-68 + i, 193, 66, 98);
		c.setColor (lightPink);
		c.fillOval (-55 + i, 200, 40, 40); //head
		c.fillOval (-57 + i, 230, 45, 50); //body
		c.fillOval (-57 + i, 193, 12, 20); //left ear
		c.fillOval (-25 + i, 193, 12, 20); //right ear
		c.fillRect (-51 + i, 280, 12, 10); //left foot
		c.fillRect (-30 + i, 280, 12, 10); //right foot
		//left arm
		int x[] = { - 67 + i, -60 + i, -50 + i, -57 + i}; //list of all x-coordintes
		int y[] = {245, 236, 246, 255}; // list of all y-coordinates
		c.fillPolygon (x, y, 4);
		//right arm
		int a[] = { - 19 + i, -9 + i, -2 + i, -12 + i}; //list of all x-coordintes
		int b[] = {245, 236, 246, 255}; // list of all y-coordinates
		c.fillPolygon (a, b, 4);
		c.setColor (lightBlue);
		c.fillRect (-57 + i, 255, 45, 25); //bottom of apron
		c.fillRect (-50 + i, 245, 31, 10); //top of the apron
		c.fillRect (-45 + i, 237, 5, 8); //left strap
		c.fillRect (-28 + i, 237, 5, 8); //right strap
		c.setColor (darkBlue);
		c.fillArc (-46 + i, 245, 24, 24, 180, 180); //apron pocket
		c.setColor (lightRed);
		c.fillMapleLeaf (-39 + i, 258, 10, 8); //maple leaf on apron
		c.setColor (Color.black);
		c.fillOval (-48 + i, 212, 9, 9); //left eye
		c.fillOval (-31 + i, 212, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (-45 + i, 215, 2, 2); //left eye highlight
		c.fillOval (-28 + i, 215, 2, 2); //right eye highlight
		c.setColor (mediumPink);
		c.fillOval (-44 + i, 222, 18, 11); //snout
		c.setColor (darkPink);
		c.fillOval (-40 + i, 225, 3, 5); //left nostril
		c.fillOval (-33 + i, 225, 3, 5); //right nostril
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


    public PigA (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
