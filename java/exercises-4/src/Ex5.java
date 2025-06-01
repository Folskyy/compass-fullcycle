import java.util.Scanner;

public class Ex5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(recursiveFactorial(n));

    sc.close();
  }
  public static int recursiveFactorial(int n){
    if(n <= 1)
      return 1;

    return n * recursiveFactorial(n-1);
  }
  public static int iterativeFactorial(int n){
    if(n<=1)
      return 1;
    
      int total = 1;

    for(int i = n; i > 0; i--)
      total *= i;
    
      return total;
  }
}