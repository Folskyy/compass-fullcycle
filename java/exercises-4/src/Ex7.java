import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      showInfos(i+1);
    }

    sc.close();
  }
  public static void showInfos(int n){
    System.out.println(n + " " + n*n + " " + n*n*n);
  }
}
