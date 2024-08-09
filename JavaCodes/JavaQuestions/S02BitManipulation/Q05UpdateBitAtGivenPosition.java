package S02BitManipulation;

public class Q05UpdateBitAtGivenPosition {
    public int updateBit(int num, int pos, int bit) {
        int mask = ~(1 << pos);
        return (num & mask) | (bit << pos);
    }

    public static void main(String[] args) {
        Q05UpdateBitAtGivenPosition sol = new Q05UpdateBitAtGivenPosition();
        System.out.println(sol.updateBit(5, 1, 1));
    }
}