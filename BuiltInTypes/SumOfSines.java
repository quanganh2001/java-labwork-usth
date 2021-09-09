package BuiltInTypes;

public class SumOfSines {
    public static void main(String[] args) {
        // Write a program takes a double command-line argument t (in degrees) and prints the value of sin(2t) + sin(3t).
        double degrees = 30;
        double radians = 30;
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(sum);
    }
}
