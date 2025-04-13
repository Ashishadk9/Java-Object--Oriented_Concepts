
/**
 * Write a description of class MainClass1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass1
{
    public static void main(String[] args) {
           Rectangle r = new Rectangle();
        r.length = 5.0;
        r.breadth = 3.0;
        double area =r.length*r.breadth;
        System.out.println("Rectangle Attributes:");
        System.out.println("Length: " + r.length);
        System.out.println("Breadth: " + r.breadth);
         System.out.println("area:"+ area);
    }
}
