package Easy;

public class Q344ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            int l = s.length - i - 1;
            char t = s[i];
            s[i] = s[l];
            s[l] = t;
        }
    }
}