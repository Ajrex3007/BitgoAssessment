package atmosol.Utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        String str = "manirathnam nandhakumar";

        Map<Character,Integer> hmap = new LinkedHashMap<Character, Integer>();

        for(char c : str.toCharArray()){
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c)+1);

            } else {
                hmap.put(c, 1);

            }


        }

        System.out.println(hmap);

    }


}