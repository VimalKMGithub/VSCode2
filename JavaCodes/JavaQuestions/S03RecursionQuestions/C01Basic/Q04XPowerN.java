package S03RecursionQuestions.C01Basic;

public class Q04XPowerN {
    public int power(int x, int n) {
        if (n == 0)
            return 1;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Q04XPowerN sol = new Q04XPowerN();
        System.out.println(sol.power(2, 3));
    }
}