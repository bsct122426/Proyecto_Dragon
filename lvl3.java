import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl3 extends World
{
    int vidas;
    public lvl3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1117, 465, 1); 
        
        
        prepare();
    }

    
    private void prepare()
    {
        setPaintOrder(boss.class);
        dragon dragon = new dragon();
        addObject(dragon,125,229);

        boss boss = new boss();
        addObject(boss,979,240);

        
        boss.setLocation(899,328);
    }
}
