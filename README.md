
 
---

## 🧩 1️⃣ DataTypes.java

**Concepts covered:**
- Primitive Data Types: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`
- Non-Primitive Types: `String`, `Array`, `Wrapper classes`

 
---

## 🧩 2️⃣ TypeCasting.java

**Concepts covered:**
- Widening Casting (automatic)
- Narrowing Casting (manual)
- Char ↔ Int conversion
- Float → Int
- Wrapper class (Autoboxing / Unboxing)
- String ↔ Int conversion

 
 Java-Basics/
│
├── 📁 DataTypes/
│   ├── DataTypes.java
│   └── README.md        # explains what DataTypes.java covers
│
├── 📁 TypeCasting/
│   ├── TypeCasting.java
│   └── README.md        # explains what TypeCasting.java cover
│
├── .gitignore
└── README.md            



 
 # Operators-Java

This project demonstrates the use of different **operators in Java** using simple, clear examples.  
It covers assignment, arithmetic, comparison, logical, ternary, and bitwise operators — all in one place!

---

## 🧮 Types of Operators Used

### 1. Assignment Operators
Used to assign or update values.

### 2. Arithmetic Operators

Used for mathematical operations.

int a = 10;
int b = 14;
int result = a + b; // addition
System.out.println(result); // 24


Operators: +, -, *, /, %

### 3. Comparison Operators

Used to compare two values.

long c = 10;
int d = 90;
boolean k = c > d;
System.out.println(k); // false


Operators: <, >, <=, >=, !=, ==

### 4. Logical Operators

Used to combine multiple conditions.

int g = 12, n = 24, o = 54;
System.out.println(g > n && o > n); // false
System.out.println(g > n || o > n); // true
System.out.println(!(g > n));       // true


Operators: &&, ||, !

### 5. Ternary Operator

Short form of if-else.

System.out.println(10 > 20 ? "true" : "false"); // false

### 6. Bitwise Operators

Used for binary-level operations.

& (AND)
| (OR)
^ (XOR)
~ (NOT)
<< (Left Shift)
>> (Right Shift)
## Folder Structure
Operators-Java/
├── operators.java
├── README.md
└── .gitignore

 
