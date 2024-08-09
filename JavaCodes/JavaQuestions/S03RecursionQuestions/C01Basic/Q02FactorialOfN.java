package S03RecursionQuestions.C01Basic;

public class Q02FactorialOfN {
    public int factorialOfN(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialOfN(n - 1);
    }

    public static void main(String[] args) {
        Q02FactorialOfN sol = new Q02FactorialOfN();
        System.out.println(sol.factorialOfN(5));
    }
}