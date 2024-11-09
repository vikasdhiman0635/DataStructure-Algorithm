class Q1768 {
    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";

        int fLength = word1.length() > word2.length() ? word2.length() : word1.length();
        System.out.println(fLength);
        String str = "";
        for (int i = 0; i < fLength; i++) {
            str = str + word1.charAt(i);
            str = str + word2.charAt(i);
        }
        ;
        System.out.println(str);
    }
}