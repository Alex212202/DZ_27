import java.util.Scanner;
public class First_task {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int n = console.nextInt();
        int sum = 0;
        while(n != 0){
            //Суммирование цифр числа
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum + " ");
    }
}
