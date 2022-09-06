public class FindDuplicate {
    public static void main(String[] args) {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        int unique = 0;

        for (int i = 0; i < n; i++) {
            unique = unique ^ ar[i];
        }
        System.out.printf("The unique number in the array is: %d", unique);
    }
}