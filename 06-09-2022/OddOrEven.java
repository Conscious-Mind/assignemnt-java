import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scan.nextInt();
        if ((number & 1) == 1)
            System.out.printf("The giver number(%d) is Odd.", number);
        else
            System.out.printf("The giver number(%d) is Even.", number);
    }
}
