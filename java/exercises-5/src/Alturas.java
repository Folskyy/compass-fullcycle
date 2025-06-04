import java.util.Scanner;
import java.util.ArrayList;

public class Alturas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    ArrayList<Person> persons = new ArrayList<Person>();

    for(int i = 0; i < n; i++){
      Person person = new Person();
      sc.nextLine();
      System.out.println("Dados da " + (i+1) + " pessoa: ");
      person.readPerson(sc);
      persons.add(person);
    }

    personsInfo(persons);

    sc.close();
  }
  public static float medHeight(ArrayList<Person> persons){
    float total = 0;
    
    for(Person person : persons)
      total += person.getAltura();

    return (float)total / persons.size();
  }
  public static void personsInfo(ArrayList<Person> persons){
    float ageAvg = 0;
    float heightAvg = 0;
    ArrayList<String> names = new ArrayList<>();
    
    for(Person person : persons){
      if(person.getIdade() < 16){
        names.add(person.getNome());
        ageAvg += 1;
      }
      heightAvg += person.getAltura();
    }

    ageAvg = (ageAvg / persons.size()) * 100;
    heightAvg /= persons.size();
    System.out.println("Altura média: " + String.format("%.2f", heightAvg));
    System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", ageAvg) + "%");

    for(String name : names){
      System.out.println(name);
    }
  }
}

class Person{
  private String nome;
  private int idade;
  private float altura;

  public Person(){
    this.nome = "";
    this.idade = 0;
    this.altura = 0;
  }
  public Person(String nome, int idade, float altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public float getAltura() {
    return altura;
  }
  public int getIdade() {
    return idade;
  }
  public String getNome() {
    return nome;
  }
  public void setAltura(float altura) {
    this.altura = altura;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void readPerson(Scanner sc){
    System.out.print("Nome: ");
    this.nome = sc.nextLine();

    System.out.print("Idade: ");
    this.idade = sc.nextInt();

    System.out.print("Altura: ");
    this.altura = sc.nextFloat();
  }
}
