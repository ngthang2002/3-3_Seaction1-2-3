import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Byte: ");
        byte byteNumber = scanner.nextByte();
        System.out.print("Short: ");
        short shortNumber = scanner.nextShort();
        System.out.print("Integer: ");
        int intNumber = scanner.nextInt();
        scanner.close();
        long longNumber = (long) 50000 + (long) 10 * (byteNumber + shortNumber + intNumber);
        System.out.println("Long = 50_000 * 10 * (Byte + Short + Integer): " + (50000 + 10 * (byteNumber + shortNumber + intNumber)));
        System.out.println(longNumber);
    }
}