 import java.util.Scanner;

public class DataTypesAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Section
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble();

        System.out.print("Enter your grade (A/B/C/D): ");
        char grade = sc.next().charAt(0);

        System.out.print("Is student enrolled? (true/false): ");
        boolean enrolled = sc.nextBoolean();

        System.out.println("\n--- User Data Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Grade: " + grade);
        System.out.println("Enrolled: " + enrolled);

        // Conditional Logic
        if (age < 18) {
            System.out.println("Status: Minor");
        } else if (age >= 18 && age < 25) {
            System.out.println("Status: College Student Age Group");
        } else {
            System.out.println("Status: Adult");
        }

        // Type Casting Example
        System.out.println("\n--- Type Casting ---");
        double ageDouble = (double) age; // widening
        int heightInt = (int) height;    // narrowing
        System.out.println("Age as double: " + ageDouble);
        System.out.println("Height as int: " + heightInt);

        // Loop Example (Sum of numbers till age)
        int sum = 0;
        for (int i = 1; i <= age; i++) {
            sum += i;
        }
        System.out.println("\nSum of numbers till your age: " + sum);

        // Switch Example using grade
        System.out.println("\n--- Grade Evaluation ---");
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Excellent performance!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job!");
                break;
            case 'C':
            case 'c':
                System.out.println("Average effort.");
                break;
            default:
                System.out.println("Needs improvement.");
        }

        // Bitwise and Logical Operations
        System.out.println("\n--- Bitwise & Logical Demo ---");
        int x = 10, y = 4;
        System.out.println("x & y = " + (x & y));  // Bitwise AND
        System.out.println("x | y = " + (x | y));  // Bitwise OR
        System.out.println("x ^ y = " + (x ^ y));  // Bitwise XOR
        System.out.println("~x = " + (~x));        // Bitwise NOT

        boolean cond1 = (age > 18);
        boolean cond2 = enrolled;
        System.out.println("Logical AND: " + (cond1 && cond2));
        System.out.println("Logical OR: " + (cond1 || cond2));

        sc.close();
    }
}
