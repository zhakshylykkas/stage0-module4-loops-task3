package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        calculateSum(5);
    }
    public static void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String numToSum = "9";
        for (int i = 0; i < lengthOfLastNumber; i++) {
            sum += Integer.parseInt(numToSum);
            numToSum += 9;
        }
        System.out.println(sum);
    }
}
