package S01PatternQuestions.C01Basic;

public class Q06HallowRectangle {
    public void printPattern(int length, int breadth) {
        for (int i = 1; i <= breadth; i++) {
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
        Q06HallowRectangle sol = new Q06HallowRectangle();
        sol.printPattern(4, 5);
    }
}