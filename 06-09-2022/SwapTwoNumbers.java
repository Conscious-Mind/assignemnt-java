import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter a Second Number: ");
        int secondNumber = scan.nextInt();
        System.out.printf("Before Swap: A = %d, B = %d", firstNumber, secondNumber);

        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        System.out.printf("%nAfter Swap: A = %d, B = %d", firstNumber, secondNumber);
    }
}
