package S01PatternQuestions.C01Basic;

public class Q14InvertedPyramid {
    public void printPattern(int height) {
        for (int i = height; i >= 1; i--) {
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
        Q14InvertedPyramid sol = new Q14InvertedPyramid();
        sol.printPattern(5);
    }
}