# Java
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
