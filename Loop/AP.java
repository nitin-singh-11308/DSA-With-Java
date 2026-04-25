import java.util.Scanner;

public class AP {
    static void main(String[] args) {
        System.out.println("Enter n");
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= 3*n-1; i+=3) {
            System.out.println(i);
        }

//        Second method
        int a = 2, d = 3;
        for (int i = 1; i<=n; i++) {
            System.out.println(a);
            a+=d;
        }
    }
}
