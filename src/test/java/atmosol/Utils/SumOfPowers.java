package atmosol.Utils;

public class SumOfPowers {

    public static void main(String[] args) {

        long out = 0;

        long end = 1000;

        for(long i = 1; i<=end; i++){
            long tempPow = getPowerValue(i,i);
            out = (long) (out+tempPow);

        }

        String outStr = String.valueOf(out);

        int len = outStr.length();



        System.out.println(len);
        System.out.println(outStr);


    }

    private static long getPowerValue(long i1, long i2) {
        long returnLong = 1;

        while(i2 !=0){
            returnLong *= i1;
            i2--;
        }

        return returnLong;
    }


}
