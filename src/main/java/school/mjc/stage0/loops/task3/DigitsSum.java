package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {
        printDigitsSum(-499);
    }
    public static void printDigitsSum(int t){
        String intToStr = String.valueOf(t);
        int digitsSum = 0;
        int startPoint = 0;
        if (intToStr.startsWith("-")) {
            startPoint = 1;
        }
        for (int i = startPoint; i < intToStr.length(); i++) {
            digitsSum += Integer.parseInt(String.valueOf(intToStr.charAt(i)));
        }
        System.out.println(digitsSum);
    }
}
