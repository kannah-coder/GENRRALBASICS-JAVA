// File: DataTypes.java
// Author: Kannah
// Description: Demonstrates all primitive and non-primitive data types in Java

public class DataTypes {
    public static void main(String[] args) {

        System.out.println("=== JAVA DATA TYPES ===\n");

        // ===== Primitive Data Types =====
        System.out.println("1️⃣ PRIMITIVE DATA TYPES:\n");

        // Integer types
        byte b = 100;               // 1 byte, range: -128 to 127
        short s = 20000;            // 2 bytes
        int i = 500000;             // 4 bytes
        long l = 10000000000L;      // 8 bytes, 'L' required

        // Floating types
        float f = 3.14f;            // 4 bytes, 'f' required
        double d = 99.9999;         // 8 bytes

        // Character and Boolean
        char c = 'A';               // 2 bytes, Unicode supported
        boolean flag = true;        // 1 bit, true or false

        // Display all
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("\n---------------------------------\n");

        // ===== Non-Primitive Data Types =====
        System.out.println("2️⃣ NON-PRIMITIVE DATA TYPES:\n");

        String name = "Kannah";             // String (class type)
        int[] numbers = {10, 20, 30, 40};   // Array
        Integer objInt = 500;               // Wrapper class example

        System.out.println("String: " + name);
        System.out.println("Array first element: " + numbers[0]);
        System.out.println("Wrapper Integer object: " + objInt);

        System.out.println("\n✅ Data types demonstration completed!");
    }
}
