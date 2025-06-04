import java.util.Scanner;

public class NumerosPares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos numeros voce vai digitar? ");

    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      System.out.print("Digite um numero: ");
      arr[i] = sc.nextInt();
    }

    System.out.println("\nNUMEROS PARES:");
    
    int quant = 0;

    for(int i : arr){
      if(i % 2 == 0){
        System.out.print(i + "  ");
        quant++;
      }
    }
    System.out.print("\n");

    System.out.println("\nQUANTIDADE DE PARES = " + quant);

    sc.close();
  }
}
