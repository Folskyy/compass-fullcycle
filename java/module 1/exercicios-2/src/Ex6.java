import java.util.Scanner;

public class Ex6{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    float n = scanner.nextFloat();

    if(n < 0 || n > 100){
      System.out.println("Fora de intervalo");
    }
    else if(n <= 25){
      System.out.println("INTERVALO: [0, 25]");
    }
    else if(n <= 50){
      System.out.println("INTERVALO: [25, 50]");
    }
    else if(n <= 75){
      System.out.println("INTERVALO: [50, 75]");
    }
    else if(n <= 100){
      System.out.println("INTERVALO: [75, 100]");
    }
    scanner.close();
  }
}
