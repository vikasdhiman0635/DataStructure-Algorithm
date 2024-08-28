package HashMap;

import java.util.HashMap;
import java.util.Map;

public class test1 {

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Vikas", 100);
        map.put("Vivek", 1000);
        map.put("Aman", 100000);
        map.put("santu", 1);

       for(Map.Entry entry : map.entrySet()){

            if(entry.getKey() == "santu"){
                map.put("test", 10);
            }

       }


    }

    
}