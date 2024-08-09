package S03RecursionQuestions.C02Intermediate;

public class Q02ReverseString {
    public String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Q02ReverseString sol = new Q02ReverseString();
        System.out.println(sol.reverseString("str"));
    }
}