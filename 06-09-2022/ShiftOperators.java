public class ShiftOperators {
    public static void main(String[] args) {
        //        Right Shift Signed
        System.out.println("Right Shift Signed");
        System.out.println("10 >> 2 = " + (10>>2));
        System.out.println("-10 >> 2 = " + (-10>>2));
        System.out.println("15 >> 1 = " + (15>>1));
        System.out.println("15 >> 1 = " + (-15>>1));
        System.out.println();
        //        Right Shift UnSigned
        System.out.println("Right Shift UnSigned");
        System.out.println("10 >>> 2 = " + (10>>>2));
        System.out.println("-10 >>> 2 = " + (-10>>>2));
        System.out.println("10 >>> 1 = " + (15>>>2));
        System.out.println("10 >>> 1 = " + (-15>>>2));
        System.out.println();
        //        Left Shift Signed
        System.out.println("Right Shift Signed");
        System.out.println("10 << 2 = " + (10<<2));
        System.out.println("-10 << 2 = " + (-10<<2));
        System.out.println("15 << 1 = " + (15<<1));
        System.out.println("15 << 1 = " + (-15<<1));
        System.out.println();
    }
}