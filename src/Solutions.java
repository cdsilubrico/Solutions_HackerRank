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








}
