import java.util.Scanner;

public class MaisVelho {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas voce vai digitar? ");
    int n = sc.nextInt();
    
    String[] nomes = new String[n];
    int[] idades = new int[n];

    for(int i = 0; i < n; i++){
      sc.nextLine();
      System.out.println("Dados da " + (i+1) + "a pessoa: ");

      System.out.print("Nome: ");
      nomes[i] = sc.nextLine();

      System.out.print("Idade: ");
      idades[i] = sc.nextInt();
    }

    int max = max(idades);

    System.out.println("PESSOA MAIS VELHA: " + nomes[max]);

    sc.close();
  }
  public static int max(int[] arr){
    int index = 0;
    int len = arr.length;
    
    for(int i = 1; i < len; i++){
      if(arr[i] > arr[index])
        index = i;
    }

    return index;
  }

}
