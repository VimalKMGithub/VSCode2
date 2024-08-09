package S01PatternQuestions.C01Basic;

public class Q02HallowSquare {
    public void printPattern(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                if (i == 1 || i == side || j == 1 || j == side) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q02HallowSquare sol = new Q02HallowSquare();
        sol.printPattern(5);
    }
}