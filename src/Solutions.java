import java.util.LinkedHashSet;
import java.util.List;

public class Solutions {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int counter = 0;

        for (Integer integer : candles) {
            if (integer > max) {
                max = integer;
            }
        }

        for (Integer candle : candles) {
            if (candle == max) {
                counter++;
            }
        }

        return counter;
    }

    static String timeConversion(String s) {
        String answer = "";
        int firstTwo = Integer.parseInt(s.substring(0, 2));

        if(s.contains("AM"))
        {
            if(firstTwo == 12)
            {
                answer="00";
                answer = answer+s.substring(2,8);
            }
            else
            {
                answer = s.substring(0,8);
            }

        }
        else if(s.contains("PM"))
        {
            if(firstTwo == 12)
            {
                answer = s.substring(0,8);
            }
            else
            {
                firstTwo+=12;
                answer=answer+String.valueOf(firstTwo)+s.substring(2,8);
            }

        }

        return answer;
    }

    static int sockMerchant(int n, int[] ar) {
        int totalPairs = 0;

        LinkedHashSet<Integer> noMatch = new LinkedHashSet<>();
        for (int j : ar) {
            if (!noMatch.add(j)) {
                noMatch.remove(j);
                totalPairs++;
            }
        }

        return totalPairs;
    }

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j < n - i) {

                    System.out.print(" ");
                } else {

                    System.out.print("#");

                }

            }
            System.out.println();
        }

    }

    static int secondMinimum(int[] ar) {

        int min;
        int secondMin;
        int len = ar.length;

        min = secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {

            if (ar[i] < min) {
                secondMin = min;
                min = ar[i];
            } else if (ar[i] < secondMin && ar[i] != min) {
                secondMin = ar[i];
            }
        }

        return secondMin;
    }

    static int[] reverseArray(int[] a) {

        int len = a.length;
        int ctr = 0;

        int reverse[] = new int[len];

        while (len != 0) {
            reverse[ctr] = a[len - 1];
            ctr++;
            len--;
        }

        return reverse;
    }

    static long repeatedString(String s, long n) {

        long occurence = 0;
        String infinite = "";
        char check;

        for (int i = 0; i < n + 1; i++) {
            infinite = infinite + s;
        }

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') {
                occurence++;
            }
        }

        return occurence;

    }

    static void plusMinus(int[] arr) {

        double positive;
        double negative;
        double zero;

        positive = negative = zero = 0;

        double len = arr.length;

        for (int i = 0; i < len; i++) {

            if (arr[i] >= 1) {
                positive++;
            } else if (arr[i] <= -1) {
                negative++;
            } else if (arr[i] == 0) {
                zero++;
            }
        }

        System.out.println(positive / len);
        System.out.println(negative / len);
        System.out.println(zero / len);
    }

    static void miniMaxSum(int[] arr) {

        long max;
        long min;

        min = max = 0;

        long highestV = Integer.MAX_VALUE;
        long lowestV = Integer.MIN_VALUE;
        int len = arr.length;

        for (int i = 0; i < len; i++) {

            if (arr[i] > lowestV) {
                lowestV = arr[i];
            }

            if (arr[i] < highestV) {
                highestV = arr[i];
            }

            max += arr[i];
            min += arr[i];

        }

        max -= lowestV;
        min -= highestV;

        System.out.print(max + " " + min);
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        int aLen = apples.length;
        int oLen = oranges.length;

        for(int i = 0; i < aLen;i++)
        {
            if(apples[i]+a >= s && apples[i]+a <= t)
            {
                appleCount++;
            }
        }

        for(int j = 0; j < oLen;j++)
        {
            if(oranges[j]+b >= s && oranges[j]+b <= t)
            {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer = "";

        if(x2>x1 && v2>v1)
        {
            answer = "NO";
        }
        else
        {
            while(x2>x1)
            {
                x2=x2+v2;
                x1=x1+v1;
                if (x1==x2)
                {
                    answer = "YES";
                }

                if(x1>x2)
                {
                    answer = "NO";
                }
            }
        }

        return answer;
    }

    static long aVeryBigSum(long[] ar) {
        long max = 0;

        for (int i = 0; i < ar.length; i++) {
            max += ar[i];

        }

        return max;
    }














}
