import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] ar = {5, 20, 25, 400, 1000};
        int[] ar2 = {5,9,10,7,4};
        int[] ar3 = {2, 4, 6, 0, -2, -4, 14};
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        //System.out.println(secondMinimum(ar));
        //System.out.println(Arrays.toString(mergeTwoSortedArray(ar2,ar3)));
        //plusMinus(ar3);
        //staircase(6);
        //miniMaxSum(ar2);
        //System.out.println(Solutions.birthdayCakeCandles(l1));
        //System.out.println(Solutions.timeConversion("12:45:54PM"));
        //System.out.println(Solutions.divisibleSumPairs(5,2,ar2));
        System.out.println(Solutions.migratoryBirds(l1));



    }



}
