package S02BitManipulation;

public class Q03ClearBitAtGivenPosition {
    public int clearBit(int num, int pos) {
        return num & ~(1 << pos);
    }

    public static void main(String[] args) {
        Q03ClearBitAtGivenPosition sol = new Q03ClearBitAtGivenPosition();
        System.out.println(sol.clearBit(5, 0));
    }
}