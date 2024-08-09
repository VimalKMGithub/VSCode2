package S01PatternQuestions.C01Basic;

public class Q05SolidRectangle {
    public void printPattern(int length, int breadth) {
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q05SolidRectangle sol = new Q05SolidRectangle();
        sol.printPattern(4, 5);
    }
}