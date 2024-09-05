package Leetcode.Easy;

public class Q58 {
	public static void main(String[] arg){
		int res= lengthOfLastWord("Hello World");
	}
	
	public static int lengthOfLastWord(String s) {
        
        String[] arr= s.split(" ");
        String lastarr= arr[arr.length-1];
        
        return lastarr.length();
    }
}
