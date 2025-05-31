import java.util.Scanner;

public class Ex5{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int id = scanner.nextInt();
    int amount = scanner.nextInt();
    double total = 0;

    switch(id){
      case 1:
        total = amount * 4;
        break;
      case 2:
        total = amount * 4.5;
        break;
      case 3:
        total = amount * 5;
        break;
      case 4:
        total = amount * 2;
        break;
      case 5:
        total = amount * 1.5;
        break;
      default:
        System.out.println("CODIGO INVALIDO");
        break;
    }
    System.out.println("Total: R$ " + String.format("%.2f", total));

    scanner.close();
  }
}
