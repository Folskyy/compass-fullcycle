import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;;

public class Ex3 {
  public static void main(String[] args){
    int menu;
    Scanner scanner = new Scanner(System.in);
    
    HashMap<String, Integer> gas = new LinkedHashMap<String, Integer>();
    gas.put("Alcool", 0);
    gas.put("Gasolina", 0);
    gas.put("Diesel", 0);

    while(true){
      menu = scanner.nextInt();

      switch(menu){
        case 1:
          changeValue(gas, "Alcool", 1);  
          break;
        case 2:
          changeValue(gas, "Gasolina", 1);
          break;
        case 3:
          changeValue(gas, "Diesel", 1);
          break;
        case 4:
          printValues(gas);
          scanner.close();
          return;
      }
    }
  }
  public static void changeValue(HashMap<String, Integer> map, String key, int value){
    map.put(key, map.get(key) + value);
  }
  public static void printValues(HashMap<String, Integer> map){
    System.out.println("MUITO OBRIGADO");
    for(String i : map.keySet()){
      System.out.println(i + ": " + map.get(i));
    }
  }
}