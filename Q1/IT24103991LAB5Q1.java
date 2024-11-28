import java.util.Scanner;

public class IT24103991Lab5Q1 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        System.out.println("\nUser entered numbers are : " + num1 + " " + num2 + " " + num3);
  
        int smallest = num1;
        int largest = num1;
        
        // Find the smallest number
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Find the largest number
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        
    }
}