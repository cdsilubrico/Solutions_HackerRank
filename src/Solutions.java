import java.math.BigInteger;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

        if (s.contains("AM")) {
            if (firstTwo == 12) {
                answer = "00";
                answer = answer + s.substring(2, 8);
            } else {
                answer = s.substring(0, 8);
            }

        } else if (s.contains("PM")) {
            if (firstTwo == 12) {
                answer = s.substring(0, 8);
            } else {
                firstTwo += 12;
                answer = answer + String.valueOf(firstTwo) + s.substring(2, 8);
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

        for (int i = 0; i < aLen; i++) {
            if (apples[i] + a >= s && apples[i] + a <= t) {
                appleCount++;
            }
        }

        for (int j = 0; j < oLen; j++) {
            if (oranges[j] + b >= s && oranges[j] + b <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        String answer = "";

        if (x2 > x1 && v2 > v1) {
            answer = "NO";
        } else {
            while (x2 > x1) {
                x2 = x2 + v2;
                x1 = x1 + v1;
                if (x1 == x2) {
                    answer = "YES";
                }

                if (x1 > x2) {
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

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        ArrayList<Integer> ans = new ArrayList<>();
        int a1 = 0;
        int b1 = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                a1++;
            } else if (a.get(i) < b.get(i)) {
                b1++;
            } else {
                break;
            }
        }

        ans.add(a1);
        ans.add(b1);

        return ans;
    }

    public static int countingValleys(int steps, String path) {

        int nValleys = 0;
        int seaLvl = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                seaLvl++;
            } else if (path.charAt(i) == 'D') {
                seaLvl--;
                if (seaLvl == -1) {
                    nValleys++;
                }
            }
        }

        return nValleys;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int difference;
        int leftDiagSum = 0;
        int rightDiagSum = 0;
        int len = arr.size();

        for (int i = 0; i < len; i++) {
            leftDiagSum += arr.get(i).get(i);
            rightDiagSum += arr.get(i).get(len - 1 - i);

        }
        difference = Math.abs(leftDiagSum - rightDiagSum);

        return difference;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int checker;
        final int multiple = 5;

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) % multiple != 0) {
                checker = grades.get(i) % multiple;

                if (multiple - checker < 3 && grades.get(i) > 37) {
                    grades.set(i, grades.get(i) + (multiple - checker));
                }
            }
        }

        return grades;
    }

    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int len = arr.length;
        int currSum = 0;

        for (int i = 0; i <= len - 3; i++) {
            for (int j = 0; j <= len - 3; j++) {
                currSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }
        }

        return maxSum;
    }

    static int jumpingOnClouds(int[] c) {

        int min = 0;
        int cumulus = 0;
        int cLen = c.length;

        while (cumulus < cLen - 1) {
            if ((cumulus + 2 < cLen) && c[cumulus + 2] == 0) {
                cumulus += 2;
            } else {
                cumulus++;
            }

            min++;
        }

        return min;
    }

    static int[] mergeTwoSortedArray(int[] ar, int[] ar1) {
        //int merged[] = new int {ar.length+ar1.length};
        int len = ar.length + ar1.length;
        int array[] = new int[len];

        int min = 0;
        int current = 0;

        int ar1Ctr = 0;
        int ar2Ctr = 0;

        while ((ar1Ctr + ar2Ctr) != len) {
            if (ar1Ctr < ar1.length) {

                array[ar1Ctr] = ar[ar1Ctr];

                ar1Ctr++;
            } else {
                array[ar1Ctr + ar2Ctr] = ar1[ar2Ctr];

                ar2Ctr++;

            }

        }

//        for(int i = 0; i < len; i++)
//        {
//            if(i < ar.length)
//            {
//                array[i] = ar[i];
//                System.out.println(array[i]);
//            }else
//            {
//                array[i] = ar[ar1.length-i];
//                System.out.println(array[i]);
//            }
//
//
//        }
        return array;
    }

    static int[] breakingRecords(int[] scores) {
        int[] answer = new int[2];
        int highest, lowest;
        highest = lowest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
                ++answer[0];
            } else if (scores[i] < lowest) {
                lowest = scores[i];
                ++answer[1];
            }

        }

        return answer;
    }

    static int birthday(List<Integer> s, int d, int m) {
        int answer, sum;
        answer = sum = 0;
        for (int i = 0; i < s.size(); i++) {
            if (i + m > s.size()) break;

            for (int j = i; j < (i + m); j++) {
                sum += s.get(j);
            }

            if (sum == d) answer++;

            sum = 0;
        }


        return answer;
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int answer;
        answer = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (((ar[i] + ar[j + 1]) % k) == 0) {
                    answer++;
                }

            }

        }
        return answer;
    }

    static int migratoryBirds(List<Integer> arr) {
        int ary[] = new int[arr.size()];
        int highest, answer;
        highest = answer = 0;

        for (int i = 0; i < arr.size(); i++) {
            ary[arr.get(i)]++;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (ary[i] > highest) {
                highest = ary[i];
                answer = i;
            }
        }
        return answer;
    }

    static String dayOfProgrammer(int year) {
        int eightMonthsTotal = 243;
        final int day = 256;
        int ans = day - eightMonthsTotal;

        String answer;
        answer = "Bon Appetit";

        if (year == 1918)
            answer = "26.09.1918";
        else
            answer = (((year < 1918) && ((year % 4) == 0)) || (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) ? (String.valueOf(ans - 1) + ".09." + year) : (String.valueOf(ans) + ".09." + year);

        return answer;
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum;
        sum = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i != k) sum += bill.get(i);
        }

        if (b <= (sum / 2)) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - (sum / 2));
        }
    }

    static int pageCount(int n, int p) {

        int startCountFront = n / 2;
        int targetFromFront = p / 2;
        int targetFromBack = startCountFront - targetFromFront;

        return Math.min(targetFromFront, targetFromBack);
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int answer, sum;
        answer = sum = 0;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                sum = keyboards[i] + drives[j];
                if (sum >= answer && sum <= b) {
                    answer = sum;
                }
            }
        }

        if (answer == 0) {
            return -1;
        }

        return answer;
    }

    static String catAndMouse(int x, int y, int z) {
        int xDist, yDist;
        String answer;

        xDist = Math.abs(z - x);
        yDist = Math.abs(z - y);

        if (xDist < yDist) {
            answer = "Cat A";
        } else if (xDist == yDist) {
            answer = "Mouse C";
        } else {
            answer = "Cat B";
        }

        return answer;
    }

    //**
    static int formingMagicSquare(int[][] s) {
        int answer, sumVertical, sumHorizontal, sumDiagonalLeft, sumDiagonalRight;
        boolean[] result = new boolean[s.length];
        sumDiagonalLeft = s[0][0] + s[1][1] + s[2][2];
        sumDiagonalRight = s[0][2] + s[1][1] + s[2][0];
        answer = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                sumVertical = s[i][j] + s[i + 1][j] + s[i + 2][j];
                sumHorizontal = s[i][j] + s[i][j + 1] + s[i][j + 2];

                if (sumVertical == 15) {
                    result[i] = true;
                } else result[i] = false;

                if (sumHorizontal == 15) {
                    result[i] = true;
                } else result[i] = false;
            }
        }

        return answer;
    }

    //**
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int start = 0;
        int i = 0;
        int max = Integer.MAX_VALUE;

        while (i < a.size()) {
            if (Math.abs(a.get(start) - a.get(i)) > 1) {
                start = i;
            }

            max = Math.max(max, i - start + 1);
            i++;


        }
        i--;

        return Math.max(max, i - start + 1);
    }

    public static int hurdleRace(int k, List<Integer> height) {
        int max = height.get(0);
        int doseNeeded;

        for (int i = 0; i < height.size(); i++) {
            if (height.get(i) > max) {
                max = height.get(i);
            }
        }

        if (k > max) {
            return 0;
        }

        doseNeeded = Math.abs(max - k);
        return doseNeeded;
    }

    //Too Slow
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        List<Integer> playerRank = new ArrayList<>();

        for (int i = 0; i < player.size(); i++) {
            ranked.add(player.get(i));//Add Element
            Collections.sort(ranked);
            Collections.reverse(ranked);
            ranked = ranked.stream().distinct().collect(Collectors.toList());//Remove Duplicate
            playerRank.add(ranked.indexOf(player.get(i)) + 1);
        }

        return playerRank;

    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        int ascii;
        int max = h.get(0);

        word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            ascii = word.charAt(i) - 97;//ascii
            System.out.println(ascii);
            if (h.get(ascii) > max) {
                max = h.get(ascii);
            }

        }

        return max * word.length();
    }

    public static int utopianTree(int n) {
        int height;
        height = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {

                height += 1;
            } else
                height = height * 2;
        }

        return height;
    }

    public static String angryProfessor(int k, List<Integer> a) {
        int len = a.size();
        int total;
        total = 0;


        for (int i = 0; i < len; i++) {
            if (a.get(i) <= 0)
                total++;

            if (total >= k)
                return "NO";
        }


        return "YES";
    }

    public static int beautifulDays(int i, int j, int k) {
        int days, len, difference, reversed, temp, digit;
        days = reversed = 0;
        len = Math.abs(i - j) + 1;

        for (int a = 0; a < len; a++) {
            temp = i;
            while (temp != 0) {
                digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            difference = Math.abs(i - reversed);
            if ((difference % k) == 0) {
                days++;
            }
            reversed = 0;
            temp = i;
            i++;

        }
        return days;
    }

    public static int viralAdvertising(int n) {
        int days,interested,person;
        days  = 0;
        person = 5;

        while(n>0)
        {
            interested = person / 2;
            person = interested * 3;
            days = days + interested;
            n--;
        }



        return days;

    }

    public static int saveThePrisoner(int n, int m, int s) {
        int unlucky;

        unlucky = ((s+m)-1)%n;

        if(unlucky==0) unlucky = n;

        return unlucky;
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> circular = new ArrayList<>();

        k = k % a.size();
        for (int i = 0; i < queries.size(); i++) {
            circular.add(a.get((queries.get(i) - k + a.size()) % a.size()));
        }

        return circular;
    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> permu = new ArrayList<>();

        for(int i = 1; i <= p.size();i++)
        {
            permu.add(p.get(p.get(i)));
        }

        return permu;
    }

    static int jumpingOnClouds(int[] c, int k) {
        int en = 100;
        int index = k%c.length;

        en-=c[index] * 2+1;
        while(index!=0)
        {
            index = (index+k)%c.length;
            en-= c[index] * 2 +1;
        }

        return en;
    }

    public static int findDigits(int n) {
        int divisor;
        divisor = 0;

        String inStr = String.valueOf(n);

        for(int i =0 ; i<inStr.length();i++)
        {
            int temp = Integer.parseInt(String.valueOf(inStr.charAt(i)));

            if(temp == 0)
            {
            }
            else
            {
                if(n%temp==0)
                {
                    divisor++;
                }
            }
        }



        return divisor;
    }

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger factorial = BigInteger.ONE;

        for(int i = 0; i < n; i++)
        {
            factorial=factorial.multiply(BigInteger.valueOf(n-i));
        }

        System.out.println(factorial);
    }

}
