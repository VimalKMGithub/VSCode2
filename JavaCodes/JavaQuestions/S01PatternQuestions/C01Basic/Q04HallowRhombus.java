package S01PatternQuestions.C01Basic;

public class Q04HallowRhombus {
    public void printPattern(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side - i; j++) {
                System.out.print("  ");
            }
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

    public void printPattern2ndWay(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
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
        Q04HallowRhombus sol = new Q04HallowRhombus();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
    }
}