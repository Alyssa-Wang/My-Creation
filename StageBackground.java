/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the main background that displays the runway and the audience.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class StageBackground
{
    private Console c;
    public void display ()
    {
	//local colour variable for the background
	Color lightGrey = new Color (100, 100, 100);
	//local colour variable for the top of the stage
	Color lightBrown = new Color (215, 169, 101);
	// //local colour variable for bottom of the stage
	Color darkBrown = new Color (185, 140, 72);
	//local colour variable for the vines
	Color mediumGreen = new Color (11, 138, 0);
	//local colour variable for the audience
	Color darkGrey = new Color (43, 43, 43);
	//local colour variable for the vines hanging from the lights
	Color brightGreen = new Color (94, 187, 0);
	//local colour variable for the lights
	Color lightYellow = new Color (255, 249, 196);
	//loop used to make the background
	for (int x = 0 ; x < 641 ; x++)
	{
	    c.setColor (lightGrey);
	    c.drawRect (0, 0, x, 500);
	}
	//loop used to create top of the stage
	for (int i = 0 ; i <= 210 ; i++)

	    {
		c.setColor (lightBrown);
		c.drawLine (0, 300 - i, 540, 300 - i);
	    }
	//triangle of the stage
	int x[] = {540, 540, 600}; //list of all x-coordintes
	int y[] = {90, 300, 300}; // list of all y-coordinates
	c.fillPolygon (x, y, 3);
	//loop used to create bottom of the stage
	for (int i = 0 ; i <= 100 ; i++)

	    {
		c.setColor (darkBrown);
		c.drawLine (0, 400 - i, 600, 400 - i);
	    }
	//vines
	//vines from the stage
	c.setColor (mediumGreen);
	c.drawArc (0, 275, 75, 50, 180, 180);
	c.drawArc (75, 275, 75, 50, 180, 180);
	c.drawArc (150, 275, 75, 50, 180, 180);
	c.drawArc (225, 275, 75, 50, 180, 180);
	c.drawArc (300, 275, 75, 50, 180, 180);
	c.drawArc (375, 275, 75, 50, 180, 180);
	c.drawArc (450, 275, 75, 50, 180, 180);
	c.drawArc (525, 275, 75, 50, 180, 180);
	//vines from the lights
	c.setColor (brightGreen);
	c.drawOval (-53, -30, 82, 60); //half cut off vine
	c.drawOval (63, -30, 82, 60); //first fully visible vine (starting from left)
	c.drawOval (179, -30, 82, 60); //second fully visible vine from the left
	c.drawOval (295, -30, 82, 60); //third fully visible vine from the left
	c.drawOval (411, -30, 82, 60); //fourth fully visible vine from the left
	//audience
	c.setColor (darkGrey);
	for (int i = 0 ; i <= 45 ; i++)

	    {
		//heads
		//first row
		c.drawOval (-20 - i / 2, 340, i, i); //side of first head
		c.drawOval (40 - i / 2, 340, i, i); //next head to the right
		c.drawOval (41 - i / 2, 340, i, i); //next head to the right
		c.drawOval (130 - i / 2, 340, i, i); //next head to the right
		c.drawOval (131 - i / 2, 340, i, i); //next head to the right
		c.drawOval (220 - i / 2, 340, i, i); //next head to the right
		c.drawOval (221 - i / 2, 340, i, i); //next head to the right
		c.drawOval (310 - i / 2, 340, i, i); //next head to the right
		c.drawOval (311 - i / 2, 340, i, i); //next head to the right
		c.drawOval (400 - i / 2, 340, i, i); //next head to the right
		c.drawOval (401 - i / 2, 340, i, i); //next head to the right
		c.drawOval (490 - i / 2, 340, i, i); //next head to the right
		c.drawOval (491 - i / 2, 340, i, i); //next head to the right
		c.drawOval (580 - i / 2, 340, i, i); //last head
		c.drawOval (581 - i / 2, 340, i, i); //last head
		//third row
		c.drawOval (-20 - i / 2, 490, i, i); //side of first head
		c.drawOval (42 - i / 2, 490, i, i); //next head to the right
		c.drawOval (43 - i / 2, 490, i, i); //next head to the right
		c.drawOval (132 - i / 2, 490, i, i); //next head to the right
		c.drawOval (133 - i / 2, 490, i, i); //next head to the right
		c.drawOval (222 - i / 2, 490, i, i); //next head to the right
		c.drawOval (223 - i / 2, 490, i, i); //next head to the right
		c.drawOval (312 - i / 2, 490, i, i); //next head to the right
		c.drawOval (313 - i / 2, 490, i, i); //next head to the right
		c.drawOval (402 - i / 2, 490, i, i); //next head to the right
		c.drawOval (403 - i / 2, 490, i, i); //next head to the right
		c.drawOval (492 - i / 2, 490, i, i); //next head to the right
		c.drawOval (493 - i / 2, 490, i, i); //next head to the right
		c.drawOval (582 - i / 2, 490, i, i); //last head
		c.drawOval (583 - i / 2, 490, i, i); //last head
	    }
	for (int i = 0 ; i <= 42 ; i++)
	{
	    //second row heads
	    c.drawOval (-3 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (-4 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (87 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (88 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (177 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (178 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (267 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (268 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (357 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (358 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (447 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (448 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (537 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (538 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (627 - i / 2, 415, i, i); //next head to the right
	    c.drawOval (628 - i / 2, 415, i, i); //next head to the right
	    //side heads first row
	    c.drawOval (575 - i / 2, 65, i, i); //top side head
	    c.drawOval (576 - i / 2, 65, i, i); //top side head
	    c.drawOval (595 - i / 2, 140, i, i); //second side head
	    c.drawOval (596 - i / 2, 140, i, i); //second side head
	    c.drawOval (615 - i / 2, 215, i, i); //third side head
	    c.drawOval (616 - i / 2, 215, i, i); //third side head
	    //side heads second row
	    c.drawOval (618 - i / 2, 23, i, i); //top side head
	    c.drawOval (619 - i / 2, 23, i, i); //top side head
	    c.drawOval (638 - i / 2, 98, i, i); //second side head
	    c.drawOval (639 - i / 2, 98, i, i); //secondside head
	    c.drawOval (658 - i / 2, 173, i, i); //third side head
	    c.drawOval (659 - i / 2, 173, i, i); //third side head
	}
	for (int i = 0 ; i <= 45 ; i++)
	{
	    //first row body
	    c.drawLine (20 + i, 385, 20 + i, 445); //first full body
	    c.drawLine (110 + i, 385, 110 + i, 445); //second body
	    c.drawLine (200 + i, 385, 200 + i, 445); //third body
	    c.drawLine (290 + i, 385, 290 + i, 445); //fourth body
	    c.drawLine (380 + i, 385, 380 + i, 445); //fifth body
	    c.drawLine (470 + i, 385, 470 + i, 445); //sixth body
	    c.drawLine (560 + i, 385, 560 + i, 445); //seventh body

	}
	for (int i = 0 ; i <= 43 ; i++)
	{
	    //second row body
	    c.drawLine (-23 + i, 457, -23 + i, 499); //first body
	    c.drawLine (67 + i, 457, 67 + i, 499); //second body
	    c.drawLine (157 + i, 457, 157 + i, 499); //third body
	    c.drawLine (247 + i, 457, 247 + i, 499); //fourth body
	    c.drawLine (337 + i, 457, 337 + i, 499); //fifth body
	    c.drawLine (427 + i, 457, 427 + i, 499); //sixth body
	    c.drawLine (517 + i, 457, 517 + i, 499); //seventh body
	    c.drawLine (607 + i, 457, 607 + i, 499); //eighth body

	}
	//body for side heads
	for (int i = 0 ; i <= 28 ; i++)
	{
	    //first row
	    c.drawLine (562 + i, 107, 562 + i, 149); //top body
	    c.drawLine (582 + i, 182, 582 + i, 224); //second body
	    c.drawLine (602 + i, 257, 602 + i, 299); //third body
	    //second row
	    c.drawLine (605 + i, 65, 605 + i, 107); //top body
	    c.drawLine (620 + i, 140, 620 + i, 182); //second body
	}
	//loop used to create stage lights

	for (int i = 0 ; i <= 31 ; i++)
	{
	    //black
	    c.setColor (Color.black);
	    c.drawLine (31 + i, 0, 31 + i, 30); //first light on the left
	    c.drawLine (147 + i, 0, 147 + i, 30); //second light after the previous one
	    c.drawLine (263 + i, 0, 263 + i, 30); //third light after the previous one
	    c.drawLine (379 + i, 0, 379 + i, 30); //fourth light after the previous one
	    c.drawLine (495 + i, 0, 495 + i, 30); //last light
	    //yellow
	    c.setColor (lightYellow);
	    c.drawLine (31 + i, 30, 31 + i, 60); //first light on the left
	    c.drawLine (147 + i, 30, 147 + i, 60); //second light after the previous one
	    c.drawLine (263 + i, 30, 263 + i, 60); //third light after the previous one
	    c.drawLine (379 + i, 30, 379 + i, 60); //fourth light after the previous one
	    c.drawLine (495 + i, 30, 495 + i, 60); //last light
	}
	//triangles for the stage lights
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.drawLine (31, 30, 31 - i, 60); //first light left triangle
	    c.drawLine (62, 30, 62 + i, 60); //first light right triangle
	    c.drawLine (147, 30, 147 - i, 60); //second light left triangle
	    c.drawLine (178, 30, 178 + i, 60); //second light right triangle
	    c.drawLine (263, 30, 263 - i, 60); //third light left triangle
	    c.drawLine (294, 30, 294 + i, 60); //third light right triangle
	    c.drawLine (379, 30, 379 - i, 60); //fourth light left triangle
	    c.drawLine (410, 30, 410 + i, 60); //fourth light right triangle
	    c.drawLine (495, 30, 495 - i, 60); //last light left triangle
	    c.drawLine (526, 30, 526 + i, 60); //last light right triangle
	}
    }


    public StageBackground (Console con)
    {
	c = con;
	display ();
    }
}
