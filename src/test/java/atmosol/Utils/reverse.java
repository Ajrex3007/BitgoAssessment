package atmosol.Utils;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.LinkedHashMap;
import java.util.Map;

public class reverse {

    public static void main(String[] args) {

        String str = "Selenium Java Automation";

//Op = miuneleS avaJ noitamotuA

        String[] words = str.split(" ");

        String out = "";

        for(String word : words){

            for(int i =word.length()-1; i>=0; i--){
                out = out+word.charAt(i);

            }
            out = out+" ";

        }

        System.out.println(out);
        System.out.println();

        Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();

        for(char c : str.toLowerCase().toCharArray()){
            if(c != ' '){
                if(hmap.containsKey(c)){
                    hmap.put(c, hmap.get(c)+1);

                } else {
                    hmap.put(c, 1);

                }

            }

        }

        System.out.println(hmap);




    }
}
