package BuiltInTypes;

public class SumOfSines {
    public static void main(String[] args) {
        double degrees = 30;
        double radians = 30;
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(sum);
    }
}