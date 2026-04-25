import java.util.Scanner;

public class digitSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0) {
            sum += n%10;
            n = n/10;
        }
        System.out.println((sum>0) ? sum : -sum);

    }
}
