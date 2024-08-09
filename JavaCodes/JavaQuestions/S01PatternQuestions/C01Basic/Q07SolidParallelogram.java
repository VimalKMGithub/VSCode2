package S01PatternQuestions.C01Basic;

public class Q07SolidParallelogram {
    public void printPattern(int length, int breadth) {
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= breadth - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= length; j++) {
                System.out.print("* ");
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
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q07SolidParallelogram sol = new Q07SolidParallelogram();
        sol.printPattern(4, 5);
        sol.printPattern2ndWay(4, 5);
    }
}