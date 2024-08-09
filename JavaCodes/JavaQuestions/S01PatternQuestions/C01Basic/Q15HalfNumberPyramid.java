package S01PatternQuestions.C01Basic;

public class Q15HalfNumberPyramid {
    public void printPattern(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void printPattern2ndWay(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void printPattern3rdWay(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q15HalfNumberPyramid sol = new Q15HalfNumberPyramid();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
        sol.printPattern3rdWay(5);
    }
}