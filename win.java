import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win extends Actor
{
    GifImage myGif = new GifImage("giphy (1).gif");
    /**
     * Act - do whatever the win wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(myGif.getCurrentImage());
        // Add your action code here.
    }    
}
