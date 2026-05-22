import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String no_space1 = string1.replace(" ", "");
        String no_space2 = string2.replace(" ", "");
        System.out.println(no_space1.equals(no_space2));
    }
}