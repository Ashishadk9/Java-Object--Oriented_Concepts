
/**
 * Write a description of class attributesCar_Class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class attributesCar_Class
{
    private String make;
    private String model;
    private String year;
    private String color;
    public attributesCar_Class(String make, String model, String year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}
