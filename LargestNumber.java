import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd Number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the 3rd Number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal: " + num1);
        } else {
            int largest = num1;

            if (num2 > largest) {
                largest = num2;
            }

            if (num3 > largest) {
                largest = num3;
            }

            System.out.println("The Largest Number is: " + largest);
        }
    }
}
