# Java
```bash
D1 -> HelloWorld
D2 -> Variable
D3 -> If/While/For
D4 -> Array
D5 -> Method
D6 -> Java Basic Test
D7 -> Object-oriented
D8 -> Object-oriented Test
D9 -> String
D10 -> ArrayList
```
## Java Basics
 - javac + filename + suffix (that is, compile the java file)
 - java + filename (to run the compiled class file)
### 1. Java Three Major Platforms
 - JavaSE, JavaME, JavaEE(Web)
### 2. Main features of Java
- Object Oriented
- Security
- Multi-threaded
- Simplicity and Ease of Use
- Open Source
- Cross-platform (Java Virtual Machine)
### 3. JRE and JDK
JVM (Java Virtual Machine), Java virtual machine

JRE (Java Runtime Environment), the Java Runtime Environment, contains the JVM and Java's core class library (Java API)

JDK (Java Development Kit) called Java Development Tools, including the JRE and development tools

## Java syntax
 - Comments, Keywords, Literals, Variables, Data Types, Identifiers, Keyboard Entry
 - double > float > long > int > short > byte
```java
// Keypad entry
import java.util.Scanner;
public class ScannerDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = sc.nextInt();
		System.out.println(i);
	}
}
```
 - Operator
 - Statement(if, switch, for, while, do...while)
```java
import java.util.Random;
// Random number
public class Test4 {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(10);// 0 ~ 9
            System.out.println(number);
        }
    }
}
```
 - Array
 - Method
## Object-oriented
 - Classes and Objects
 - Member and local variables
 - Encapsulation(private, this)
 - Constructor method
## String
 - String
 - StringBuilder
 - StringJoiner
## ArrayList

## Puzzle Game
 - Interface construction
 - Menu construction
 - Add pictures
