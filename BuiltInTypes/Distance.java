package BuiltInTypes;

public class Distance {
    public static void main(String[] args) {
        // parse x - and y-coordinates from command line arguments
        int x = 0;
        int y = 0;

        // compute distance to (0, 0)
        double dist = Math.sqrt(x * x + y * y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
