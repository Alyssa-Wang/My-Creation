/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the giraffe model that moves after the elephant model comes in.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class GiraffeB extends Thread // creates a class called BearA that is in the thread class
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
	//for loop used to make giraffe move right
	for (int i = 0 ; i <= 200 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (267 + i, 199, 67, 92);
		c.setColor (yellow);
		c.fillOval (268 + i, 250, 20, 11); //left arm
		c.fillOval (310 + i, 250, 20, 11); //right arm
		c.setColor (red);
		c.fillRect (283 + i, 243, 33, 40); //main jacket
		c.fillRect (311 + i, 248, 12, 15); //right sleeve
		c.fillRect (275 + i, 248, 12, 15); //left sleeve
		//top of umbrella
		int x[] = {321 + i, 334 + i, 327 + i};  //list of all x-coordintes
		int y[] = {269, 269, 291}; // list of all y-coordinates
		c.fillPolygon (x, y, 3);
		c.setColor (darkRed);
		c.drawLine (299 + i, 243, 299 + i, 282); //line down the jacket
		c.fillOval (301 + i, 250, 4, 4); //top button
		c.fillOval (300 + i, 256, 4, 4); //second button
		c.fillOval (300 + i, 262, 4, 4); //third button
		c.fillOval (300 + i, 268, 4, 4); //fourth button
		c.fillOval (300 + i, 274, 4, 4); //fifth button
		c.fillArc (306 + i, 262, 9, 12, 180, 180); //right pocket
		c.fillArc (285 + i, 262, 9, 12, 180, 180); //left pocket
		c.setColor (yellow);
		c.fillOval (278 + i, 206, 42, 42); //head
		c.fillOval (272 + i, 213, 15, 7); //left ear
		c.fillOval (311 + i, 213, 15, 7); //right ear
		c.fillRect (288 + i, 202, 3, 9); //left horn
		c.fillRect (307 + i, 202, 3, 9); //right horn
		c.fillRect (286 + i, 283, 12, 8); //left foot
		c.fillRect (302 + i, 283, 12, 8); //right foot
		c.setColor (lightYellow);
		c.fillOval (288 + i, 225, 22, 22); //snout
		c.setColor (giraffeBrown);
		c.fillOval (286 + i, 199, 6, 6); //left horn topper
		c.fillOval (306 + i, 199, 6, 6); //left horn topper
		c.drawArc (294 + i, 231, 8, 11, 180, 180); //smile
		c.fillOval (293 + i, 231, 4, 2); //left nostril
		c.fillOval (300 + i, 231, 4, 2); //right nostril
		c.fillArc (295 + i, 201, 9, 10, 180, 180); //center spot
		c.fillArc (285 + i, 205, 9, 10, 200, 190); //left spot
		c.fillArc (306 + i, 205, 9, 10, 150, 185); //left spot
		c.setColor (Color.black);
		c.fillOval (284 + i, 218, 9, 9); //left eye
		c.fillOval (306 + i, 218, 9, 9); //right eye
		c.fillRect (327 + i, 257, 2, 12); //umbrella handle
		c.setColor (Color.white);
		c.fillOval (286 + i, 221, 2, 2); //left eye highlight
		c.fillOval (309 + i, 221, 2, 2); //right eye highlight
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


    public GiraffeB (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
