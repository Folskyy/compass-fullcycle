import java.util.Scanner;

public class SomaVetor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    
    double[] arr = new double[n];

    for(int i = 0; i < n; i++){
      System.out.print("Digite um nunero: ");
      arr[i] = sc.nextDouble();
    }
    double total = arrSum(arr);
    double med = total / arr.length;

    System.out.print("VALORES = ");
    for(double i : arr)
      System.out.print(i + " ");
    
    System.out.println("\nSOMA = " + total);
    System.out.println("MEDIA = " + med);

    sc.close();
  }

  public static double arrSum(double[] arr){
    double soma = 0;

    for(double i : arr)
      soma += i;

    return soma;
  }
}
