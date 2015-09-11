import hsa.*;
public class PizzaCost {


    public static void main(String[] args) {
        double size, topp, total, baseprice= 2.25;
        Console c=new Console();
        c.print("Enter the Diametor of the pizza in inches: ");
        size=c.readDouble();
        
        c.print("\nEnter the ammount of toppings for the pizza: ");
        topp=c.readDouble();
        
        
        total= (topp*.75) + baseprice + (size*.5);
        c.print("The total of your pizza is $" + total);
    }
    
}
