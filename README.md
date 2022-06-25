# java-oop

### What is Static Access Modifier or Static keyword?
**Static methods can be accessed without creating an object of the class.**
```java
public class Person {
    public static void displayStaticName(String name) {
        System.out.println("Your name is " + name);
    }
}

```
*To Access the static method, you can directly use the class name followed by the method name.*
```java
public class Main {
    public static void main(String[] args) {
        Person.displayStaticName("Ripon");
    }
}
```