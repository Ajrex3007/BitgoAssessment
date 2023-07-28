package atmosol.Utils;

import java.util.Scanner;

public class sumFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        int in1 = 20;
//        int  in2 = 25;
        System.out.println("Enter First num to sum of Fibonacci ");
        int in1 = sc.nextInt();

        System.out.println("Enter Second num to sum of Fibonacci ");
        int in2 = sc.nextInt();



        int a = getFibNum(in1);
        int b = getFibNum(in2);

        int out = a+b;

        System.out.println(out);



    }

    private static int getFibNum(int in1) {
        int n1 =0;
        int n2 = 1;
        int n3=0;


        for(int i =0; i<in1; i++){
            n3= n1+n2;
            n1= n2;
            n2 = n3;

        }

        return n3;
    }


}
