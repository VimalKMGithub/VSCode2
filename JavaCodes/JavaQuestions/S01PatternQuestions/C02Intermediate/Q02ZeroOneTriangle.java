package S01PatternQuestions.C02Intermediate;

public class Q02ZeroOneTriangle {
    public void printPattern(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public void printPattern2ndWay(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (((i + j) & 1) == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q02ZeroOneTriangle sol = new Q02ZeroOneTriangle();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
    }
}