package atmosol.Utils;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedString = sb.toString();
        System.out.println(reversedString);
    }
}
