# Write TenHelloWorld
```java
public class TenHelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
    }
}
```
Result
````java
Hello, World
Hello, World
Hello, World
Hello, World
Hello, World
Hello, World
Hello, World
Hello, World
Hello, World
Hello, World
````
# Write UseArgument.java
## Write your name
```java
package FirstProgram;

public class UseArgument {

    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print("Alice");
        System.out.println(". How are you?");
    }

}
```
Result is 
```java
Hi, Alice. How are you?
```
## Write user input
```java
package FirstProgram;

public class UseArgument {

    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");
    }

}
```
- First, you must input command line: ```javac UseArgument.java```
- Second, you can input command: ```java UseArgument.java Alexander```
- So the result is

```java
Hi, Alexander. How are you?
```
# Write UseThree.java
## Write these name
```java
public class UseThree {
    public static void main(String[] args) {
        System.out.print("Hi, Alice");
        System.out.print(", Bob");
        System.out.print(", and Carol");
        System.out.println(".");
    }
}
```
Result
```java
Hi, Alice, Bob, and Carol.
```
## Write User Input
```java
package FirstProgram;
public class UseThree {

    public static void main(String[] args) {
        // takes three names and prints out a proper sentence with the names in the reverse of the order given
        System.out.print("Hi, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");
    }

}
```
- First, you must input command line: ```javac UseThree.java```
- Second, you can input command: ```java UseThree John Andy Alex```
- So the result is 

```java
Hi, Alex, Andy, and John.
```
# Describe what happens if, in HelloWorld.java, you omit
Part 1
- main
- String
- HelloWorld
- System.out
- println

Part 2
(by, say, omitting the second letter)
- the ;
- the first "
- the second "
- the first {
- the second {
- the first }
- the second }

## Part 1
If you omit main, it will error:
```txt
HelloWorld.java:2: error: <identifier> expected
        System.out.println("Hello World");
                          ^
HelloWorld.java:2: error: illegal start of type
        System.out.println("Hello World");
                           ^
HelloWorld.java:4: error: class, interface, enum, or record expected
}
```
If you omit String, it will error: as above
If you omit HelloWorld, it will error: 
- "Syntax error on token "class", Identifier expected after this token"


If you omit System.out, it will error: The method println(String) is undefined for the type HelloWorld
If you omit println, it will error:
- Constructor call must be the first statement in a constructor
- Syntax error on token ".", super expected after this token

If you omit the ;, it will error: Syntax error, insert ";" to complete BlockStatements
If you omit the first ", it will error 
- Syntax error on token(s), misplaced construct(s)
- Hello cannot be resolved to a type
- Syntax error, insert ";" to complete BlockStatements
- String literal is not properly closed by a double-quote
- String literal is not properly closed by a double-quote

If you omit the second ", it will error: 
- String literal is not properly closed by a double-quote

If you omit the first {, it will error:
- Syntax error on token "HelloWorld", { expected after this token

If you omit the second {, it will error:
- Syntax error on token ")", { expected after this token

If you omit the first }, it will error:
- Syntax error, insert "}" to complete ClassBody

If you omit the second }, it will error:
- Syntax error, insert "}" to complete ClassBody

## Part 2
If you misspell main, it will error:
```txt
Error: Could not find or load main class HelloWorld
Caused by: java.lang.ClassNotFoundException: HelloWorld
```
If you misspell String, it will error:
```txt
HelloWorld.java:2: error: cannot find symbol
    public static void main(Sring[] args) {
                            ^
  symbol:   class Sring
  location: class HelloWorld
1 error
```
If you misspell HelloWorld, it will error:
- The public type HlloWorld must be defined in its own file

If you misspell System.out, it will error:
- Sstem cannot be resolved

If you misspell println, it will error:
- The method pintln(String) is undefined for the type PrintStream

I typed in the following program. It compiles fine, but when I execute it, I get the error java.lang.NoSuchMethodError: main. What am I doing wrong?
```java
public class Hello {
   public static void main() {
      System.out.println("Doesn't execute");   
   }
}
```
Answer: you forgot the String[] args. It is required.

Fixing
```java
public class Hello {
   public static void main(String[] args) {
      System.out.println("Doesn't execute");   
   }
}
```

Source from: https://introcs.cs.princeton.edu/java/11hello/
