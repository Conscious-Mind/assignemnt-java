package section1.part1;

import java.awt.*;

public class Class05PrimvsRef {
    public static void main(String[] args) {
        // Primitive type copying is a separate variable
        // byte x = 1;
        // byte y = x;
        // x = 2;
        // System.out.println(x + " " + y);

        // In reference type not so
        Point point1 = new Point(1, 4);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point1.x + " " + point2.x);

    }
}
