package atmosol.Utils;

public class testClass {

    public static void main(String[] args) {
        int[] arr = {52,36,45,11,77,42,98,87};


        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] >arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;

                }

            }

        }

        for(int a : arr){
            System.out.print(a+" ");

        }


    }
}
