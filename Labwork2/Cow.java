// Write a Java class “Cow” and a Java tester class “CowTestDrive” to implement the OOP class design: “Cow”
// Apply the “Encapsulation” concept in your classes
package Labwork2;

import java.util.*;
import java.lang.Math;

// Make a Cow object
public class Cow {
    private String name;
    private String breed;
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    // Set the age of the Cow to 4

    public void setAge(int newAge) {
        age = newAge;
    }
    // Call the moo() method
    
    public void moo() {
        System.out.println("Moo...!");
    }
}
