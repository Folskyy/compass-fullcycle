import java.util.Scanner;

public class Ex4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int start = scanner.nextInt();
    int end = scanner.nextInt();
    int totalTime = end - start;

    if(totalTime <= 0){
      totalTime += 24;
    }

    System.out.println("O JOGO DUROU " + totalTime + " HORA(S)");

    scanner.close();
  }
}
