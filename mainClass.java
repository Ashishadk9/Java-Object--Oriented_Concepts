
/**
 * Write a description of class mainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainClass
{ 
     private String color;
    public mainClass(String color){
       this.color=color; 
    }
    
    public void drive(){
        System.out.println(color);
    }
    
    public static void main(String[] args){
        mainClass c = new mainClass("RED");
        c.drive();
    }
}
