import java.lang.System;

public class Q392 {
	public static void main(String[] args){
		boolean res= isSubsequence("axc","ahbgdc");
		System.out.println(res);
	}
	
	public static boolean isSubsequence(String s, String t) {
		if(s.equals("")){
			return true;
		}
        else if(t.equals("")){
            return false;
        }
        int j=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) != s.charAt(j)){
                continue;
            }
            else if(t.charAt(i) == s.charAt(j)){
                j++;
                if(j==s.length())
                    break;
            }
        }
//        if(j == s.length()){
            return true;
//        }
//        return false;
    }
}