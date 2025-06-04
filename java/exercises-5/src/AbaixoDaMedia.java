import java.util.Scanner;
import java.util.ArrayList;

public class AbaixoDaMedia {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    double[] arr = new double[n];

    for(int i = 0; i < n; i++){
      System.out.print("Digite um numero: ");
      arr[i] = sc.nextDouble();
    }

    double avg = avg(arr);
    double[] lowers = lowers(arr);

    System.out.println("\nMEDIA DO VETOR = " + avg);
    System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
    
    for(double i : lowers)
      System.out.println(i);
    
    sc.close();
  }
  public static double avg(double[] arr){
    double total = 0;
    
    for(double i : arr)
      total += i;

    return total / arr.length;
  }

  public static double[] lowers(double[] arr){
    double avg = avg(arr);
    ArrayList<Double> tempLowers = new ArrayList<>();

    for(double i : arr){
      if(i < avg)
        tempLowers.add(i);
    }

    double[] lowers = new double[tempLowers.size()];
    
    for(int i = 0; i < tempLowers.size(); i++)
      lowers[i] = tempLowers.get(i);
    
    return lowers;
  }
}