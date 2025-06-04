import java.util.Scanner;
import java.util.ArrayList;

public class Aprovados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos alunos serao digitados? ");
    
    int n = sc.nextInt();
    String[] nomes = new String[n];
    double[][] notas = new double[n][2];

    for(int i = 0; i < n; i++){
      sc.nextLine();
      System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
      
      nomes[i] = sc.nextLine();
      notas[i][0] = sc.nextDouble();
      notas[i][1] = sc.nextDouble();
    }

    System.out.println("Alunos aprovados: ");

    int[] aprovados = aprovados(notas);

    for(int i : aprovados)
      System.out.println(nomes[i]);

    sc.close();
  }

  public static int[] aprovados(double[][] arr){
    ArrayList<Integer> tempAprovados = new ArrayList<>();
    int len = arr.length;
    
    for(int i = 0; i < len; i++){
      if((arr[i][0] + arr[i][1]) / 2 >= 6)
        tempAprovados.add(i);
    }

    int[] aprovados = new int[tempAprovados.size()];
    int aprovadosLen = aprovados.length;
    
    for(int i = 0; i < aprovadosLen; i++)
      aprovados[i] = tempAprovados.get(i);

    return aprovados;
  }
}
