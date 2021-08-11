import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//        5
//        5 41 77 74 22 44
//        1 12
//        4 37 34 36 52
//        0
//        3 20 22 33
//
//        5
//        1 3
//        3 4
//        3 1
//        4 3
//        5 5

        Scanner scan = new Scanner(System.in);
        List<ArrayList<Integer>> listOfIntegers = new ArrayList<>();
        List<ArrayList<Integer>> listOfXandY = new ArrayList<>();


        int n;
        int d;
        int q;
        int x;
        int y;

        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            d = scan.nextInt();
            ArrayList<Integer> internalList = new ArrayList<>();
            internalList.add(d);
            if (d > 0) {
                for (int j = 0; j < d; j++) {
                    int valueOfInternalList = scan.nextInt();
                    internalList.add(valueOfInternalList);
                }
            }
            listOfIntegers.add(internalList);
        }

        q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            ArrayList<Integer> internalList = new ArrayList<>();
            x = scan.nextInt();
            y = scan.nextInt();
            internalList.add(x);
            internalList.add(y);
            listOfXandY.add(internalList);
        }

        System.out.println(listOfIntegers.toString());
        System.out.println(listOfXandY.toString());

        for (int i = 0; i < q; i++) {
            ArrayList<Integer> listOfArray = listOfXandY.get(i);
            x = listOfArray.get(0);
            y = listOfArray.get(1);

            ArrayList<Integer> listOfMainArray = listOfIntegers.get(x-1);
            if (listOfMainArray.size()-1 >= y){
                System.out.println(listOfMainArray.get(y));
            } else {
                System.out.println("Error!");
            }

        }

    }
}
