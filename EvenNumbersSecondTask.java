package homework;

import java.util.Scanner;

public class EvenNumbersSecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = numbers(scanner, "Adja meg az egyik egész számot a -100 és 100 között: ");
        int num2 = numbers(scanner, "Adja meg a másik egész számot az -100 és 100 között: ");

        System.out.println("A páros számok a két megadott szám között:");

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static int numbers(Scanner scanner, String prompt) {
        int num;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Kérem,hogy egész számot adjon meg!");
                System.out.print(prompt);
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < -100 || num > 100);
        return num;
    }
}
