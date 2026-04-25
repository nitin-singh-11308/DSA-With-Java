public class Even {
    static void main() {
        for (int i = 1; i <= 100; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 100 ; i+=2) {
            System.out.println(i);
        }
    }
}
