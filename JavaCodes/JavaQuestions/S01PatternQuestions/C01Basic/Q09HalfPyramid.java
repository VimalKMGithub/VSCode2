package S01PatternQuestions.C01Basic;

public class Q09HalfPyramid {
    public void printPattern(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q09HalfPyramid sol = new Q09HalfPyramid();
        sol.printPattern(5);
    }
}