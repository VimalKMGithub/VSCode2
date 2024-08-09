package S01PatternQuestions.C01Basic;

public class Q01SolidSquare {
    public void printPattern(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q01SolidSquare sol = new Q01SolidSquare();
        sol.printPattern(5);
    }
}