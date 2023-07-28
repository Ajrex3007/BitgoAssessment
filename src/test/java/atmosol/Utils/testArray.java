package atmosol.Utils;

public class testArray {

    public static void main(String[] args) {

        int[] arr  = {1,4,6,5,9};

        for(int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }

        System.out.println("Second Largest num in array is "+ arr[arr.length-4]);

    }
}
