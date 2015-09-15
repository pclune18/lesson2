import TurtleGraphics.*;
public class BonusCircle {

    
    public static void main(String[] args) {
        SketchPadWindow s= new SketchPadWindow(400,400);
        StandardPen p= new StandardPen(s);
        int x;
        x=+1;
        for(int i = 1; i<=100; i++){
            p.up();
            p.move(x);
            p.down();
            p.move(3);
            p.turn(3.6);
        }
    }
    
}
