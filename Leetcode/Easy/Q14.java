import java.lang.System;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q14 {
	public static void main(String[] args){
		String[] str= new String[3];
		str[0] = "flower";
		str[1] = "flow";
		str[2]= "flight";
		
		String s = longestCommonPrefix(str);
		System.out.println(s);
	}
	
	public static String longestCommonPrefix(String[] strs) {
    	
    	System.out.println(Arrays.toString(strs));
    	HashMap<String, String[]> map = new HashMap();
		for(int i=0;i<strs.length;i++){
			map.put(strs[i], strs[i].split(""));
		}
		
		System.out.println(map);
		for(Map<Entity, Value> m: map){
			
		}
	 	return "s";
    }
}