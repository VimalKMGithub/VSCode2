package S01PatternQuestions.C01Basic;

public class Q20InvertedNumberPyramid {
    public void printPattern(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q20InvertedNumberPyramid sol = new Q20InvertedNumberPyramid();
        sol.printPattern(5);
    }
}