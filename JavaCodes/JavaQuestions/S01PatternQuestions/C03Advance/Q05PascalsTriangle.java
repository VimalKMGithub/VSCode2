package S01PatternQuestions.C03Advance;

public class Q05PascalsTriangle {
    public void printPattern(int height) {
        int[][] triangle = new int[height][height];
        for (int i = 0; i < height; i++) {
            for (int j = 1; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int factorial(int n) {
        int result;
        for (result = 1; n > 1; n--) {
            result *= n;
        }
        return result;
    }

    private int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public void printPattern2ndWay(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(combination(i - 1, j - 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q05PascalsTriangle sol = new Q05PascalsTriangle();
        sol.printPattern(5);
        sol.printPattern2ndWay(5);
    }
}