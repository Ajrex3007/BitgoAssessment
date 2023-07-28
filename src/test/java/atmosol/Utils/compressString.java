package atmosol.Utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class compressString {


    public static void main(String[] args) {



//        String str = "aaaabbbccd";
        String str = "i love india";



//        o/p : a4b3c2d1

        Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();

        for(char c : str.toCharArray()){
            if(hmap.containsKey(c)){
                hmap.put(c,hmap.get(c)+1);

            } else {
                hmap.put(c,1);

            }

        }

        for(Map.Entry entry : hmap.entrySet()){
            if((char)entry.getKey() == 'i'){
                System.out.print(entry.getKey()+" "+entry.getValue());

            }


        }




    }

}
