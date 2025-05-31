import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        scanner.nextInt();
        int amount1 = scanner.nextInt();
        float value1 = scanner.nextFloat();
        
        scanner.nextInt();
        int amount2 = scanner.nextInt();
        float value2 = scanner.nextFloat();

        float total = calculateTotal(amount1, value1) + calculateTotal(amount2, value2);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

        scanner.close();
    }

    public static float calculateTotal(int amount, float value){
        return amount * value;
    }
}
