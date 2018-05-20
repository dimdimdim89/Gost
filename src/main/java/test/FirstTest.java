package test;

class FirstTest {
    void process(int n) {
        if (n < 1 || n > 100) throw new RuntimeException("Bad n");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 7 == 0) {
                System.out.println("TwoSeven");
            } else if (i % 2 == 0) {
                System.out.println("Two");
            } else if (i % 7 == 0) {
                System.out.println("Seven");
            } else {
                System.out.println(i);
            }
        }
    }
}
