package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        printGCD(0, 30);
    }
    public static void printGCD(int first, int second) {
        int greatestCmnDvsrSoFar = 0;
        if (first == 0 || second == 0) {
            System.out.println(Math.max(first, second));
        } else {
            for (int i = 1; first < second ? i <= first : i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestCmnDvsrSoFar = i;
                }
            }
            System.out.println(greatestCmnDvsrSoFar);
        }
    }
}
