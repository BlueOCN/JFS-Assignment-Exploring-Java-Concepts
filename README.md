# JFS-Assignment-Exploring-Java-Concepts
In this assignment, you will explore the fundamentals of variables and primitive types in Java.

## Assignment Summary

- Variables allow you to store data in named locations in memory.
- Primitive types are the most basic data types supported by Java, including but not limited to int, double, char, and Boolean.
- Increment (++) and Decrement (--) operators increase and decrease the value of a variable by 1.
- Strings are a non-primitive data type that represent sequences of characters. Various methods can be called and operations can be performed to manipulate strings, like concatenation, trimming, and case conversion.
- User input can be read, like strings and other types of input, using the Scanner class.
- If-Else statements let you execute code only when specific conditions that you define are met.
- Logical operators like && (and), || (or), and ! (not) can be used to combine various conditions.
- Switch Statements can simplify multiple if-else conditions by selecting a value from multiple possible options.

## Assignment Objectives

By the end of this assignment, you should be able to:

1. Understand variables and data types.
2. Handle user input.
3. Work with conditional statements.
4. Perform basic string manipulation.

---

## Part 1: Exploring Variables and Primitive Types

### Introduction: 
In this assignment, you will explore the fundamentals of variables and primitive types in Java. Variables are used to store data that can be used and manipulated in your programs. Java has various primitive types, such as int, double, char, and boolean, that are used to define the type of data a variable can hold. Understanding these concepts is essential for building basic Java programs.

### Assignment Tasks:

1. Declare and Initialize Variables:
    - Declare an integer variable age and initialize it with your age.
    - Declare a double variable height and initialize it with your height in inches.
    - Declare a char variable initial and initialize it with the first letter of your name.
    - Declare a Boolean variable isStudent and initialize it to true or false based on your student status.
2. Print Variable Values:
    - Print the values of all the variables you declared and initialized.


## Part 2: Increment and Decrement Operations

### Introduction: 
Increment and decrement operators are used to increase or decrease the value of a variable by 1. These operators are commonly used in loops and other control structures. In this assignment, you will learn how to use these operators effectively in your Java programs.

### Assignment Tasks:

1. Declare and Initialize Variables:
    - Declare an integer variable counter and initialize it with the value 10.
2. Perform Increment and Decrement Operations:
    - Increment the value of counter by 1 using the increment operator (++).
    - Print the value of counter.
    - Decrement the value of counter by 1 using the decrement operator (--).
    - Print the value of counter.
3. Use Increment and Decrement in Loops:
    - Use a for loop to increment counter from 10 to 15 and print each value.
    - Use a while loop to decrement counter from 15 to 10 and print each value.

## Part 3: Working with Strings and User Input

### Introduction: 
Strings are used to represent sequences of characters in Java. They are widely used for storing and manipulating text. User input allows your programs to interact with users, making them more dynamic and interactive. In this assignment, you will learn how to work with strings and handle user input using the Scanner class.

### Assignment Tasks:

1. Import the Scanner Class:
    - Import the Scanner class from the java.util package.
2. Read User Input:
    - Create a Scanner object to read user input.
    - Prompt the user to enter their first name and store it in a String variable firstName.
    - Prompt the user to enter their last name and store it in a String variable lastName.
3. Manipulate Strings:
    - Concatenate firstName and lastName to form the full name and store it in a String variable fullName.
    - Convert fullName to uppercase and store it in a new variable.
    - Count the number of times the first character of fullName appears throughout the string.
    - Print the full name, its uppercase version, and the number of times the first letter appears.

## Part 4: Using Conditionals, Logical Operators, and Switch Statements

### Introduction: 
Conditionals and logical operators are used to make decisions in your programs based on certain conditions. The switch statement provides an alternative to using multiple if-else statements. In this assignment, you will learn how to use these control structures to create more complex and dynamic programs.

### Assignment Tasks:

1. Declare and Initialize Variables:
    - Declare three integer variables representing test scores and initialize them with a value between 0 and 100.
    - Declare an integer variable averageScore and initialize it to the average of the three test scores.
    - Use Conditionals and Logical Operators:
2. Use if-else statements to print a message based on the averageScore:
    - "Excellent" if averageScore is between 90 and 100.
    - "Good" if averageScore is between 70 and 89.
    - "Average" if averageScore is between 50 and 69.
    - "Poor" if averageScore is below 50.
3. Use a Switch Statement:
    - Create an integer variable day and initialize it with a value between 1 and 7.
    - Use a switch statement to print the name of the day based on the value of day (e.g., 1 for "Monday", 2 for "Tuesday", etc.).

## Part 5: Basic Calculator

### Introduction: 
In this assignment, you will create a calculator that will allow users to perform basic arithmetic operations, showcasing a comprehensive understanding of these concepts.

### Assignment Tasks:

1. Declare and Initialize Variables:
    - Declare variables to store two numbers (num1, num2) and the result (result).
    - Declare a variable to store the operation choice (operation).
2. Read User Input:
    - Use the Scanner class to read the two numbers and the operation choice from the user.
3. Perform Arithmetic Operations:
    - Use if-else statements and logical operators to perform the chosen arithmetic operation (+, -, *, /) and store the result in result.
    - Use a switch statement to handle the operations.
4. Increment and Decrement Operations:
    - Provide an option to increment or decrement the result by 1.
    - Use the increment (++) and decrement (--) operators.
5. Display Results:
    - Print the result of each calculation.
