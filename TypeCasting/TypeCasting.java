// File: TypeCasting.java
// Author: Kannah
// Description: Demonstrates all types of type casting in Java

public class TypeCasting {
    public static void main(String[] args) {

        System.out.println("=== TYPE CASTING IN JAVA ===\n");

        // 1️⃣ Widening Casting (Automatic)
        int intNum = 10;
        double doubleNum = intNum; // int → double
        System.out.println("Widening Casting (int → double): " + doubleNum);

        // 2️⃣ Narrowing Casting (Manual)
        double dbl = 9.78;
        int num = (int) dbl; // double → int
        System.out.println("Narrowing Casting (double → int): " + num);

        // 3️⃣ Char → Int (ASCII)
        char letter = 'A';
        int asciiValue = letter;
        System.out.println("Char → Int (ASCII value): " + asciiValue);

        // 4️⃣ Int → Char
        int ascii = 66;
        char character = (char) ascii;
        System.out.println("Int → Char: " + character);

        // 5️⃣ Float → Int
        float fnum = 10.75f;
        int inum = (int) fnum;
        System.out.println("Float → Int: " + inum);

        // 6️⃣ Wrapper class casting
        int x = 25;
        Integer boxed = x; // Autoboxing
        int unboxed = boxed; // Unboxing
        System.out.println("Autoboxing (int → Integer): " + boxed);
        System.out.println("Unboxing (Integer → int): " + unboxed);

        // 7️⃣ String ↔ Int conversions
        String numStr = "123";
        int convertedNum = Integer.parseInt(numStr);
        int number = 456;
        String convertedStr = Integer.toString(number);
        System.out.println("String → Int: " + convertedNum);
        System.out.println("Int → String: " + convertedStr);

        System.out.println("\n✅ Type casting demonstration completed!");
    }
}
