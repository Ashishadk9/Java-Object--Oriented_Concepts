
/**
 * Write a description of class MainClass2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass2
{
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Aishish";
        student1.age = 19;
        student1.address = "newroad";
        Students student2 = new Students();
        student2.name = "ram";
        student2.age = 20;
        student2.address = "bagar";
        System.out.println("Student 1 Details:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Address: " + student1.address);
        System.out.println(); 
        System.out.println("Student 2 Details:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Address: " + student2.address);
    }
}
