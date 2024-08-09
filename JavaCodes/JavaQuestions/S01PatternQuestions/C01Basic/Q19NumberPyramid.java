package S01PatternQuestions.C01Basic;

public class Q19NumberPyramid {
    public void printPattern(int height) {
        for (int i = 1; i <= height; i++) {
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
        Q19NumberPyramid sol = new Q19NumberPyramid();
        sol.printPattern(5);
    }
}