package S01PatternQuestions.C01Basic;

public class Q03SolidRhombus {
    public void printPattern(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern2ndWay(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q03SolidRhombus sol = new Q03SolidRhombus();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
    }
}