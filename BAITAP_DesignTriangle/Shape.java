/**
 * Shape
 */
public class Shape {

    private String color = "green";
    public Shape(){}
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "A shape with color of " + getColor();
    }
}