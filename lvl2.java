import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends World
{

    /**
     * Constructor for objects of class lvl2.
     * 
     */
    public lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        dragon dragon = new dragon();
        addObject(dragon,176,187);
        enemigo2 enemigo2 = new enemigo2();
        addObject(enemigo2,535,352);
        dragonenemigo dragonenemigo = new dragonenemigo();
        addObject(dragonenemigo,470,359);
        portla portla = new portla();
        addObject(portla,578,56);
        portla.setLocation(548,87);
        removeObject(portla);
        portla2 portla2 = new portla2();
        addObject(portla2,568,41);
        enemigo2 enemigo22 = new enemigo2();
        addObject(enemigo22,558,303);
        enemigo22.setLocation(428,41);
        dragonenemigo.setLocation(79,323);
    }
}
