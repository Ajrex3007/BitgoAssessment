package atmosol.Utils;

public class PermutationOfString {
    public static void main(String[] args) {

        String str = "abc";

        printCombination(str, "");

    }

    private static void printCombination(String str, String comb) {

        if(str.length() == 0){
            System.out.println(comb+" ");
            return;
        }


        for(int i = 0 ;i<str.length(); i++){
            char c = str.charAt(i);

            String out = str.substring(0,i)+str.substring(i+1);
            //recursive call
            printCombination(out, comb+c);

        }

    }

}
