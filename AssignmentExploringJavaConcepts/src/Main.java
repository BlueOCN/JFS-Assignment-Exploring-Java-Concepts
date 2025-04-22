import java.util.Scanner;   // Added for Part 3

public class Main {
    public static void main(String[] args) {
        //TIP Part 1: Exploring Variables and Primitive Types
        int age = 26;
        double height = 68.8976378;
        char initial = 'R';
        boolean isStudent = false;

        System.out.println("Print variable values");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial: " + initial);
        System.out.println("isStudent: " + isStudent);
        System.out.println();


        //TIP Part 2: Increment and Decrement Operations
        int counter = 10;

        System.out.println("Perform increment and decrement operations");
        counter++;
        System.out.println("Counter: " + counter);
        counter--;
        System.out.println("Counter: " + counter);

        System.out.println();
        System.out.println("Count from 10 to 15");
        for (;counter < 16; counter++) {
            System.out.println("Counter: " + counter);
        }

        System.out.println();
        System.out.println("Count from 15 to 10");
        while (counter > 10) {
            counter--;
            System.out.println("Counter: " + counter);
        }

        //TIP Part 3: Working with Strings and User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName;
        String fullNameUpperCase = fullName.toUpperCase();
        char firstChar = fullNameUpperCase.charAt(0);
        int count = 0;
        for (int i = 0; i < fullNameUpperCase.length(); i++) {
            if (firstChar == fullNameUpperCase.charAt(i)){
                count++;
            }
        }
        System.out.println("Full Name: " + fullName);
        System.out.println("Uppercase Full Name: " + fullNameUpperCase);
        System.out.println("Number of times '" + firstChar + "' appears: " + count);

    }
}