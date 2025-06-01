import java.util.Scanner;
import java.util.ArrayList;

public class Ex6 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    ArrayList<Integer> divisors =  divisorsFindr(n);

    for(int i : divisors)
      System.out.println(i);

    sc.close();
  }
  public static ArrayList<Integer> divisorsFindr(int n){
    if(n==0)
      return new ArrayList<>();
    
    boolean isNegative = (n>0) ? false : true;

    ArrayList<Integer> divisors = new ArrayList<>();
    divisors.add(isNegative ? -1 : 1);

    n = Math.abs(n);
    int j = (int)n/2 + 1;
    
    for(int i = 2; i < j; i++){
      if(n%i == 0)
        divisors.add(isNegative ? -i : i);
    }
    divisors.add(n);
    return divisors;
  }
}
