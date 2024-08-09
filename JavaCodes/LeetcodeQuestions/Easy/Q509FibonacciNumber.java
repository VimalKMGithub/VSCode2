package Easy;

public class Q509FibonacciNumber {
    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int t = b;
            b = a + b;
            a = t;
        }
        return b;
    }
}