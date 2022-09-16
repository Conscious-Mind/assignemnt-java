package section1.part1;

public class Class13Casting {
    public static void main(String[] args) {
        // Implicit Casting or Automatic Casting
        // byte > short > int > long > float > double
        double x = 1.1;
        int y = (int) x + 2;
        System.out.println(x + " " + y);

        String z = "100";
        Integer Z = Integer.parseInt(z);
        System.out.println(Z);
    }
}
 