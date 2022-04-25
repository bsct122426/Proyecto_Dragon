import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class portla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class portla extends Actor
{
    int score;
    public portla(){
        setImage("d3 (6).png");
    }
    public void act() 
    {
        // Add your action code here.
        dragon pm = (dragon) getOneObjectAtOffset(0,0,dragon.class);
        
        if(pm !=null && score==0){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new lvl2());
        }
    }    
}
