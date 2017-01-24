package GraphicsRepo.CityProject;

import java.awt.*;

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back
{
    
     private int height;
    private int width;
    private Color color;
    private int x;
    private int y;
     Graphics2D g2;
     
     
    public Back(int x, int y, Color c, int w, int h){
        this.height = h;
        this.width = w;
        this.color = c;
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics page){
        g2 = (Graphics2D) page;
      
        
            Rectangle box = new Rectangle(x,y,width,height);
            g2.setColor(this.color);
            g2.fill(box);
        }


    }
    


