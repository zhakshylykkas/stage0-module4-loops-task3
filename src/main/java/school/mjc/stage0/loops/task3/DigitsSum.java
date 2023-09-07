package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {
        printDigitsSum(-499);
    }
    public static void printDigitsSum(int t){
        int digitsSum = 0;
        int startPoint = 0;
        if (t < 0) {
            startPoint = 1;
        }
        String intToStr = String.valueOf(t);
        for (int i = startPoint; i < intToStr.length(); i++) {
            digitsSum += Integer.parseInt(String.valueOf(intToStr.charAt(i)));
        }
        System.out.println(digitsSum);
    }
}
