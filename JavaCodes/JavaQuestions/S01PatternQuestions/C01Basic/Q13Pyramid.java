package S01PatternQuestions.C01Basic;

public class Q13Pyramid {
    public void printPattern(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q13Pyramid sol = new Q13Pyramid();
        sol.printPattern(5);
    }
}