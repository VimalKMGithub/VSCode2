package S02BitManipulation;

public class Q01GetBitAtGivenPosition {
    public int getBit(int num, int pos) {
        return (num & (1 << pos)) != 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Q01GetBitAtGivenPosition sol = new Q01GetBitAtGivenPosition();
        System.out.println(sol.getBit(5, 1));
    }
}