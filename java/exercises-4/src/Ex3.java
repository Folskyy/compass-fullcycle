import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    double[] values = new double[3];

    for(int i = 0; i < n; i++)
      System.out.println(String.format("%.1f", test(values, sc)));
    
  }

  public static double test(double[] values, Scanner sc){
    double[] weights = {0.2, 0.3, 0.5};
    double total = 0;
    
    for(int i = 0; i < 3; i++){
      values[i] = sc.nextDouble();
      total += values[i]*weights[i];
    }

    return total;
  }
}
