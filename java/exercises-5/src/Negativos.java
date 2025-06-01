import java.util.Scanner;
import java.util.ArrayList;

public class Negativos {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
    
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      System.out.print("Digite um numero: ");
      arr[i] = sc.nextInt();
    }
    
    int[] minusArr = negativeFindr(arr);

    System.out.println("NUMEROS NEGATIVOS:");
    for(int i = 0; i < minusArr.length; i++)
      System.out.println(minusArr[i]);

    sc.close();
  }

  public static int[] negativeFindr(int[] arr){
    ArrayList<Integer> temp = new ArrayList<>();
    
    for(int i : arr){
      if(i<0)
        temp.add(i);
    }

    int[] newArr = temp.stream().mapToInt(Integer::intValue).toArray();

    return newArr;
  }


}
