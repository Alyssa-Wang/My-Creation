/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the opening background.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class StartBackground // creates a class called StartBackground
{
    //global variable used to a
    private Console c;

    //class to make background
    public void display ()
    {
	//local colour variable for the background
	Color tan = new Color (239, 193, 134);
	//local colour variable for the dark vines
	Color darkGreen = new Color (20, 90, 50);
	//local colour variable for the curtains
	Color lightGreen = new Color (174, 213, 129);
	//local colour variable for the medium vines
	Color mediumGreen = new Color (11, 138, 0);
	//local colour variable for the text
	Color title = new Color (160, 82, 45);
	//local colour variable for the lights coming out of the stage lights
	Color lightYellow = new Color (255, 249, 196);
	//local colour variable for the sunglasses
	Color brightBlue = new Color (99, 220, 242);
	//loop used to make the background
	for (int x = 0 ; x < 641 ; x++)
	{
	    c.setColor (tan);
	    c.drawRect (0, 0, x, 500);
	}
	//loop used to create curtains
	for (int x = 0 ; x <= 500 ; x++)

	    {
		c.setColor (lightGreen);
		c.drawOval (-20 - x / 2, -190, x, 360);
		c.drawOval (660 - x / 2, -190, x, 360);
	    }
	//vines
	c.setColor (mediumGreen);
	c.drawArc (180, -100, 200, 160, 180, 180);
	c.drawArc (320, -25, 100, 50, 180, 180);
	c.drawArc (540, 420, 200, 200, 90, 90);
	c.setColor (darkGreen);
	c.drawArc (260, -105, 200, 180, 180, 180);
	c.drawArc (-78, 469, 160, 80, 0, 90);
	c.drawArc (480, 475, 140, 60, 0, 180);
	//stage lights
	c.setColor (Color.black);
	//left vertical hanging stand
	for (int i = 0 ; i <= 8 ; i++)

	    {
		c.drawLine (113 + i, 44, 113 + i, 0);
	    }
	//right vertical hanging stand
	for (int i = 0 ; i <= 8 ; i++)

	    {
		c.drawLine (483 + i, 44, 483 + i, 0);
	    }
	//left
	for (int i = 0 ; i <= 30 ; i++)

	    {
		c.drawLine (121 + i, 78 - i / 2, 151 + i, 118 - i / 2);
		c.drawLine (122 + i, 78 - i / 2, 152 + i, 118 - i / 2);
		c.drawLine (120 + i, 78 - i / 2, 150 + i, 118 - i / 2);
	    }
	//left bottom tilted stand
	for (int i = 0 ; i <= 8 ; i++)

	    {
		c.drawLine (112 + i, 42 - i / 2, 135 + i, 75 - i / 2);
		c.drawLine (113 + i, 42 - i / 2, 136 + i, 75 - i / 2);
		c.drawLine (111 + i, 42 - i / 2, 134 + i, 75 - i / 2);
	    }
	//right
	for (int i = 0 ; i <= 30 ; i++)

	    {
		c.drawLine (427 + i, 95 + i / 2, 457 + i, 55 + i / 2);
		c.drawLine (428 + i, 95 + i / 2, 458 + i, 55 + i / 2);
		c.drawLine (426 + i, 95 + i / 2, 456 + i, 55 + i / 2);
	    }
	//right bottom tilted stand
	for (int i = 0 ; i <= 8 ; i++)

	    {
		c.drawLine (460 + i, 73 + i / 2, 482 + i, 42 + i / 2);
		c.drawLine (461 + i, 73 + i / 2, 483 + i, 42 + i / 2);
		c.drawLine (459 + i, 73 + i / 2, 481 + i, 42 + i / 2);
	    }

	//loop used to create light behind title
	for (int i = 0 ; i <= 365 ; i++)

	    {
		c.setColor (lightYellow);
		c.drawOval (320 - i / 2, 120, i, 205);
	    }
	//left rectangle light
	for (int i = 0 ; i <= 30 ; i++)

	    {
		c.drawLine (151 + i, 118 - i / 2, 210 + i, 198 - i / 2);
		c.drawLine (152 + i, 118 - i / 2, 211 + i, 198 - i / 2);
		c.drawLine (150 + i, 118 - i / 2, 209 + i, 198 - i / 2);
	    }
	//left triangle left light
	for (int i = 0 ; i <= 80 ; i++)

	    {
		c.drawLine (151, 118, 240 - i, 198 + i / 2);
	    }
	//right triangle left light
	for (int i = 0 ; i <= 60 ; i++)

	    {
		c.drawLine (181, 104, 240 + i, 181 - i / 2);
	    }
	//right rectangle light
	for (int i = 0 ; i <= 30 ; i++)

	    {
		c.drawLine (427 + i, 95 + i / 2, 377 + i, 165 + i / 2);
		c.drawLine (428 + i, 95 + i / 2, 378 + i, 165 + i / 2);
		c.drawLine (426 + i, 95 + i / 2, 376 + i, 165 + i / 2);
	    }
	//left triangle left light
	for (int i = 0 ; i <= 40 ; i++)

	    {
		c.drawLine (427, 95, 377 - i, 165 - i / 2);
	    }
	//right triangle right light
	for (int i = 0 ; i <= 80 ; i++)

	    {
		c.drawLine (455, 108, 405 + i, 185 + i / 2);
	    }
	//title
	c.setColor (title);
	c.setFont (new Font ("Serif", Font.BOLD, 38));
	c.drawString ("Presenting: ", 170, 170);
	c.setFont (new Font ("Serif", Font.BOLD, 42));
	c.drawString ("THE JUNGLE", 192, 220);
	c.drawString ("FASHION SHOW", 165, 270);

    }


    public StartBackground (Console con)
    {
	c = con;
	display ();
    }
}
