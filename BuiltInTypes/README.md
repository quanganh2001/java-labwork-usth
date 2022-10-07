# 1. Suppose that a and b are int values. What does the following sequence of statements do?
```java
int t = a;
b = t;
a = b;
```
Solution: sets a, b, and t equal to the original value of a.

# 2. Suppose that a and b are int values. Simplify the following expression: (!(a < b) && !(a > b))
Solution: (a == b)

# 3.The exclusive or operator ^ for boolean operands is defined to be true if they are different, false if they are the same. Give a truth table for this function.

# 4.Why does 10/3 give 3 and not 3.33333333?
Solution: Since both 10 and 3 are integer literals, Java sees no need for type conversion and uses integer division. You should write 10.0/3.0 if you mean the numbers to be double literals. If you write 10/3.0 or 10.0/3, Java does implicit conversion to get the same result.

# 5.What do each of the following print?
```java
System.out.println(2 + "bc"); prints: 2bc
System.out.println(2 + 3 + "bc"); prints: 5bc
System.out.println((2+3) + "bc"); prints: 5bc
System.out.println("bc" + (2+3)); prints: bc5
System.out.println("bc" + 2 + 3); prints: bc23
```

Explain each outcome.

Because 2 + "bc" = 2bc, 2 + 3 + "bc" = 5bc, (2 + 3) + "bc" = 5bc, "bc" + (2 + 3) = bc5, "bc" + 2 + 3 = bc23

# 6. Explain how to use Quadratic.java to find the square root of a number.

Solution: to find the square root of c, find the roots of x^2 + 0x - c.

# 7. A physics student gets unexpected results when using the code
```java 
double force = G * mass1 * mass2 / r * r; 
```
to compute values according to the formula $F = Gm_1m_2 / r^2$. Explain the problem and correct the code.

Solution: It divides by r, then multiplies by r (instead of dividing by r *r). Use parentheses:

```java
double force = G * mass1 * mass2 / (r * r);
```

# 8. Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
```java
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
```
Result is
```java
distance from (0, 0) to (0, 0) = 0.0
```

# 9. Write a program SumOfTwoDice.java that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
```java
package BuiltInTypes;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        System.out.println(sum);
    }
}
```
Result is 5

# 10. Write a program SumOfSines.java that takes a double command-line argument t (in degrees) and prints the value of sin(2t) + sin(3t).
```java
package BuiltInTypes;

public class SumOfSines {
    public static void main(String[] args) {
        double degrees = 30;
        double radians = 30;
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(sum);
    }
}
```
Result is 0.5891860424983412

# 11. Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), false otherwise.

```java
package BuiltInTypes;

public class SpringSeason {
    public static void main(String[] args) {
        int month = 3;
        int day = 20;
        boolean isSpring = (month == 3 && day >= 20 && day <= 31)
                        || (month == 4 && day >=  1 && day <= 30)
                        || (month == 5 && day >=  1 && day <= 31)
                        || (month == 6 && day >=  1 && day <= 20);
        System.out.println(isSpring);
    }
}
```
Result is False

# Download Maven

Go to: https://maven.apache.org/download.cgi

Click to download: https://dlcdn.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.zip

- Step 1: Unzip downloaded apache-maven-3.3.9-bin.zip file into a folder where  you prefer to store Maven projects. For example, if your preferred folder is  C:\Apache, then you should have the folder: C:\Apache\ apache-maven-3.3.9 
- Step 2: Set “Environment Variables” 
  + Open Control Panel 🡪 System 🡪 Advanced System Settings 🡪 choose  tab “Advanced”, click button “Environment Variables” 
  + Add to the end of variable PATH the string C:\Apache\apache-maven-3.8.2\bin 


![apache environment](https://i.imgur.com/h5TviF6.png)

- Step 3: Check to see if Maven is installed successfully 
  + Open console, execute the following command: 
```mvn -version```
  + If you see the output in your console similarly to the following, then you  have installed Maven successfully:

![check apache version](https://i.imgur.com/w9Iai7K.png)

# Download IntelliJ IDEA
- Go to https://www.jetbrains.com/idea/download/#section=windows and click Download Community file types .exe
- Install IntellJ IDEA Community
- You should reboot computer
- The first time click app you must Agree User Agreement and click to Don't Send
