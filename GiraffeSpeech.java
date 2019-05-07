/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the giraffe model.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class GiraffeSpeech extends Thread
{
    //global variable used to a
    private Console c;

    //class to make background
    public void display ()
    {
	//to delay the speech bubble from appearing
	try
	{
	    Thread.sleep (5000);
	}
	catch (Exception e)
	{
	}
	//for loop used to draw the first speech bubble
	for (int i = 0 ; i <= 105 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    synchronized (c)
	    {
		c.setColor (Color.white);
		c.drawOval (492 - i / 2, 140, i, 50);
		c.drawOval (493 - i / 2, 140, i, 50);
		c.drawOval (491 - i / 2, 140, i, 50);
	    }
	}
	//keeps threads from overlapping each other and switching up the colours
	synchronized (c)
	{
	    //text in the first speech bubble
	    c.setColor (Color.black);
	    c.setFont (new Font ("Serif", Font.PLAIN, 13));
	    c.drawString ("Could you please ", 449, 158);
	    c.drawString ("stop bumping", 455, 173);
	    c.drawString ("into me?!", 466, 188);
	}
	//used to delay the text do it doesn't get erased
	try
	{
	    Thread.sleep (900);
	}
	catch (Exception e)
	{
	}

    }


    public void display2 ()
    {
	//used to delay the secodn speech bubble from appearing
	try
	{
	    Thread.sleep (3500);
	}
	catch (Exception e)
	{
	}
	//for loop used to draw the second speech bubble
	for (int i = 0 ; i <= 105 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    synchronized (c)
	    {
		c.setColor (Color.white);
		c.drawOval (382 - i / 2, 140, i, 50);
		c.drawOval (383 - i / 2, 140, i, 50);
		c.drawOval (381 - i / 2, 140, i, 50);
	    }
	}
	//keeps threads from overlapping each other and switching up the colours
	synchronized (c)
	{
	    //text in the second speech bubble
	    c.setColor (Color.black);
	    c.setFont (new Font ("Serif", Font.PLAIN, 13));
	    c.drawString ("I'm sorry! I didn't", 339, 158);
	    c.drawString ("realize how fast", 351, 173);
	    c.drawString ("I was going!", 354, 187);
	}
	//delay used to delay the erase from appearing
	try
	{
	    Thread.sleep (3800);
	}


	catch (Exception e)
	{
	}
    }



    public void erase ()
    {
	//local colour variable for the top of the stage
	Color lightBrown = new Color (215, 169, 101);
	//erase for the giraffe speech bubble
	for (int i = 0 ; i <= 112 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.drawOval (490 - i / 2, 139, i, 55);
		c.drawOval (491 - i / 2, 139, i, 55);
		c.drawOval (489 - i / 2, 139, i, 55);
	    }
	}
	//erase for the elephant speech bubble
	for (int i = 0 ; i <= 114 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.drawOval (380 - i / 2, 139, i, 57);
		c.drawOval (381 - i / 2, 139, i, 57);
		c.drawOval (379 - i / 2, 139, i, 57);
	    }
	}
    }


    public GiraffeSpeech (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
	display2 ();
	erase ();

    }
}
/*
Sources:
Mackenzie CPT facebook page for the synchronization code
Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
*/
