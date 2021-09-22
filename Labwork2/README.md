# Write a Java class “Cow” and a Java tester class “CowTestDrive” to implement the OOP class design: “Cow”
- Apply the “Encapsulation” concept in your classes
- The moo() method should print out the text “Moo...!”
- The tester class should:
  + Make a Cow object
  + Set the age of the Cow to 4
  + Call the moo() method

## File Cow.java
```java
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
```
## File CowTestDrive.java
```java
// a Java tester class “CowTestDrive” to implement the OOP class design: “Cow”
package Labwork2;

import java.util.*;
import java.lang.Math;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.setAge(4);
        cow.moo();
    }
}
```
Result is Moo...!
# Write a Java class “NameCard” and a Java tester class “NameCardTestDrive” to present the corresponding NameCard design:
- Apply the “Encapsulation” concept in your
classes
- The tester class should print out the instance
NameCard values

## File NameCard.java
```java
// Write a Java class “NameCard” and a Java tester class “NameCardTestDrive”to present the corresponding NameCard design:
// Apply the “Encapsulation” concept in your classes
package Labwork2;

import java.util.*;
import java.lang.Math;

public class NameCard {
    public String name;
    public String phone;
    public String email;
    public void getName() {
        System.out.println(name);
    }

    public void getPhone() {
        System.out.println(phone);
    }

    public void getEmail() {
        System.out.println(email);
    }
}
```

## File NameCardTestDrive.java
```java
package Labwork2;

import java.util.*;
import java.lang.Math;

// The tester class should print out the instance NameCard values

public class NameCardTestDrive {
    public static void main(String[] args) {
        NameCard nc = new NameCard();
        nc.name = "Nguyen Quang Anh";
        nc.phone = "0356326737";
        nc.email = "cocoi5659@gmail.com";
        nc.getName();
        nc.getPhone();
        nc.getEmail();
    }
}
```
Resutl is
```java
Nguyen Quang Anh
0356326737
cocoi5659@gmail.com
```
# Write a Java class “Vector” and a Java tester class “VectorTestDrive” to implement the OOP class design: “Vector”.
- Apply “Encapsulation” concept in your classes.
- In your tester class “VectorTestDrive”:
    + Create and print out information of 2 vectors
    + Calculate and print out the sum, subtraction and multiplication of the two created vectors

## File Vector.java
```java
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
```

## File VectorTestDrive.java
```java
package Labwork2;

import java.util.*;
import java.lang.Math;

public class VectorTestDrive {
    public static void main(String[] args) {
        // Create and print out information of 2 vectors
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        v1.x = 2;
        v1.y = 3;
        v2.x = 5;
        v2.y = 6;
        
        // Calculate and print out the sum, subtraction and multiplication of the two created vectors
        System.out.println("Vector 1: " + v1.x + " " + v1.y);
        System.out.println("Vector 2: " + v2.x + " " + v2.y);
        v1.add(v2);
        v1.subtract(v2);
        v1.multiply(v2);
    }
}
```
Result is
````java
Vector 1: 2 3
Vector 2: 5 6
Added: 7 9
Added: -3 -3
Scalar product: 28
````