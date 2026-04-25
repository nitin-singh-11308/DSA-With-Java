public class ReturnType {
    public static int abc() {
        System.out.println("Mother");
        System.out.println("India");
        return 0;
    }

    public static int prasun(int a) {
        System.out.println("banu");
        if (a>0) return 5;
        else return 10;
    }

    static void main(String[] args) {
        abc();
        System.out.println(abc());
        System.out.println(5+abc());

        int x = prasun(7);
        System.out.println(3+x);
    }
}
