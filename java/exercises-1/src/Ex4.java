import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        double hours = scanner.nextDouble();
        double salaryPHour = scanner.nextDouble();

        double salary = totalSalary(hours, salaryPHour);

        System.out.println("NUMBER = " + id);
        System.out.println("SALARY = U$ " + String.format("%.2f", salary));

        scanner.close();
    }

    public static double totalSalary(double hours, double salaryPHour){
        return hours * salaryPHour;
    }
}
