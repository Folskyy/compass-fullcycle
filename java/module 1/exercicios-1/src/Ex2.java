import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double radius = scanner.nextDouble();
        double area = Area(radius);

        System.out.println("A=" + String.format("%.4f", area));
        
        scanner.close();
    }
    public static double Area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}