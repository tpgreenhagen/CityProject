package GraphicsRepo.CityProject;



/**
 * Write a description of class Buildings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 *
 *
 */

import java.awt.*;

public class Buildings
{
    private int height;
    private int width;
    private Color color;
    private int x;
    private int y;
    private static int round = 1;
    private static int build = 0;
    Graphics2D g2;


    public Buildings(int x, int y, Color c, int w, int h){
        this.height = h;
        this.width = w;
        this.color = c;
        this.x = x;
        this.y = y;
    }

    public void set(int x, int y, Color c, int w, int h){
        this.height = h;
        this.width = w;
        this.color = c;
        this.x = x;
        this.y = y;

    }

    public void setRound(int r){

    this.round = r;}

    public void draw(Graphics page){
        g2 = (Graphics2D) page;
   
        if (round == 1){
            Rectangle box = new Rectangle(x,y+height-50,width,600-height);
            g2.setColor(this.color);
            g2.fill(box);
        }


    }

}
