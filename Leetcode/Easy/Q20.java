import java.util.Arrays;
class Q20 {
	public static void main(String[] args){
		int a=0, b=0, c=0;
		String s ="([)]";
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("[") || arr[i].equals("]")){
                a= arr[i].equals("[")? a+1: a-1;
            }
            else if(arr[i].equals("(") || arr[i].equals(")")){
                b= arr[i].equals("(")? b+1: b-1;
            }
            else if(arr[i].equals("{") || arr[i].equals("}")){
                c= arr[i].equals("{")?c+1: c-1;
            }
        }
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        if(a == 0 && b==0 && c==0){
//            return true;
			System.out.println(true);
        }
        else{
        	System.out.println(false);
        }
	}
}