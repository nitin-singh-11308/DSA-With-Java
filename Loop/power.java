import java.util.Scanner;

public class power {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter b number : ");
        int m = sc.nextInt();
        int pow = 1;
        for (int i = 1; i <= m; i++) {
            pow *= n ;
        } System.out.println("Power "+ n +" of "+m+ " is :"+ pow);
    }
}
