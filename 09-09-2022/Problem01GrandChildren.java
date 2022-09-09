import java.util.Arrays;
import java.util.Scanner;

public class Problem01GrandChildren {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String familyTree[][] = {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        System.out.println(Arrays.deepToString(familyTree));

        System.out.print("Enter the Name: ");
        String name = scan.nextLine();
        String childName = "";
        int grandChildCount = 0;

        for (int i = 0; i < familyTree.length; i++) {
            if (name.equalsIgnoreCase(familyTree[i][1])) {
                childName = familyTree[i][0];
                for (int j = 0; j < familyTree.length; j++) {
                    if (childName.equalsIgnoreCase(familyTree[j][1])) {
                        grandChildCount++;
                    }
                }
            }
        }

        System.out.printf("%s has %d Grandchildrens.", name, grandChildCount);
        scan.close();

    }
}
