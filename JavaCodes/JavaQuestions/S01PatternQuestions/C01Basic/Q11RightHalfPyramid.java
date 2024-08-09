package S01PatternQuestions.C01Basic;

public class Q11RightHalfPyramid {
    public void printPattern(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q11RightHalfPyramid sol = new Q11RightHalfPyramid();
        sol.printPattern(5);
    }
}