package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println(sequence(new int[]{}));
        System.out.println("Empty arrays should have a max of 0");


        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println("Example array should have a max of 6");

    }

    public static int sequence(int[] arr) {
        int sum = 0;
        int length = arr.length;
        int k = 0;
        int j = 0;
        int maxSum = 0;
        ArrayList<Integer> sumArr = new ArrayList<>();

//        Petla musi wykonywac sie tak dlugo az j == arr.length
//        Na początku j = 0; k=0; length = 6;
//        po pierwszej iteracji jest:
//        j=0; k=1; length =5; itd.


        if (arr.length == 0) {
            return 0;
        } else {


            while (j<arr.length) {
                length = arr.length;
                k=0;
//                While jest to po aby przejść przez jedna sekcje
                while (k<length) {

//                Przejście jednego rzędu wartości
                    for (int i = k+j; i < length-k; i++) {
                        sum += arr[i];
                        sumArr.add(sum);
                    }
                    sum = 0;

//                Przejście jednego rzędu wartości (od tylu)
                    for (int i = length-1-k; i >= j ; i--) {
                        sum += arr[i];
                        sumArr.add(sum);
                    }
                    sum = 0;

                    k++;
                }

                j++;

            }
//            System.out.println("sumArr size is: " + sumArr.size());
            maxSum = Collections.max(sumArr);


            if (maxSum < 0) {
                return 0;
            }

            return maxSum;
        }




    }
}
