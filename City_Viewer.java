package GraphicsRepo.CityProject;


import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.applet.Applet;

/**
 * Class City_Viewer - write a description of the class here
 *
 * @author (your name)
 * @version (a version number)
 */
public class City_Viewer extends Applet //implements MouseListener
{
   private final int APPLET_WIDTH = 1000;
   private final int APPLET_HEIGHT = 700;
   private int x = 10;
   private int y = 0;
   private int w = 120;
   private int h = 300;
   private int run = 1;

   Buildings building1,building2,building3,building4,building5,building6,building7;
   Buildings reset;
   Back ground;

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first
     * time that the start method is called.
     */
    public void init()
    {
         building1 = new Buildings(x,y,Color.blue,w,h+50);
         building2 = new Buildings(x+=(w+20),y,Color.white,w,h+100);
         building3 = new Buildings(x+=(w+20),y,Color.red,w,h);
         building4 = new Buildings(x+=(w+20),y,Color.red,w,h);
         building5 = new Buildings(x+=(w+20),y,Color.blue,w,h+100);
         building6 = new Buildings(x+=(w+20),y,Color.white,w,h+50);
         building7 = new Buildings(x+=(w+20),y,Color.blue,w,h+100);
          reset = new Buildings(0,0,Color.black,1000,0);
          ground = new Back(0,550,Color.green,1000,150);

        setBackground (Color.black);
        setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }


//     public void mouseClicked(MouseEvent e){}
//      public void mouseEntered(MouseEvent e){}
//       public void mouseExited(MouseEvent e){}
//        public void mousePressed(MouseEvent e){}
//         public void mouseReleased(MouseEvent e){}
    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * should start its execution. It is called after the init method and
     * each time the JApplet is revisited in a Web page.
     */
    public void start()
    {
        // provide any code requred to run each time
        // web page is visited
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed.
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed
    }

    /**
     * Paint method for applet.
     *
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics page)
    {
      
  
      
       
            ground.draw(page);
            building1.setRound(1);
            building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);

   
        

        
  
            
          try{Thread.sleep(1000);}
            catch(InterruptedException e){};
        
        
    

        
            x = 10;
            y=0;
            w= 130;

         building1.set(x,y,Color.blue,w,h+50);
         building2.set(x+=(w+70),y,Color.white,w,h+100);
         building3.set(x+=(w+70),y,Color.red,w,h);
         building4.set(x+=(w+70),y,Color.red,w,h);
         building5.set(x+=(w+70),y,Color.blue,w,h+50);
         building6.set(x+=(w+20),y,Color.white,0,700);
         building7.set(x+=(w+20),y,Color.blue,0,700);
   
         try{Thread.sleep(1000);}
            catch(InterruptedException e){};
            
            reset.draw(page);
             building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);
        

         
       
  

        
            try{Thread.sleep(1000);}
            catch(InterruptedException e){};
                x = 10;
                y=0;
                w= 120;
    
    
             building1.set(x,y,Color.blue,w,h+100);
             building2.set(x+=(w+20),y,Color.white,w,h+100);
             building3.set(x+=(w+20),y,Color.red,w,h+100);
             building4.set(x+=(w+200),y,Color.red,w,h+50);
             building5.set(x+=(w+20),y,Color.blue,w,h+50);
             building6.set(x+=(w+20),y,Color.white,w,h+100);
             building7.set(x+=(w+20),y,Color.blue,0,700);

  
              try{Thread.sleep(1000);}
            catch(InterruptedException e){};
            
            reset.draw(page);
             building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);

      
            
            try{Thread.sleep(1000);}
                catch(InterruptedException e){};
            x = 10;
            y=0;
            w= 150;
            h-=50;

         building1.set(x,y,Color.red,w,h);
         building2.set(x+=(w+20),y,Color.white,w,h);
         building3.set(x+=(w+20),y,Color.red,w,h);
         building4.set(x+=(w+20),y,Color.white,w,h);
         building5.set(x+=(w+20),y,Color.blue,0,700);
         building6.set(x+=(w+20),y,Color.blue,0,700);
         building7.set(x+=(w+20),y,Color.blue,0,700);
         
            try{Thread.sleep(1000);}
            catch(InterruptedException e){};
            
            reset.draw(page);
             building1.draw(page);
            building2.draw(page);
            building3.draw(page);
            building4.draw(page);
            building5.draw(page);
            building6.draw(page);
            building7.draw(page);
         

    
}
    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy.
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }


    /**
     * Returns information about this applet.
     * An applet should override this method to return a String containing
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


    /**
     * Returns parameter information about this JApplet.
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings
     * describing these parameters.
     * Each element of the array should be a set of three Strings containing
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
