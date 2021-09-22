// Write a Java class “Vector” and a Java tester class “VectorTestDrive” to implement the OOP class design: “Vector”.
// Apply “Encapsulation” concept in your classes.
package Labwork2;

import java.util.*;
import java.lang.Math;

public class Vector {
    int x;
    int y;

    public void add(Vector other) {
        Vector result = new Vector();
        result.x = this.x + other.x;
        result.y = this.y + other.y;
        System.out.println("Added: " + result.x + " " + result.y);
    }

    public void subtract(Vector other) {
        Vector result = new Vector();
        result.x = this.x - other.x;
        result.y = this.y - other.y;
        System.out.println("Added: " + result.x + " " + result.y);
    }

    public void multiply(Vector other) {
        int result = this.x * other.x + this.y * other.y;
        System.out.println("Scalar product: " + result);
    }
}
