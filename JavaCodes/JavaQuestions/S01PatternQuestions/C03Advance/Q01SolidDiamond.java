package S01PatternQuestions.C03Advance;

public class Q01SolidDiamond {
    public void printPattern(int halfHeight) {
        for (int i = 1; i <= halfHeight; i++) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = halfHeight; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern2ndWay(int halfHeight) {
        for (int i = 1; i <= halfHeight; i++) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = halfHeight - 1; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q01SolidDiamond sol = new Q01SolidDiamond();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
    }
}