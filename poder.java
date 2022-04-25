import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder extends Actor
{
    int shootingSpeed;
    int score;
    int vidas=0;
    
    int cont;
    //int pod;
    public poder(){
     this.cont=0;  
     this.vidas=8;
    }
    public void act() {
      //  dead();
        
        setLocation(getX()+shootingSpeed, getY());
        Actor enemy = getOneObjectAtOffset(0,0, dragonenemigo.class);
        Actor enemy2 = getOneObjectAtOffset(0,0, enemigo2.class);
        Actor enemy3=getOneObjectAtOffset(0,0,boss.class);
        if (enemy != null || enemy2 !=null ) 
        {
            getWorld().removeObject(enemy);
            score++;
            getWorld().removeObject(enemy2);
            score++;
        }
        
        if (enemy != null ||enemy2 != null || getX() <= 1 || getX() >= getWorld().getWidth() -1)
        {
                getWorld().removeObject(this);
        }
        

        if(enemy3!=null){
            
           lvl3 mundo=(lvl3)getWorld();
           getWorld().removeObject(enemy3);             
           score++;
            getWorld().addObject(new boss(),979,240);  
            score++;
            getWorld().removeObject(enemy3); 
           //getWorld().addObject(new boss(),979,240);  
           //cont++;
           vidas--;
        
           if(vidas==3){
               //getWorld().removeObject(this);
              
               getWorld().removeObject(enemy3); 
               Greenfoot.setWorld(new Ganaste());
            }
      }
      

        //setLocation(getX(),getY());
        
    } 
    /*public void dead(){
            if(isTouching(boss.class )){
            getWorld().removeObject(this);
                cont++;
               // getWorld().removeObject(this);
                if(cont==5){    
                Greenfoot.setWorld(new Ganaste());
            }
            }   
        }*/
}
