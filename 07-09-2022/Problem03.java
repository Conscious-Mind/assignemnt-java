public class Problem03 {
    public static void main(String[] args) {
        String totalRiceStr = "0";
        String riceStr = "1";

        for (int i = 0; i < 64; i++) {
            totalRiceStr = Long.toUnsignedString((Long.parseUnsignedLong(totalRiceStr) + Long.parseUnsignedLong(riceStr)));
            System.out.printf("For box - %d the rice is %s Kg and total rice is %s Kg%n", (i+1), riceStr, totalRiceStr);
            riceStr = Long.toUnsignedString(Long.parseUnsignedLong(riceStr) * 2);
        }
    }
}
