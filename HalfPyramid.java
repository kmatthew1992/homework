package homework;

import java.util.Scanner;

public class HalfPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérlek add meg a piramis magasságát: ");
        int height = scanner.nextInt();
        System.out.print("Kérlek add meg a piramis szélességét: ");
        int width = scanner.nextInt();
        System.out.print("Kérlek add meg a piramist alkotó szimbólumot: ");
        String symbol = scanner.next();
        halfPyramid(height, width, symbol);
    }
    private static void halfPyramid(int height, int width, String symbol){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= width - i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
