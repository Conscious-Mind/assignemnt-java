package section1.part1;

import java.util.Arrays;

public class Class09MultDimArr {
    public static void main(String[] args) {
        // int[][] numbers = new int[2][3];
        // numbers[0][0] = 1;

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));
    }
}
