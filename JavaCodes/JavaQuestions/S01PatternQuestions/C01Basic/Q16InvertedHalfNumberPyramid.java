package S01PatternQuestions.C01Basic;

public class Q16InvertedHalfNumberPyramid {
    public void printPattern(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void printPattern2ndWay(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q16InvertedHalfNumberPyramid sol = new Q16InvertedHalfNumberPyramid();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
    }
}