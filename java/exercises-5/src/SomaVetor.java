import java.util.Scanner;

public class SomaVetor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      System.out.print("Digite um nunero: ");
      arr[i] = sc.nextInt();
    }
    int total = arrSum(arr);
    int med = total / arr.length;

    System.out.print("VALORES = ");
    for(int i : arr)
      System.out.print(i + " ");
    
    System.out.println("\nSOMA = " + total);
    System.out.println("MEDIA = " + med);

    sc.close();
  }

  public static int arrSum(int[] arr){
    int soma = 0;

    for(int i : arr)
      soma += i;

    return soma;
  }
}
