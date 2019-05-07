/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the giraffe model go up the runway.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class GiraffeC extends Thread // creates a class called BearA that is in the thread class
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
	//for loop used to make the giraffe go up the runway
	for (int i = 0 ; i <= 105 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (467, 200 - i, 67, 94); //erase
		c.setColor (yellow);
		c.fillOval (468, 250 - i, 20, 11); //left arm
		c.fillOval (510, 250 - i, 20, 11); //right arm
		c.setColor (red);
		c.fillRect (483, 243 - i, 33, 40); //main jacket
		c.fillRect (511, 248 - i, 12, 15); //right sleeve
		c.fillRect (475, 248 - i, 12, 15); //left sleeve
		//top of umbrella
		int x[] = {521, 534, 527};  //list of all x-coordintes
		int y[] = {269 - i, 269 - i, 291 - i}; // list of all y-coordinates
		c.fillPolygon (x, y, 3);
		c.setColor (darkRed);
		c.drawLine (499, 243 - i, 499, 282 - i); //line down the jacket
		c.fillOval (501, 250 - i, 4, 4); //top button
		c.fillOval (500, 256 - i, 4, 4); //second button
		c.fillOval (500, 262 - i, 4, 4); //third button
		c.fillOval (500, 268 - i, 4, 4); //fourth button
		c.fillOval (500, 274 - i, 4, 4); //fifth button
		c.fillArc (506, 262 - i, 9, 12, 180, 180); //right pocket
		c.fillArc (485, 262 - i, 9, 12, 180, 180); //left pocket
		c.setColor (yellow);
		c.fillOval (478, 206 - i, 42, 42); //head
		c.fillOval (472, 213 - i, 15, 7); //left ear
		c.fillOval (511, 213 - i, 15, 7); //right ear
		c.fillRect (488, 202 - i, 3, 9); //left horn
		c.fillRect (507, 202 - i, 3, 9); //right horn
		c.fillRect (486, 283 - i, 12, 8); //left foot
		c.fillRect (502, 283 - i, 12, 8); //right foot
		c.setColor (lightYellow);
		c.fillOval (488, 225 - i, 22, 22); //snout
		c.setColor (giraffeBrown);
		c.fillOval (486, 199 - i, 6, 6); //left horn topper
		c.fillOval (506, 199 - i, 6, 6); //left horn topper
		c.drawArc (494, 231 - i, 8, 11, 180, 180); //smile
		c.fillOval (493, 231 - i, 4, 2); //left nostril
		c.fillOval (500, 231 - i, 4, 2); //right nostril
		c.fillArc (495, 201 - i, 9, 10, 180, 180); //center spot
		c.fillArc (485, 205 - i, 9, 10, 200, 190); //left spot
		c.fillArc (506, 205 - i, 9, 10, 150, 185); //left spot
		c.setColor (Color.black);
		c.fillOval (484, 218 - i, 9, 9); //left eye
		c.fillOval (506, 218 - i, 9, 9); //right eye
		c.fillRect (527, 257 - i, 2, 12); //umbrella handle
		c.setColor (Color.white);
		c.fillOval (486, 221 - i, 2, 2); //left eye highlight
		c.fillOval (509, 221 - i, 2, 2); //right eye highlight
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


    public GiraffeC (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
