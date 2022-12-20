import java.util.Scanner;
public class Fourth_task {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите зарплату сотрудника");
        int n = console.nextInt();
        System.out.println("Введите количество лет работы сотрудника");
        int year = console.nextInt();
        if (year >= 1 && year < 3)
        {
            int pr = n / 10;
            int sum = pr + n;
            System.out.println(sum);
            if (sum < 4000)
            {
                sum += 1000;
                System.out.println(sum);
            }
            if (sum >= 4000)
            {
                sum += 500;
                System.out.println(sum);
            }
        }
        if (year >= 3)
        {
            int proc = (n * 20)/ 100;
            int sum2 = proc + n;
            System.out.println(sum2);
            if (sum2 < 4000)
            {
                sum2 += 1000;
                System.out.println(sum2);
            }
            if (sum2 >= 4000)
            {
                sum2 += 500;
                System.out.println(sum2);
            }
        }
    }
}
