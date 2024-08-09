package S03RecursionQuestions.C02Intermediate;

public class Q01TowerOfHanoi {
    public void towerOfHanoi(int n, char fromRod, char auxRod, char toRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n - 1, fromRod, toRod, auxRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n - 1, auxRod, fromRod, toRod);
    }

    public static void main(String[] args) {
        Q01TowerOfHanoi sol = new Q01TowerOfHanoi();
        sol.towerOfHanoi(3, 'A', 'B', 'C');
    }
}