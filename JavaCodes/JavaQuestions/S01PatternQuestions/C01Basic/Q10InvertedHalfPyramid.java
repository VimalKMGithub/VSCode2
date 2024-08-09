package S01PatternQuestions.C01Basic;

public class Q10InvertedHalfPyramid {
    public void printPattern(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern2ndWay(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q10InvertedHalfPyramid sol = new Q10InvertedHalfPyramid();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
    }
}