import hsa.*;
import TurtleGraphics.*;
public class Bargraph {

    
    public static void main(String[] args) {
        Console c = new Console();
        
        SketchPadWindow s= new SketchPadWindow(400,400);
        StandardPen p= new StandardPen(s);
        int num1, num2, num3, num4;
        p.setWidth(15);
        c.print("Enter 1st number between 1-200: ");
        num1=c.readInt();
        c.print("Enter 2nd number between 1-200: ");
        num2=c.readInt();
        c.print("Enter 3rd number between 1-200: ");
        num3=c.readInt();
        c.print("Enter 4th number between 1-200: ");
        num4=c.readInt();
        
        p.up();
        p.move(50-200,num1-100);
        p.down();
        p.drawString("--" + num1);
        p.move(-150,-100);
        
        p.up();
        p.move(150-200,num2-100);
        p.down();
        p.drawString("--" + num2);
        p.move(-50,-100);
        
        p.up();
        p.move(250-200,num3-100);
        p.down();
        p.drawString("--" + num3);
        p.move(50,-100);
        
        p.up();
        p.move(350-200,num4-100);
        p.down();
        p.drawString("--" + num4);
        p.move(150,-100);
        
        p.setWidth(5);
        p.up();
        p.move(-200,-105);
        p.down();
        p.move(200,-105);
                
    }
    
}
