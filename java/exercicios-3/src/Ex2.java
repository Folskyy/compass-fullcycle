import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x, y;
    String res;

    while(true){
      x = scanner.nextInt();
      y = scanner.nextInt();

      res = checkCoord(x, y);

      if("".equals(res))
        break;

      System.out.println(res);
    }

    scanner.close();
  }
  public static String checkCoord(int x, int y){
    if(x==0 || y==0){
      return "";
    }
    if(x>0){
      if(y>0){
        return "primeiro";
      }
      else{
        return "quarto";
      }
    }
    else{
      if(y>0){
        return "segundo";
      }
      else{
        return "terceiro";
      }
    }
  }
}
