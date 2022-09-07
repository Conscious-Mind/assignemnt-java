import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scan.nextInt();
        System.out.print("Enter Position: ");
        int position = scan.nextInt();
//        int answer = (int) (Math.pow(2, position-1) * number);
        int answer = number << (position-1);
        System.out.printf("For Number = %d ");
    }
}
