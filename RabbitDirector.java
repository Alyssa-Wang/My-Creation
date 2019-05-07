/*
Alyssa Wang
Ms.Krasteva
Oct. 22, 2018
This class creates the overloaded constructor which is the rabbit director of the fashion show.
*/

import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files
import java.lang.*; // allows access to Thread class

public class RabbitDirector extends Thread
{
    private Console c;
    private Color sunglasses;
    private Color gloves;
    private Color shoes;
    private int delay;
    public void display ()
    {
	//local colour variable for the background
	Color tan = new Color (239, 193, 134);
	//local colour variable for the rabbit ears
	Color lightPink = new Color (252, 196, 202);
	//local colour vairable for the rabbits snout
	Color almostWhite = new Color (252, 249, 244);
	//local colour vairable for the rabbit body
	Color lightGrey = new Color (224, 224, 224);
	//for loop used to make the rabbits go straight across
	for (int i = 0 ; i <= 380 ; i++)
	{
	    c.setColor (tan);
	    c.fillRect (-90 + i, 349, 85, 116); //erase
	    c.setColor (Color.black);
	    c.drawOval (-67 + i, 443, 14, 21); //left foot outline
	    c.drawOval (-48 + i, 443, 14, 21); //left foot outline
	    c.drawOval (-88 + i, 411, 21, 13); //left arm outline
	    c.drawOval (-35 + i, 411, 21, 13); //right arm outline
	    c.setColor (lightGrey);
	    c.fillOval (-66 + i, 444, 13, 20); //left foot
	    c.fillOval (-47 + i, 444, 13, 20); //right foot
	    c.fillOval (-87 + i, 412, 20, 12); //left arm
	    c.fillOval (-34 + i, 412, 20, 12); //right arm
	    c.setColor (Color.black);
	    c.drawOval (-71 + i, 349, 11, 30); //left ear outline
	    c.drawOval (-41 + i, 349, 11, 31); //right ear outline
	    c.drawOval (-73 + i, 399, 44, 51); //body outline
	    c.setColor (lightGrey);
	    c.fillOval (-70 + i, 350, 10, 30); //left ear
	    c.fillOval (-40 + i, 350, 10, 30); //right ear
	    c.fillOval (-72 + i, 400, 43, 50); //body
	    c.setColor (Color.pink);
	    c.fillOval (-68 + i, 356, 6, 20); //left ear
	    c.fillOval (-38 + i, 356, 6, 20); //right ear
	    c.setColor (Color.black);
	    c.drawOval (-71 + i, 369, 41, 41); //head outline
	    c.setColor (lightGrey);
	    c.fillOval (-70 + i, 370, 40, 40); //head
	    c.fillOval (-73 + i, 390, 45, 20); //bottom head nose shape
	    c.setColor (almostWhite);
	    c.fillOval (-56 + i, 390, 12, 12); //snout
	    c.fillRect (-53 + i, 402, 3, 5); //left tooth
	    c.fillRect (-50 + i, 402, 3, 5); //right tooth
	    c.fillOval (-61 + i, 412, 20, 27); //stomach
	    c.setColor (Color.pink);
	    c.fillOval (-53 + i, 391, 6, 6); //nose
	    c.setColor (Color.black);
	    c.drawOval (-73 + i, 390, 45, 20); //bottom head nose shape outline
	    c.drawOval (-56 + i, 390, 12, 12); //snout outline
	    c.drawLine (-50 + i, 397, -50 + i, 402); //nose line connnector
	    c.drawOval (-53 + i, 391, 6, 6); //nose outline
	    c.drawRect (-53 + i, 402, 3, 5); //left tooth
	    c.drawRect (-50 + i, 402, 3, 5); //right tooth outline
	    c.drawArc (-84 + i, 398, 20, 2, 0, 180); //top left whisker
	    c.drawArc (-84 + i, 401, 20, 2, 0, 180); //middle left whisker
	    c.drawArc (-84 + i, 404, 20, 2, 0, 180); //left left whisker
	    c.drawArc (-37 + i, 398, 20, 2, 0, 180); //top right whisker
	    c.drawArc (-37 + i, 401, 20, 2, 0, 180); //middle right whisker
	    c.drawArc (-37 + i, 404, 20, 2, 0, 180); //left right whisker
	    c.setColor (sunglasses);
	    c.fillArc (-66 + i, 376, 14, 16, 180, 180); //left lens for sunglasses
	    c.fillArc (-48 + i, 376, 14, 16, 180, 180); //right lens for sunglasses
	    c.drawLine (-66 + i, 384, -38 + i, 384); //connecting band
	    c.drawLine (-67 + i, 384, -70 + i, 382); //left band
	    c.drawLine (-34 + i, 384, -32 + i, 381); //right band
	    c.setColor (shoes);
	    c.fillArc (-66 + i, 447, 13, 18, 180, 180); //left shoe
	    c.fillArc (-47 + i, 447, 13, 18, 180, 180); //right shoe
	    c.setColor (gloves);
	    c.fillArc (-89 + i, 412, 17, 12, 90, 180); //left glove
	    c.fillArc (-29 + i, 412, 17, 12, 270, 180); //right glove
	    c.setColor (Color.black);
	    c.fillRect (-70 + i, 411, 40, 5); //tie neck strap
	    c.drawArc (-23 + i, 416, 13, 15, 0, 180); //handle of cane
	    c.drawLine (-10 + i, 423, -10 + i, 464); //rest of cane
	    c.setColor (Color.pink);
	    c.fillRect (-53 + i, 411, 5, 5); //top of tie
	    //tie
	    int x[] = { - 51 + i, -57 + i, -45 + i}; //list of all x-coordintes
	    int y[] = {413, 423, 423}; // list of all y-coordinates
	    c.fillPolygon (x, y, 3);
	    int a[] = { - 51 + i, -57 + i, -45 + i}; //list of all x-coordintes
	    int t[] = {440, 423, 423}; // list of all y-coordinates
	    c.fillPolygon (a, t, 3);
	    //used to delay the animation
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//for loops used to make rabbits go diagonally
	for (int i = 0 ; i <= 350 ; i++)
	{
	    c.setColor (tan);
	    c.fillRect (289 + i, 350 - i / 4, 85, 116); //erase
	    c.setColor (Color.black);
	    c.drawOval (313 + i, 443 - i / 4, 14, 21); //left foot outline
	    c.drawOval (332 + i, 443 - i / 4, 14, 21); //left foot outline
	    c.drawOval (292 + i, 411 - i / 4, 21, 13); //left arm outline
	    c.drawOval (345 + i, 411 - i / 4, 21, 13); //right arm outline
	    c.setColor (lightGrey);
	    c.fillOval (314 + i, 444 - i / 4, 13, 20); //left foot
	    c.fillOval (333 + i, 444 - i / 4, 13, 20); //right foot
	    c.fillOval (293 + i, 412 - i / 4, 20, 12); //left arm
	    c.fillOval (346 + i, 412 - i / 4, 20, 12); //right arm
	    c.setColor (Color.black);
	    c.drawOval (309 + i, 349 - i / 4, 11, 30); //left ear outline
	    c.drawOval (339 + i, 349 - i / 4, 11, 31); //right ear outline
	    c.drawOval (307 + i, 399 - i / 4, 44, 51); //body outline
	    c.setColor (lightGrey);
	    c.fillOval (310 + i, 350 - i / 4, 10, 30); //left ear
	    c.fillOval (340 + i, 350 - i / 4, 10, 30); //right ear
	    c.fillOval (308 + i, 400 - i / 4, 43, 50); //body
	    c.setColor (Color.pink);
	    c.fillOval (312 + i, 356 - i / 4, 6, 20); //left ear
	    c.fillOval (342 + i, 356 - i / 4, 6, 20); //right ear
	    c.setColor (Color.black);
	    c.drawOval (309 + i, 369 - i / 4, 41, 41); //head outline
	    c.setColor (lightGrey);
	    c.fillOval (310 + i, 370 - i / 4, 40, 40); //head
	    c.fillOval (307 + i, 390 - i / 4, 45, 20); //bottom head nose shape
	    c.setColor (almostWhite);
	    c.fillOval (324 + i, 390 - i / 4, 12, 12); //snout
	    c.fillRect (327 + i, 402 - i / 4, 3, 5); //left tooth
	    c.fillRect (330 + i, 402 - i / 4, 3, 5); //right tooth
	    c.fillOval (319 + i, 412 - i / 4, 20, 27); //stomach
	    c.setColor (Color.pink);
	    c.fillOval (327 + i, 391 - i / 4, 6, 6); //nose
	    c.setColor (Color.black);
	    c.drawOval (307 + i, 390 - i / 4, 45, 20); //bottom head nose shape outline
	    c.drawOval (324 + i, 390 - i / 4, 12, 12); //snout outline
	    c.drawLine (330 + i, 397 - i / 4, 330 + i, 402 - i / 4); //nose line connnector
	    c.drawOval (327 + i, 391 - i / 4, 6, 6); //nose outline
	    c.drawRect (327 + i, 402 - i / 4, 3, 5); //left tooth
	    c.drawRect (330 + i, 402 - i / 4, 3, 5); //right tooth outline
	    c.drawArc (296 + i, 398 - i / 4, 20, 2, 0, 180); //top left whisker
	    c.drawArc (296 + i, 401 - i / 4, 20, 2, 0, 180); //middle left whisker
	    c.drawArc (296 + i, 404 - i / 4, 20, 2, 0, 180); //left left whisker
	    c.drawArc (347 + i, 398 - i / 4, 20, 2, 0, 180); //top right whisker
	    c.drawArc (343 + i, 401 - i / 4, 20, 2, 0, 180); //middle right whisker
	    c.drawArc (343 + i, 404 - i / 4, 20, 2, 0, 180); //left right whisker
	    c.setColor (sunglasses);
	    c.fillArc (314 + i, 376 - i / 4, 14, 16, 180, 180); //left lens for sunglasses
	    c.fillArc (332 + i, 376 - i / 4, 14, 16, 180, 180); //right lens for sunglasses
	    c.drawLine (314 + i, 384 - i / 4, 342 + i, 384 - i / 4); //connecting band
	    c.drawLine (315 + i, 384 - i / 4, 310 + i, 382 - i / 4); //left band
	    c.drawLine (346 + i, 384 - i / 4, 348 + i, 381 - i / 4); //right band
	    c.setColor (shoes);
	    c.fillArc (314 + i, 447 - i / 4, 13, 18, 180, 180); //left shoe
	    c.fillArc (333 + i, 447 - i / 4, 13, 18, 180, 180); //right shoe
	    c.setColor (gloves);
	    c.fillArc (291 + i, 412 - i / 4, 17, 12, 90, 180); //left glove
	    c.fillArc (351 + i, 412 - i / 4, 17, 12, 270, 180); //right glove
	    c.setColor (Color.black);
	    c.fillRect (310 + i, 411 - i / 4, 40, 5); //tie neck strap
	    c.drawArc (357 + i, 416 - i / 4, 13, 15, 0, 180); //handle of cane
	    c.drawLine (370 + i, 423 - i / 4, 370 + i, 464 - i / 4); //rest of cane
	    c.setColor (Color.pink);
	    c.fillRect (327 + i, 411 - i / 4, 5, 5); //top of tie
	    //tie
	    int x[] = {329 + i, 323 + i, 335 + i}; //list of all x-coordintes
	    int y[] = {413 - i / 4, 423 - i / 4, 423 - i / 4}; // list of all y-coordinates
	    c.fillPolygon (x, y, 3);
	    int a[] = {329 + i, 323 + i, 335 + i}; //list of all x-coordintes
	    int t[] = {440 - i / 4, 423 - i / 4, 423 - i / 4}; // list of all y-coordinates
	    c.fillPolygon (a, t, 3);
	    //used to delay the animation
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //original rabbit
    public RabbitDirector (Console con)
    {
	c = con;
	sunglasses = new Color (229, 41, 53);
	gloves = new Color (229, 41, 53);
	shoes = new Color (229, 41, 53);
	delay = 5;
    }


    //rabbit with a new color parameter
    public RabbitDirector (Console con, Color n)
    {
	c = con;
	sunglasses = n;
	gloves = n;
	shoes = n;
    }


    //rabbit with a color parameter and a new delay time
    public RabbitDirector (Console con, Color n, int t)
    {
	c = con;
	sunglasses = n;
	gloves = n;
	shoes = n;
	delay = t;
    }


    public void run ()
    {
	display ();
    }
}


