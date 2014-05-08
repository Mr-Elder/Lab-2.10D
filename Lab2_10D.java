/**
 * @(#)Lab2_10D.java
 *
 *
 * @author 
 * @version 1.00 2013/12/3
 */
 
 //SWAG
 //height diameter height ways
 //width diameter width ways
 //start angle: the direction its going
 //arc angle: how many degrees of a circle
import java.awt.*;
import java.applet.Applet;
import java.util.*;

public class Lab2_10D extends Applet{
    
    final int MIDX = 300;
    final int MIDY = 200;
    
    public void paint(Graphics page){
    	//page.setColor(Color.tan);
    	
    	page.setColor(new Color(196, 154, 104));
    	page.fillOval(MIDX - 190, MIDY - 150, 300, 300);
    	
    	//Eyes
    	    	
    	page.setColor(Color.white);
    	page.fillOval(MIDX - 90, MIDY - 107, 50, 20);
    	page.fillOval(MIDX + 10, MIDY - 107, 50, 20);
    	
    	page.setColor(new Color(149,109,25));
    	page.fillOval(MIDX - 75, MIDY - 102, 25, 10);
    	page.fillOval(MIDX + 25, MIDY - 102, 25, 10);
    	
    	page.setColor(Color.black);
    	page.fillOval(MIDX - 63, MIDY - 100, 10, 6);
    	page.fillOval(MIDX + 37, MIDY - 100, 10, 6);
    	
    	//Ear
    	page.setColor(new Color(196,151,102));
    	page.fillArc(MIDX - 200, MIDY - 90, 40, 100, 0, 360);
    	
    	page.setColor(new Color(175,125,62));
    	page.fillArc(MIDX - 190, MIDY - 80, 30, 80, 80, 180);
    	
    	//Smile
    	page.setColor(Color.black);
    	page.fillArc(MIDX - 50, MIDY + 10, 100, 50, 180, 180);
    	
    	page.setColor(new Color(250,128,114));
    	page.fillArc(MIDX - 40, MIDY + 40, 100, 10, 0, 360);
    	
    	page.setColor(Color.black);
    	page.drawLine(MIDX + 10, MIDY + 45, MIDX + 60, MIDY + 45);
    	
    	//nose
    	page.setColor(new Color(175,125,62));
    	page.fillArc(MIDX - 25, MIDY-80, 50, 80, 270, 180);
    
    	
    }
    
    public Color rainbowColor(){
    	Random rand = new Random();
    	return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
    
}