import java.util.Scanner;

public class NestedExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("The Year - %d is a Leap Year", year);
                } else {
                    System.out.printf("The Year - %d is Not a Leap Year", year);
                }
            } else {
                System.out.printf("The Year - %d is a Leap Year", year);
            }
        } else {
            System.out.printf("The Year - %d is Not a Leap Year", year);
        }
    }
}
