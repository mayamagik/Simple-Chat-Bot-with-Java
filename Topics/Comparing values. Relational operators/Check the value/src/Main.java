import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        boolean lessThan10 = value < 10;

        System.out.println(lessThan10);
    }
}