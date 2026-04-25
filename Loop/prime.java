import java.util.Scanner;

public class prime {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime : ");
        int n = sc.nextInt();

        boolean flag = true; // true means prime
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                flag = false; // false mean composite
                break;
            }
        }
        if (n==1) System.out.println("Whole square number");
        if (flag == true) System.out.println("prime number");
        else if (flag == false) System.out.println("composite number");
    }
}
