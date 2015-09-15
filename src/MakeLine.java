import TurtleGraphics.*;
import hsa.*;

public class MakeLine {

    
    public static void main(String[] args) {
       SketchPadWindow s= new SketchPadWindow(400,400);
       Console c= new Console();
       StandardPen p= new StandardPen(s);
       int x1,y1,x2,y2;
       c.print("Enter an x value for the first point:");
       x1=c.readInt();
       c.print("Enter an y value for the first point:");
       y1=c.readInt();
       c.print("Enter an x value for the second point:");
       x2=c.readInt();
       c.print("Enter an y value for the second point:");
       y2=c.readInt();
       
       p.up();
       
       p.move(x1-200,y1-200);
       p.down();
       
       p.drawString("(" + x1 + ", " + y1 + ")");
       p.move(x2-200,y2-200);
       p.drawString("(" + x2 + ", " + y2 + ")");
    }
    
}
