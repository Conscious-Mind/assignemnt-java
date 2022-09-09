import java.util.Scanner;

public class Problem03PatternPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String input = "";

        while (true) {
            System.out.print("Input: ");
            input = scanner.nextLine().toUpperCase();
            length = input.length();
            if (length % 2 == 1){
                break;
            }
            else{
                System.out.println("0");
                System.out.println("The String should be Odd Length");
            }
        }

        for (int i = 0; i < length; i++) {
            int j = length -1 - i;
            for (int k = 0; k < length; k++) {
                if (k == i || k == j)
                    System.out.print(input.charAt(i));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
