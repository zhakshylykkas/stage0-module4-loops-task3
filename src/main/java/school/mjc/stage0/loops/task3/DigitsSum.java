package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {
        printDigitsSum(-1239);
    }
    public static void printDigitsSum(int t){
        String intToStr = String.valueOf(t);
        int digitsSum = 0;
        int startPoint = 0;
        if (intToStr.startsWith("-")) {
            digitsSum = Integer.parseInt(String.valueOf(intToStr.charAt(1))) * (-1);
            startPoint = 2;
        }
        for (int i = startPoint; i < intToStr.length(); i++) {
            digitsSum += Integer.parseInt(String.valueOf(intToStr.charAt(i)));
        }
        System.out.println(digitsSum);
    }
}
