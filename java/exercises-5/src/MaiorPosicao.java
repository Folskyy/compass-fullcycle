import java.util.Scanner;

public class MaiorPosicao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");

    int n = sc.nextInt();
    double[] arr = new double[n];

    for(int i = 0; i < n; i++){
      System.out.print("Digite um numero: ");
      arr[i] = sc.nextDouble();
    }

    int max = max(arr);

    System.out.println("\nMAIOR VALOR = " + arr[max]);
    System.out.println("POSICAO DO MAIOR VALOR = " + max);

    sc.close();
  }

  public static int max(double[] arr){
    int max = 0;
    int length = arr.length;

    for(int i = 1; i < length; i++){
      if(arr[i] > arr[max])
        max = i;
    }

    return max;
  }
}
