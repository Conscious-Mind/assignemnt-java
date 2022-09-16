package section1.part1;

import java.util.Arrays;

public class Class08Array {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;
        // System.out.println(numbers);

        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));;
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));;
    }
}
