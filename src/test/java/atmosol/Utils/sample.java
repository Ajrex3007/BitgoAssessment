package atmosol.Utils;

public class sample {

    public static void main(String[] args) {
        String str = "ezhilarasansakthivel22@gmail.com";
        int count = 0;

        char[] string =str.toCharArray();



        for(int i =0; i<str.length(); i++){
            count = 1;
            for(int j = i+1; j<str.length(); j++ ){
                if(string[i] == string[j] && string[i] !=' '){
                    count++;
                    string[j] = '!';

                }


            }

            if(count >1 && string[i] !='!'){
                System.out.println(string[i]+" "+count);

            }

        }







    }



}
