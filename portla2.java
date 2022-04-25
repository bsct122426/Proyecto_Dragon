import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class portla2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class portla2 extends Actor
{
    int score;
    public portla2(){
        setImage("d3 (6).png");
    }
    public void act() 
    {
        // Add your action code here.
        dragon pm = (dragon) getOneObjectAtOffset(0,0,dragon.class);
        
        if(pm !=null && score==0){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new lvl3());
        }
    }    
}
