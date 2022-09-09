import java.util.Arrays;
import java.util.Scanner;

public class Problem05LowHigh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];

        
        for (int i = 0; i < length; i++) {
            System.out.print("Enter Each element of Array: ");
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int odd = (length-1) / 2;
        int even = odd + 1;

    for (int i = 0; i < length; i++) {
        if (i% 2== 0 && odd >= 0) {
            System.out.print(arr[odd--]);
        }
        else if (i % 2 == 1 && even < length) {
            
            System.out.print(arr[even++]);
        }
        System.out.print(" ");
    }
    scan.close();
    }
}
