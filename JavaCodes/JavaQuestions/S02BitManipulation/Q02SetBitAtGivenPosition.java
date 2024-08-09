package S02BitManipulation;

public class Q02SetBitAtGivenPosition {
    public int setBit(int num, int pos) {
        return num | (1 << pos);
    }

    public static void main(String[] args) {
        Q02SetBitAtGivenPosition sol = new Q02SetBitAtGivenPosition();
        System.out.println(sol.setBit(5, 1));
    }
}