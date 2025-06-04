import java.util.Scanner;

public class MediaPares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      System.out.print("Digite um numero: ");
      arr[i] = sc.nextInt();
    }

    double avg = evenAvg(arr);

    if(Double.isNaN(avg))
      System.out.println("NENHUM NUMERO PAR"); 
    else
      System.out.println("MEDIA DOS PARES: " + avg); 

    sc.close();
  }

  public static double evenAvg(int[] arr){
    double total = 0;
    int num = 0;

    for(int i : arr){
      if(i%2 == 0){
        total += i;
        num++;
      }
    }

    return (double)total / num;
  }
  
}
