package atmosol.Utils;

public class accolite {
    public static void main(String[] args) {
        String str = "Acc@123Li*Te";

        String CapOut = "";
        String numOut = "";
        String splOut= "";
        String smalOut= "";

        for(char c : str.toCharArray()){
            if(c >='0' && c <='9'){
                numOut = numOut+c;

            } else if (c >='a' && c <='z'){
                smalOut = smalOut+c;

            } else if (c >='A' && c <='Z'){
                CapOut = CapOut+c;

            } else {
                splOut = splOut+c;

            }

        }

        System.out.println(CapOut);
        System.out.println(splOut);
        System.out.println(numOut);
        System.out.println(smalOut);
    }
}
