import java.util.ArrayList;
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
                if(((ar[i]+ar[j+1])%k) == 0)
                {
                    answer++;
                }

            }

        }
        return answer;
    }
}
