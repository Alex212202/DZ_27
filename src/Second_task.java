import java.util.Scanner;
public class Second_task {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int n = console.nextInt();
        int suma = 1;
        for (int i = 1; i <= n; i++) {
            suma *= i;
        }
        System.out.println("Факториал: " + suma);
    }
}
