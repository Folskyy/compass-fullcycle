import java.util.Scanner;

public class DadosPessoas{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();

    float[] alturas = new float[n];
    char[] generos = new char[n];

    for(int i = 0; i < n; i++){
      System.out.print("Altura da " + (i+1) + " pessoa: ");
      alturas[i] = sc.nextFloat();
      sc.nextLine();
      System.out.print("Genero da " + (i+1) + " pessoa: ");
      generos[i] = sc.nextLine().charAt(0);
    }

    float[] infos = catInfos(alturas, generos);

    System.out.println("Menor altura = " + String.format("%.2f", infos[0]));
    System.out.println("Maior altura = " + String.format("%.2f", infos[1]));
    System.out.println("Media das alturas das mulheres = " + String.format("%.2f", infos[2]));
    System.out.println("Numero de homens = " + String.format("%.0f", infos[0]));

    sc.close();
  }

  public static float[] catInfos(float[] alturas, char[] generos){
    float min = alturas[0];
    float max = alturas[0];
    float womAvg = 0;
    int womNum = 0;
    float maNum = 0;

    int n = alturas.length;

    for(int i = 0; i < n; i++){
      if(alturas[i] < min)
        min = alturas[i];
      if(alturas[i] > max)
        max = alturas[i];
      if(Character.toLowerCase(generos[i]) == 'm')
        maNum++;
      if(Character.toLowerCase(generos[i]) == 'f'){
        womAvg += alturas[i];
        womNum++;
      }
    }
    womAvg /= womNum;
    
    return new float[] {min, max, womAvg, maNum};
  }
}
