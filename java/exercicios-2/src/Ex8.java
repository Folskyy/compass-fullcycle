import java.util.Scanner;

public class Ex8{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double bill = scanner.nextDouble();
    double tax = 0;
    double rest = bill;

    if(rest > 4500){
      tax += (rest - 4500) * 0.28;
      rest = 4500;
    }
    if(rest <= 4500 && rest > 3000){
      tax += (rest - 3000) * 0.18;
      rest = 3000;
    }
    if(rest <= 3000 && rest > 2000){
      tax += (rest - 2000) * 0.08;
      rest = 2000;
    }

    if(tax == 0){
      System.out.println("Isento");
    }
    else{
      System.out.println("R$ " + String.format("%.2f", tax));
    }

    scanner.close();
  }
}
