import java.util.Scanner;

public class SomaVetores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos valores vai ter cada vetor? ");
    int n = sc.nextInt();

    double[] a = new double[n];
    double[] b = new double[n];

    System.out.println("Digite os valores do vetor A: ");
    for(int i = 0; i < n; i++)
      a[i] = sc.nextDouble();

    System.out.println("Digite os valores do vetor B: ");
    for(int i = 0; i < n; i++)
      b[i] = sc.nextDouble();

    double[] arr = somaVetor(a, b);

    System.out.println("VETOR RESULTANTE: ");
    for(double i : arr)
      System.out.println(i);

    sc.close();
  }

  public static double[] somaVetor(double[] a, double[] b){
    int len = a.length > b.length ? a.length : b.length;
    double[] arr = new double[len];

    for(int i = 0; i < len; i++){
      arr[i] = a[i] + b[i];
    }

    return arr;
  }
}
