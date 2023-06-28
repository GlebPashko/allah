public class Main {
    public static void main(String[] args) {
        int tenBit = 22;
        System.out.println(returnEightBit(tenBit));
    }

    public static int returnEightBit(int tenBit) {
        int eightBit = 0;
        if (tenBit < 1){
            return 0;
        }

        int i = 0;
        while (tenBit != 0) {
            eightBit = (int) (eightBit + (tenBit % 8) * Math.pow(10, i++)); // 0 + 6 * 10^0 = 6 // 6 + 3 * 10^1 = 36
            tenBit = tenBit / 8; // 2.75 // 0
        }
        return eightBit;
    }
}