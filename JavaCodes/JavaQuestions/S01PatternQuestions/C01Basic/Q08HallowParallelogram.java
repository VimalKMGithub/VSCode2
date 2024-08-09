package S01PatternQuestions.C01Basic;

public class Q08HallowParallelogram {
    public void printPattern(int length, int breadth) {
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= breadth - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == breadth || j == 1 || j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void printPattern2ndWay(int length, int breadth) {
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == breadth || j == 1 || j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q08HallowParallelogram sol = new Q08HallowParallelogram();
        sol.printPattern(4, 5);
        sol.printPattern2ndWay(4, 5);
    }
}