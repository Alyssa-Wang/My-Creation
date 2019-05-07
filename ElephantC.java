/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the elephant model that walks off the runway behind the giraffe.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class ElephantC extends Thread // creates a class called ElephantC that is in the thread class
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
	for (int i = 0 ; i <= 105 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (465, 202 - i, 76, 92); //erase
		c.setColor (elephantGrey);
		c.fillOval (485, 232 - i, 40, 45); //body
		c.fillOval (485, 200 - i, 40, 40); //head
		c.fillOval (473, 200 - i, 20, 40); //left ear
		c.fillOval (517, 200 - i, 20, 40); //right ear
		c.fillRect (474, 245 - i, 13, 12); //left arm
		c.fillRect (523, 245 - i, 13, 12); //right arm
		c.fillRect (491, 270 - i, 12, 21); //left foot
		c.fillRect (507, 270 - i, 12, 21); //right foot
		c.setColor (pink);
		c.fillOval (479, 211 - i, 8, 19); //left ear highlight
		c.fillOval (523, 211 - i, 8, 19); //right ear highlight
		c.setColor (Color.black);
		c.fillOval (492, 213 - i, 9, 9); //left eye
		c.fillOval (509, 213 - i, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (495, 216 - i, 2, 2); //left eye highlight
		c.fillOval (512, 216 - i, 2, 2); //right eye highlight
		c.setColor (darkGrey);
		c.fillArc (503, 220 - i, 35, 15, 180, 180); //bottom of trunk
		c.fillArc (526, 205 - i, 15, 30, 230, 180); //top of trunk
		//trousers
		c.setColor (lightOrange);
		c.fillArc (485, 242 - i, 40, 35, 180, 180); //stomach part of trousers
		c.fillRect (491, 270 - i, 12, 16); //left leg trouser
		c.fillRect (507, 270 - i, 12, 16); //right leg trouser
		c.setColor (orange);
		c.fillRect (491, 239 - i, 7, 26); //left strap
		c.fillRect (511, 239 - i, 7, 26); //left strap
		c.setColor (Color.red);
		c.fillMapleLeaf (497, 261 - i, 15, 15);
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
	for (int i = 0 ; i <= 540 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (466 - i, 95, 76, 92); //erase
		c.setColor (elephantGrey);
		c.fillOval (485 - i, 127, 40, 45); //body
		c.setColor (elephantGrey);
		c.fillOval (485 - i, 95, 40, 40); //head
		c.setColor (elephantGrey);
		c.fillOval (473 - i, 95, 20, 40); //left ear
		c.setColor (elephantGrey);
		c.fillOval (517 - i, 95, 20, 40); //right ear
		c.setColor (elephantGrey);
		c.fillRect (474 - i, 140, 13, 12); //left arm
		c.setColor (elephantGrey);
		c.fillRect (523 - i, 140, 13, 12); //right arm
		c.setColor (elephantGrey);
		c.fillRect (491 - i, 165, 12, 21); //left foot
		c.setColor (elephantGrey);
		c.fillRect (507 - i, 165, 12, 21); //right foot
		c.setColor (pink);
		c.fillOval (479 - i, 106, 8, 19); //left ear highlight
		c.setColor (pink);
		c.fillOval (523 - i, 106, 8, 19); //right ear highlight
		c.setColor (Color.black);
		c.fillOval (492 - i, 108, 9, 9); //left eye
		c.setColor (Color.black);
		c.fillOval (509 - i, 108, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (495 - i, 111, 2, 2); //left eye highlight
		c.setColor (Color.white);
		c.fillOval (512 - i, 111, 2, 2); //right eye highlight
		c.setColor (darkGrey);
		c.fillArc (503 - i, 115, 35, 15, 180, 180); //bottom of trunk
		c.setColor (darkGrey);
		c.fillArc (526 - i, 100, 15, 30, 230, 180); //top of trunk
		//trousers
		c.setColor (lightOrange);
		c.fillArc (485 - i, 137, 40, 35, 180, 180); //stomach part of trousers
		c.setColor (lightOrange);
		c.fillRect (491 - i, 165, 12, 16); //left leg trouser
		c.setColor (lightOrange);
		c.fillRect (507 - i, 165, 12, 16); //right leg trouser
		c.setColor (orange);
		c.fillRect (491 - i, 134, 7, 26); //left strap
		c.setColor (orange);
		c.fillRect (511 - i, 134, 7, 26); //left strap
		c.setColor (Color.red);
		c.fillMapleLeaf (497 - i, 156, 15, 15);
	    }
	    //used to delay the animation
	    try
	    {
		Thread.sleep (17);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public ElephantC (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}


