import java.util.Scanner;

public class Ex7{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    float x = scanner.nextFloat();
    float y = scanner.nextFloat();

    if(x > 0){
      if(y > 0){
        System.out.println("Q1");
      }
      else if(y < 0){
        System.out.println("Q4");
      }
      else{
        System.out.println("Eixo Y");
      }
    }
    else if(x < 0){
      if(y > 0){
        System.out.println("Q2");
      }
      else if(y < 0){
        System.out.println("Q3");
      }
      else{
        System.out.println("Eixo Y");
      }
    }
    else{
      if(y==0){
        System.out.println("Origem");
      }
      else{
        System.out.println("Eixo X");
      }
    }
    scanner.close();
  }
}
