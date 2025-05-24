import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double triangle = triangleArea(a, c);
        double circle = circleArea(c);
        double trapezoid = trapezoidArea(a, b, c);
        double square = squareArea(b);
        double rectangle = rectangleArea(a, b);

        System.out.println("TRIANGULO: " + String.format("%.3f", triangle));
        System.out.println("CIRCULO: " + String.format("%.3f", circle));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapezoid));
        System.out.println("QUADRADO: " + String.format("%.3f", square));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangle));
        
        scanner.close();
    }
    public static double triangleArea(double a, double c){
        return (a*c)/2;
    }
    public static double circleArea(double c){
        return Math.PI * Math.pow(c, 2);
    }
    public static double trapezoidArea(double a, double b, double c){
        return ((a+b) / 2) * c;
    }
    public static double squareArea(double b){
        return Math.pow(b, 2);
    }
    public static double rectangleArea(double a, double b){
        return a * b;
    }
}
