package atmosol.Utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReverse {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\acc.txt"));
        String Sentence="";

        try{
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while(line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();



            }

            Sentence = sb.toString();




        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
        }

        String[] words = Sentence.split("[\n\r\\s]+");
        String out = "";
        for(String word : words){
            for(int i=word.length()-1; i>=0; i--){
                out = out+word.charAt(i);

            }
            out=out+" ";
        }

        System.out.println(out);

        Path textFile = Path.of(System.getProperty("user.dir")+"\\src\\test\\resources\\acc.txt");
        Files.writeString(textFile, out);




    }
}
