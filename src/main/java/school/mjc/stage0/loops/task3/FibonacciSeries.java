package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(9);
    }
    public static void printFibonacci(int lastFibonacci) {
        int prevNumToSum = 1;
        int sum = 0;
        int prevSum = 0;
        System.out.println(prevSum);
        for (int i = 0; i < lastFibonacci; i++) {
            sum = prevSum + prevNumToSum;
            prevNumToSum = prevSum;
            prevSum = sum;
            System.out.println(sum);
        }
    }
}
