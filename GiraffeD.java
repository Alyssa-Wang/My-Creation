/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the giraffe model exiting off the runway.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class GiraffeD extends Thread // creates a class called BearA that is in the thread class
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
	//for loop that makes the giraffe go left off the runway
	for (int i = 0 ; i <= 550 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (469 - i, 93, 67, 94);
		c.setColor (yellow);
		c.fillOval (468 - i, 145, 20, 11); //left arm
		c.fillOval (510 - i, 145, 20, 11); //right arm
		c.setColor (red);
		c.fillRect (483 - i, 138, 33, 40); //main jacket
		c.fillRect (511 - i, 143, 12, 15); //right sleeve
		c.fillRect (475 - i, 143, 12, 15); //left sleeve
		//top of umbrella
		int x[] = {521 - i, 534 - i, 527 - i}; //list of all x-coordintes
		int y[] = {164, 164, 186}; // list of all y-coordinates
		c.fillPolygon (x, y, 3);
		c.setColor (darkRed);
		c.drawLine (499 - i, 138, 499 - i, 177); //line down the jacket
		c.fillOval (501 - i, 145, 4, 4); //top button
		c.fillOval (500 - i, 151, 4, 4); //second button
		c.fillOval (500 - i, 157, 4, 4); //third button
		c.fillOval (500 - i, 163, 4, 4); //fourth button
		c.fillOval (500 - i, 169, 4, 4); //fifth button
		c.fillArc (506 - i, 157, 9, 12, 180, 180); //right pocket
		c.fillArc (485 - i, 157, 9, 12, 180, 180); //left pocket
		c.setColor (yellow);
		c.fillOval (478 - i, 101, 42, 42); //head
		c.fillOval (472 - i, 108, 15, 7); //left ear
		c.fillOval (511 - i, 108, 15, 7); //right ear
		c.fillRect (488 - i, 97, 3, 9); //left horn
		c.fillRect (507 - i, 97, 3, 9); //right horn
		c.fillRect (486 - i, 178, 12, 8); //left foot
		c.fillRect (502 - i, 178, 12, 8); //right foot
		c.setColor (lightYellow);
		c.fillOval (488 - i, 120, 22, 22); //snout
		c.setColor (giraffeBrown);
		c.fillOval (486 - i, 94, 6, 6); //left horn topper
		c.fillOval (506 - i, 94, 6, 6); //left horn topper
		c.drawArc (494 - i, 126, 8, 11, 180, 180); //smile
		c.fillOval (493 - i, 126, 4, 2); //left nostril
		c.fillOval (500 - i, 126, 4, 2); //right nostril
		c.fillArc (495 - i, 96, 9, 10, 180, 180); //center spot
		c.fillArc (485 - i, 100, 9, 10, 200, 190); //left spot
		c.fillArc (506 - i, 100, 9, 10, 150, 185); //left spot
		c.setColor (Color.black);
		c.fillOval (484 - i, 113, 9, 9); //left eye
		c.fillOval (506 - i, 113, 9, 9); //right eye
		c.fillRect (527 - i, 152, 2, 12); //umbrella handle
		c.setColor (Color.white);
		c.fillOval (486 - i, 116, 2, 2); //left eye highlight
		c.fillOval (509 - i, 116, 2, 2); //right eye highlight
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


    public GiraffeD (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
