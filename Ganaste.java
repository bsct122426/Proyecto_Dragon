import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ganaste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganaste extends World
{

    /**
     * Constructor for objects of class Ganaste.
     * 
     */
    public Ganaste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1023, 683, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        regresar regresar = new regresar();
        addObject(regresar,945,611);
        win win = new win();
        addObject(win,150,503);
        win.setLocation(177,552);
    }
}
