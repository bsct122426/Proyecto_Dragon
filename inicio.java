import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inicio extends World
{

    /**
     * Constructor for objects of class inicio.
     * 
     */
    public inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        play play = new play();
        addObject(play,260,335);
        play.setLocation(505,469);
        play.setLocation(497,452);
        intrucciones intrucciones = new intrucciones();
        addObject(intrucciones,740,55);
    }
}
