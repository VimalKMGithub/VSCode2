package S03RecursionQuestions.C01Basic;

public class Q03NthFibonacci {
    public int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Q03NthFibonacci sol = new Q03NthFibonacci();
        System.out.println(sol.fib(3));
    }
}