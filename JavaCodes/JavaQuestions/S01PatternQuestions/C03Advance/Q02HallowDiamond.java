package S01PatternQuestions.C03Advance;

public class Q02HallowDiamond {
    public void printPattern(int halfHeight) {
        for (int i = 1; i <= halfHeight; i++) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = halfHeight; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
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
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = halfHeight - 1; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void printPattern3rdWay(int halfHeight) {
        for (int i = 1; i <= halfHeight; i++) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = halfHeight; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern4thWay(int halfHeight) {
        for (int i = 1; i <= halfHeight; i++) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = halfHeight - 1; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q02HallowDiamond sol = new Q02HallowDiamond();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
        sol.printPattern3rdWay(5);
        sol.printPattern4thWay(5);
    }
}