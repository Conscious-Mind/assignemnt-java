import java.math.BigInteger;

public class Problem02 {
    public static void main(String[] args) {
        BigInteger rice = BigInteger.valueOf(1);
        BigInteger totalRice = BigInteger.valueOf(0);
        for (int i = 0; i < 64; i++) {
            totalRice = totalRice.add(rice);
            System.out.printf("For box - %d the rice is %d Kg and total rice is %d Kg%n", (i+1), rice, totalRice);
            rice = rice.multiply(BigInteger.valueOf(2));
        }
    }
}
