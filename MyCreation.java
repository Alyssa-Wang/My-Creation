import java.awt.*; //allows access to the java command libraries
import hsa.Console; //allows access to the Console class files

/*
Alyssa Wang
Ms.Krasteva
Oct.22,2018
This program creates and animates the objects.
Assignment:This program displays a jungle fashion show with a pig,bear,hippo, elephant,and giraffe as the models.
Three bunnies will enter in the beginning as the director of the fasion show.
As the models are walking down the runway, they keep bumping into each other because they didn't practise enough.
But the show must go on so they continue with the fashion show.
*/

public class MyCreation // creates the main class called MyCreation
{
    Console c; //class that allows the ouput window to be created
    //adds the StartBackground thread to MyCreation
    public void StartBackground ()
    {
	StartBackground s = new StartBackground (c); //creates the thread
    }


    //adds the RabbitDirector thread to MyCreation (Overloaded Constructor)
    public void RabbitDirector ()
    {
	//local colour variable for the rabbit accessories
	Color brightBlue = new Color (39, 207, 240);
	//local colour variable for the rabbit accessories
	Color lightPurple = new Color (199, 130, 229);
	//creates the RabbitDirector thread
	RabbitDirector r = new RabbitDirector (c);
	//starts the thread
	r.start ();
	//joins with RabbitDirector r1 so that it only executes when RabbitDirector is done
	try
	{
	    r.join ();
	}
	catch (InterruptedException e)
	{
	}
	RabbitDirector r1 = new RabbitDirector (c, brightBlue, 7);
	//starts the thread
	r1.start ();
	//joins with RabbitDirector r2 so that it only executes when RabbitDirector r1 is done
	try
	{
	    r1.join ();
	}
	catch (InterruptedException e)
	{
	}
	RabbitDirector r2 = new RabbitDirector (c, lightPurple, 9);
	//starts the thread
	r2.start ();
	//joins with StageBackground thread so that it only executes when RabbitDirector r2 is done
	try
	{
	    r2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the GiraffeA thread to MyCreation
    public void GiraffeA ()
    {
	GiraffeA g = new GiraffeA (c); //creates a copy of the thread
	//starts the thread
	g.start ();
	//joins with ElephantA thread so that it only executes when the GiraffeA thread is done
	try
	{
	    g.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the ElephantA thread to MyCreation
    public void ElephantA ()
    {
	ElephantA e = new ElephantA (c); //creates a copy of the thread
	//starts the thread
	e.start ();
    }


    //adds the GiraffeB thread to MyCreation
    public void GiraffeB ()
    {
	GiraffeB g = new GiraffeB (c); //creates a copy of the thread
	//starts the thread
	g.start ();
	//joins with GiraffeSpeech thread so that it only executes when the GiraffeB thread is done
	try
	{
	    g.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the GiraffeSpeech thread to MyCreation
    public void GiraffeSpeech ()
    {
	GiraffeSpeech g = new GiraffeSpeech (c); //creates a copy of the thread
	//starts the thread
	g.start ();
	//joins with GiraffeC thread so that it only executes when the GiraffeSpeech thread is done
	try
	{
	    g.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the GiraffeC thread to MyCreation
    public void GiraffeC ()
    {
	GiraffeC g = new GiraffeC (c); //creates a copy of the thread
	//starts the thread
	g.start ();
	//joins with GiraffeD thread so that it only executes when the GiraffeC thread is done
	try
	{
	    g.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the GiraffeD thread to MyCreation
    public void GiraffeD ()
    {
	GiraffeD g = new GiraffeD (c); //creates a copy of the thread
	//starts the thread
	g.start ();
    }


    //adds the ElephantB thread to MyCreation
    public void ElephantB ()
    {
	ElephantB a = new ElephantB (c); //creates a copy of the thread
	//starts the thread
	a.start ();
	//joins with ElephantC thread so that it only executes when the ElephantB thread is done
	try
	{
	    a.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the HippoA thread to MyCreation
    public void HippoA ()
    {
	HippoA h = new HippoA (c); //creates a copy of the thread
	//starts the thread
	h.start ();
	//joins with BearA thread so that it only executes when the HippoA thread is done
	try
	{
	    h.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the ElephantC thread to MyCreation
    public void ElephantC ()
    {
	ElephantC a = new ElephantC (c); //creates a copy of the thread
	//starts the thread
	a.start ();
    }


    //adds the BearA thread to MyCreation
    public void BearA ()
    {
	BearA b = new BearA (c); //creates a copy of the thread
	//starts the thread
	b.start ();
    }


    //adds the HippoB thread to MyCreation
    public void HippoB ()
    {
	HippoB h = new HippoB (c); //creates the thread
	//starts the thread
	h.start ();
	//joins with HippoC thread so that it only executes when the HippoB thread is done
	try
	{
	    h.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the HippoC thread to MyCreation
    public void HippoC ()
    {
	HippoC h = new HippoC (c); //creates the thread
	//starts the thread
	h.start ();
	//joins with HippoD thread so that it only executes when the HippoC thread is done
	try
	{
	    h.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the HippoD thread to MyCreation
    public void HippoD ()
    {
	HippoD h = new HippoD (c); //creates the thread
	//starts the thread
	h.start ();
    }


    //adds the BearB thread to MyCreation
    public void BearB ()
    {
	BearB b = new BearB (c); //creates the thread
	//starts the thread
	b.start ();
	//joins with PigA thread so that it only executes when the BearB thread is done
	try
	{
	    b.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the BearC thread to MyCreation
    public void BearC ()
    {
	BearC b = new BearC (c); //creates the thread
	//starts the thread
	b.start ();
	//joins with BearSpeech thread so that it only executes when the BearC thread is done
	try
	{
	    b.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the BearSpeech thread to MyCreation
    public void BearSpeech ()
    {
	BearSpeech b = new BearSpeech (c); //creates the thread
	//starts the thread
	b.start ();
	//joins with BearD thread so that it only executes when the BearSpeech thread is done
	try
	{
	    b.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the PigA thread to MyCreation
    public void PigA ()
    {
	PigA p = new PigA (c); //creates the thread
	//starts the thread
	p.start ();
    }


    //adds the BearD thread to MyCreation
    public void BearD ()
    {
	BearD b = new BearD (c); //creates the thread
	//starts the thread
	b.start ();
	//joins with BearE thread so that it only executes when the BearD thread is done
	try
	{
	    b.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the PigB thread to MyCreation
    public void PigB ()
    {
	PigB p = new PigB (c); //creates the thread
	//starts the thread
	p.start ();
	//joins with EndBackground thread so that it only executes when the PigB thread is done
	try
	{
	    p.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the BearE thread to MyCreation
    public void BearE ()
    {
	BearE b = new BearE (c); //creates the thread
	//starts the thread
	b.start ();
    }




    //adds the StageBackground thread to MyCreation
    public void StageBackground ()
    {
	StageBackground s = new StageBackground (c); //creates the thread
    }


    //adds the EndBackground thread to MyCreation
    public void EndBackground ()
    {
	EndBackground s = new EndBackground (c); //creates the thread
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("The Jungle Fashion Show");
    }


    public static void main (String[] args)  //the main method
    {
	MyCreation m = new MyCreation (); //creates an instance variable and a copy of MyCreation
	m.StartBackground (); //executes the StartBackground method
	m.RabbitDirector (); //executes the RabbitDirector method
	m.StageBackground (); //executes the StageBackground method
	m.GiraffeA (); //executes the GiraffeA method
	m.ElephantA (); //executes the ElephantA method
	m.GiraffeB (); //executes the GiraffeB method
	m.GiraffeSpeech (); //executes the GiraffeSpeech method
	m.GiraffeC (); //executes the GiraffeC method
	m.GiraffeD (); //executes the GiraffeD method
	m.ElephantB (); //executes the ElephantB method
	m.ElephantC (); //executes the ElephantC method
	m.HippoA (); //executes the HippoA method
	m.BearA (); //executes the BearA method
	m.HippoB (); //executes the HippoB method
	m.HippoC (); //executes the HippoC method
	m.HippoD (); //executes theHippoD method
	m.BearB (); //executes the BearB method
	m.PigA (); //executes the PigA method
	m.BearC (); //executes the BearC method
	m.BearSpeech (); //executes the BearSpeech method
	m.BearD (); //executes the BearD method
	m.BearE (); //executes the BearE method
	m.PigB (); //executes the PigB method
	m.EndBackground (); //executes the EndBackground method
    }
}


