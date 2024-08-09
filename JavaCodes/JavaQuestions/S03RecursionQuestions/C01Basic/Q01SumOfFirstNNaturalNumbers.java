package S03RecursionQuestions.C01Basic;

public class Q01SumOfFirstNNaturalNumbers {
    public int sumOfFirstNNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfFirstNNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        Q01SumOfFirstNNaturalNumbers sol = new Q01SumOfFirstNNaturalNumbers();
        System.out.println(sol.sumOfFirstNNaturalNumbers(2));
    }
}