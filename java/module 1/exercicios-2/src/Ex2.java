import java.util.Scanner;

public class Ex2{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    if(a%2 == 0){
      System.out.println("PAR");
    }
    else{
      System.out.println("IMPAR");
    }

    scanner.close();
  }
}