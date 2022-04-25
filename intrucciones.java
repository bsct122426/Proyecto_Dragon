import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intrucciones extends Actor
{
    /**
     * Act - do whatever the intrucciones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        eventoClick();
    } 
    private void eventoClick(){  
     if(Greenfoot.mouseClicked(this)){
         Greenfoot.setWorld(new instrucciones());
        }
    }   
    }        

