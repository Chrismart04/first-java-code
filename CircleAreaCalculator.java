import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String [] args) {
        Scanner Scanner = new 
        Scanner(System.in);
        System.out.println("ingrese el radio del circulo");
        double radius = Scanner.nextDouble();
        double area = CalculateCircleArea(radius);
        System.out.println("el area del circulo con radio " + radius + " es: " + area);
        Scanner.close();
    }
    public static double
    CalculateCircleArea(double radius){
        return Math.PI *radius *radius;
    }
}