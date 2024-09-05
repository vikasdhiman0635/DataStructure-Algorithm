package Leetcode.Easy;

public class Q125 {

    public static void main(String[] args) {

        String s = "a.";
        boolean b = isPalindrome(s);
        System.out.println(b);
    }

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (((int) str.charAt(i) > 47 && (int) str.charAt(i) < 58)
                    || ((int) str.charAt(i) > 96 && (int) str.charAt(i) < 123)) {
                res = res + str.charAt(i);
            }
        }
        for (int i = 0, j = res.length() - 1; i < res.length() / 2; i++, j--) {
            if (res.charAt(i) != res.charAt(j)) {
                return false;
            }
        }

        return true;
    }

}
