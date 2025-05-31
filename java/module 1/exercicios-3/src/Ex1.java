import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int key = 2002;
    int userIn = scanner.nextInt();

    while(userIn != key){
      System.out.println("Senha Invalida");
      userIn = scanner.nextInt();
    }
    System.out.println("Acesso Permitido");
    scanner.close();
  }
}
