import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int temp;
    int in = 0, out = 0;
    int max = 20, min = 10;

    for(int i = 0; i < n; i++){
      temp = sc.nextInt();
      if(temp >=min && temp <= max)
        in++;
      else
        out++;
    }
    System.out.println(in + " in");
    System.out.println(out + " out");
    sc.close();
  }
}
