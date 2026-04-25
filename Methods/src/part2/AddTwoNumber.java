package part2;

import java.util.Scanner;

class Algebra  {
    int a, b;
    Algebra(int x, int y) {
        System.out.println("Constructor is called");
        a = x;
        b = y;
    }

    int add () {
        return a + b;
    }
    int subtract () {
        return a - b;
    }
    int multiply () {
        return a * b;
    }
    int divide () {
        return a / b;
    }
}
public class AddTwoNumber {
    static void main() {
        Scanner sc = new  Scanner (System.in);

        Algebra obj = new Algebra(24, 13);
        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());

        Algebra obj2 = new Algebra(12, 8);
        System.out.println(obj2.add());
        System.out.println(obj2.subtract());
        System.out.println(obj2.multiply());
        System.out.println(obj2.divide());

    }
}
