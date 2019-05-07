/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the pig model walking off the runway.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class PigB extends Thread // creates a class called BearA that is in the thread class
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
	//for loop moving the pig right
	for (int i = 0 ; i <= 63 ; i++)
	{
	    //keeps threads from overlapping each other and switching up the colours
	    // I got this from the Mackenzie facebook page
	    // Here is the link:https://docs.google.com/document/d/1mgR09oneNIJhgefgkHK2vpaSQ5gZ8xDqB7rtPDQ7YHM/edit?fbclid=IwAR2HP_Ybu0Q2RsCELSHossdkBnrBlsZtf1YJuwAdcCU6sF4cdklMLKnDhMs)
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (408 + i, 193, 66, 98);
		c.setColor (lightPink);
		c.fillOval (421 + i, 200, 40, 40); //head
		c.fillOval (419 + i, 230, 45, 50); //body
		c.fillOval (419 + i, 193, 12, 20); //left ear
		c.fillOval (451 + i, 193, 12, 20); //right ear
		c.fillRect (425 + i, 280, 12, 10); //left foot
		c.fillRect (446 + i, 280, 12, 10); //right foot
		//left arm
		int x[] = {409 + i, 416 + i, 426 + i, 419 + i};  //list of all x-coordintes
		int y[] = {245, 236, 246, 255}; // list of all y-coordinates
		c.fillPolygon (x, y, 4);
		//right arm
		int a[] = {457 + i, 467 + i, 474 + i, 464 + i};   //list of all x-coordintes
		int b[] = {245, 236, 246, 255}; // list of all y-coordinates
		c.fillPolygon (a, b, 4);
		c.setColor (lightBlue);
		c.fillRect (419 + i, 255, 45, 25); //bottom of apron
		c.fillRect (426 + i, 245, 31, 10); //top of the apron
		c.fillRect (431 + i, 237, 5, 8); //left strap
		c.fillRect (448 + i, 237, 5, 8); //right strap
		c.setColor (darkBlue);
		c.fillArc (430 + i, 245, 24, 24, 180, 180); //apron pocket
		c.setColor (lightRed);
		c.fillMapleLeaf (437 + i, 258, 10, 8); //maple leaf on apron
		c.setColor (Color.black);
		c.fillOval (428 + i, 212, 9, 9); //left eye
		c.fillOval (445 + i, 212, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (431 + i, 215, 2, 2); //left eye highlight
		c.fillOval (448 + i, 215, 2, 2); //right eye highlight
		c.setColor (mediumPink);
		c.fillOval (432 + i, 222, 18, 11); //snout
		c.setColor (darkPink);
		c.fillOval (436 + i, 225, 3, 5); //left nostril
		c.fillOval (443 + i, 225, 3, 5); //right nostril
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
	//for loop use to move the pig up
	for (int i = 0 ; i <= 100 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (471, 193 - i, 66, 98);
		c.setColor (lightPink);
		c.fillOval (484, 200 - i, 40, 40); //head
		c.fillOval (482, 230 - i, 45, 50); //body
		c.fillOval (482, 193 - i, 12, 20); //left ear
		c.fillOval (514, 193 - i, 12, 20); //right ear
		c.fillRect (488, 280 - i, 12, 10); //left foot
		c.fillRect (509, 280 - i, 12, 10); //right foot
		//left arm
		int x[] = {472, 479, 489, 482};      //list of all x-coordintes
		int y[] = {245 - i, 236 - i, 246 - i, 255 - i}; // list of all y-coordinates
		c.fillPolygon (x, y, 4);
		//right arm
		int a[] = {520, 530, 537, 527};       //list of all x-coordintes
		int b[] = {245 - i, 236 - i, 246 - i, 255 - i}; // list of all y-coordinates
		c.fillPolygon (a, b, 4);
		c.setColor (lightBlue);
		c.fillRect (482, 255 - i, 45, 25); //bottom of apron
		c.fillRect (489, 245 - i, 31, 10); //top of the apron
		c.fillRect (494, 237 - i, 5, 8); //left strap
		c.fillRect (511, 237 - i, 5, 8); //right strap
		c.setColor (darkBlue);
		c.fillArc (493, 245 - i, 24, 24, 180, 180); //apron pocket
		c.setColor (lightRed);
		c.fillMapleLeaf (500, 258 - i, 10, 8); //maple leaf on apron
		c.setColor (Color.black);
		c.fillOval (491, 212 - i, 9, 9); //left eye
		c.fillOval (508, 212 - i, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (494, 215 - i, 2, 2); //left eye highlight
		c.fillOval (511, 215 - i, 2, 2); //right eye highlight
		c.setColor (mediumPink);
		c.fillOval (495, 222 - i, 18, 11); //snout
		c.setColor (darkPink);
		c.fillOval (499, 225 - i, 3, 5); //left nostril
		c.fillOval (506, 225 - i, 3, 5); //right nostril
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
	//for loop move the pig left
	for (int i = 0 ; i <= 535 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (lightBrown);
		c.fillRect (472 - i, 93, 66, 98);
		c.setColor (lightPink);
		c.fillOval (484 - i, 100, 40, 40); //head
		c.fillOval (482 - i, 130, 45, 50); //body
		c.fillOval (482 - i, 93, 12, 20); //left ear
		c.fillOval (514 - i, 93, 12, 20); //right ear
		c.fillRect (488 - i, 180, 12, 10); //left foot
		c.fillRect (509 - i, 180, 12, 10); //right foot
		//left arm
		int x[] = {472 - i, 479 - i, 489 - i, 482 - i}; //list of all x-coordintes
		int y[] = {145, 136, 146, 155};     // list of all y-coordinates
		c.fillPolygon (x, y, 4);
		//right arm
		int a[] = {520 - i, 530 - i, 537 - i, 527 - i}; //list of all x-coordintes
		int b[] = {145, 136, 146, 155};     // list of all y-coordinates
		c.fillPolygon (a, b, 4);
		c.setColor (lightBlue);
		c.fillRect (482 - i, 155, 45, 25); //bottom of apron
		c.fillRect (489 - i, 145, 31, 10); //top of the apron
		c.fillRect (494 - i, 137, 5, 8); //left strap
		c.fillRect (511 - i, 137, 5, 8); //right strap
		c.setColor (darkBlue);
		c.fillArc (493 - i, 145, 24, 24, 180, 180); //apron pocket
		c.setColor (lightRed);
		c.fillMapleLeaf (500 - i, 158, 10, 8); //maple leaf on apron
		c.setColor (Color.black);
		c.fillOval (491 - i, 112, 9, 9); //left eye
		c.fillOval (508 - i, 112, 9, 9); //right eye
		c.setColor (Color.white);
		c.fillOval (494 - i, 115, 2, 2); //left eye highlight
		c.fillOval (511 - i, 115, 2, 2); //right eye highlight
		c.setColor (mediumPink);
		c.fillOval (495 - i, 122, 18, 11); //snout
		c.setColor (darkPink);
		c.fillOval (499 - i, 125, 3, 5); //left nostril
		c.fillOval (506 - i, 125, 3, 5); //right nostril
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


    public PigB (Console con)
    {
	c = con;
    }


    public void run ()
    {
	display ();
    }
}
