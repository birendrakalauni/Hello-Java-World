package JavaSwing;

import java.awt.*;
import java.applet.*;
import java.awt.Graphics;

public class MyApplet extends Applet
{
    public void init()
    {
        System.out.println("Applet Initialized...");
    }
    public void start()
    {
        System.out.println("Applet started!");
    }
    public void stop()
    {
        System.out.println("Applet Stopped!");
    }
    public void paint(Graphics g)
    {
        System.out.println("Painting.....");
        // g.drawString("Hello!" ,50,50);
    }
    public void destroy()
    {
        System.out.println("Applet destroyed!!!!");
    }
}
