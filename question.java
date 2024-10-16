import java.util.*;


class question {

	public static void main(String[] args){
        System.out.println();
		
		String input ="Welcome to the javascript guide!";
		
        String reverse = Arrays.stream(input.split("")).reduce("", (a,b) ->  b + a);
	
        System.out.println(reverse);

	}
	
}