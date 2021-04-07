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


}
