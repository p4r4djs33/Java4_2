import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of triangle: ");
        String color = sc.nextLine();
        System.out.println("Enter side 1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter side 3: ");
        double side3 = sc.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println(triangle.toString());
        
    }
}
