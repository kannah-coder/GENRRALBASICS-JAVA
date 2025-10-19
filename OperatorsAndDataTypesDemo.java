 
import java.util.Arrays;

public class OperatorsAndDataTypesDemo {

    public static void main(String[] args) {
        System.out.println("=== Data Types Demo ===");

        // 1. Primitive data types
        byte b = 10;
        short s = 300;
        int i = 1000;
        long l = 100000L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("\n=== Type Casting Demo ===");

        // Implicit casting (smaller to bigger)
        int intFromByte = b;
        double doubleFromInt = i;
        System.out.println("int from byte: " + intFromByte);
        System.out.println("double from int: " + doubleFromInt);

        // Explicit casting (bigger to smaller)
        int x = 130;
        byte byteFromInt = (byte) x; // overflow example
        System.out.println("byte from int 130 (overflow): " + byteFromInt);

        double pi = 3.14159;
        int intFromDouble = (int) pi; // fractional part lost
        System.out.println("int from double 3.14159: " + intFromDouble);

        System.out.println("\n=== Operators Demo ===");

        int a = 10, b2 = 3;

        // Arithmetic
        System.out.println("Arithmetic:");
        System.out.println("a + b2 = " + (a + b2));
        System.out.println("a - b2 = " + (a - b2));
        System.out.println("a * b2 = " + (a * b2));
        System.out.println("a / b2 = " + (a / b2)); // integer division
        System.out.println("a % b2 = " + (a % b2));

        // Unary operators
        System.out.println("\nUnary:");
        System.out.println("++a = " + (++a)); // pre-increment
        System.out.println("b2-- = " + (b2--)); // post-decrement
        System.out.println("b2 now = " + b2);

        // Relational operators
        System.out.println("\nRelational:");
        System.out.println("a > b2: " + (a > b2));
        System.out.println("a < b2: " + (a < b2));
        System.out.println("a >= b2: " + (a >= b2));
        System.out.println("a <= b2: " + (a <= b2));
        System.out.println("a == b2: " + (a == b2));
        System.out.println("a != b2: " + (a != b2));

        // Logical operators
        boolean p = true, q = false;
        System.out.println("\nLogical:");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        // Bitwise operators
        int m = 5; // 0101
        int n = 3; // 0011
        System.out.println("\nBitwise:");
        System.out.println("m & n = " + (m & n)); // 0101 & 0011 = 0001 = 1
        System.out.println("m | n = " + (m | n)); // 0101 | 0011 = 0111 = 7
        System.out.println("m ^ n = " + (m ^ n)); // 0101 ^ 0011 = 0110 = 6
        System.out.println("~m = " + (~m));       // bitwise NOT
        System.out.println("m << 1 = " + (m << 1)); // shift left
        System.out.println("m >> 1 = " + (m >> 1)); // shift right

        // Ternary operator
        System.out.println("\nTernary:");
        int max = (a > b2) ? a : b2;
        System.out.println("max of a and b2: " + max);

        System.out.println("\n=== Mixing Operators with Type Casting ===");

        byte small = 50;
        int result = small * 2; // implicit cast to int
        System.out.println("50 * 2 = " + result);

        double complicated = (a + b2) / 3.0 + (double) m / n;
        System.out.println("complicated expression: " + complicated);

         

        
    }
}
