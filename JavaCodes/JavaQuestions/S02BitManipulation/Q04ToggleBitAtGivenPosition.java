package S02BitManipulation;

public class Q04ToggleBitAtGivenPosition {
    public int toggleBit(int num, int pos) {
        return num ^ (1 << pos);
    }

    public static void main(String[] args) {
        Q04ToggleBitAtGivenPosition sol = new Q04ToggleBitAtGivenPosition();
        System.out.println(sol.toggleBit(5, 0));
    }
}