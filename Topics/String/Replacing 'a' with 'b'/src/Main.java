import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String swap_a_b = scanner.nextLine();
        System.out.println(swap_a_b.replace('a','b'));
    }
}