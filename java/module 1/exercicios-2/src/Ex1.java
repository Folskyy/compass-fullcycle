import java.util.Scanner;

public class Ex1{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    if(a < 0){
      System.out.println("NEGATIVO");
    }
    else{
      System.out.println("NÃO NEGATIVO");
    }

    scanner.close();
  }
}