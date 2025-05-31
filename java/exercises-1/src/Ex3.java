import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diff = difference(a, b, c, d);

        System.out.println("DIFERENCA = " + diff);
        scanner.close();
    }

    public static int difference(int a, int b, int c, int d){
        return a*b - c*d;
    }
    
}
