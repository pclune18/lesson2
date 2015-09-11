import hsa.*;
public class Momentum {


    public static void main(String[] args) {
        Console c= new Console();
        double mass, vel, momentum;
               
        c.print("Enter the mass of the object: ");
        mass=c.readDouble();
        c.print("\nEnter the velocity of the object: ");
        vel=c.readDouble();
        //calc answer
        momentum=mass*vel;
        c.print("\n The Momentum is " + momentum);
    }
    
}
