package S01PatternQuestions.C01Basic;

public class Q12InvertedRightHalfPyramid {
    public void printPattern(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern2ndWay(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= height; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q12InvertedRightHalfPyramid sol = new Q12InvertedRightHalfPyramid();
        sol.printPattern(5);
    }
}
