import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double value;

    for(int i = 0; i < n; i++){
      value = division(sc);
      if(Double.isNaN(value))
        System.out.println("divisao impossivel");
      else
        System.out.println(value);
    }
    sc.close();
  }
  public static double division(Scanner sc){
    double nominator = sc.nextDouble();
    double denominator = sc.nextDouble();

    if(denominator == 0)
      return Double.NaN;

    return nominator / denominator; 
  }
}
