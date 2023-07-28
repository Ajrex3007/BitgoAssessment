package atmosol.Utils;

public class averageDigit {

    public static void main(String[] args) {
//        "20342398"  - to find the nearest digit which is equal to the average of all digits in the string.

        String str = "950008203";

        int[] arr = new int[str.length()];

        int index = 0;
        int sum = 0;

        for(char c : str.toCharArray()){
            int temp = Character.getNumericValue(c);
            arr[index++] = temp;
            sum = sum + temp;

        }

//        for(int a : arr){
//            System.out.println(a);
//
//        }


        float avg;
        avg = (float) sum/(float) arr.length;


        System.out.println("sum "+sum);
        System.out.println("Avg "+ avg );

        double diff = Math.abs(arr[1] - avg);

        int closestOut = arr[1];

        for(int i=0; i<arr.length; i++){
            double tempDiff = Math.abs(arr[i] - avg);
            if(diff > tempDiff){
                diff = tempDiff;
                closestOut = arr[i];

            }

        }

        System.out.println(closestOut);









    }
}
