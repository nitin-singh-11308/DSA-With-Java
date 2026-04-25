package part2;

class A {
    void demo() {
        int a = 5;
        System.out.println(a);
        {
            int b = 10;
            System.out.println(b);
        }
    }
}
public class ScopeOfVariable {
    static void main() {
        A a = new A();
        a.demo();
    }
}
