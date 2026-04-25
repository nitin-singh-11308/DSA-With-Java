import java.util.Scanner;

public class basic {
    static void main() {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter How many time you want to print your name");
        int a = sc.nextInt();
        for (int i = 1; i <=a; i++) {
            System.out.println(name);

        }
    }
}
