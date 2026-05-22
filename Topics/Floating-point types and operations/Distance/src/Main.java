import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double hours = scanner.nextDouble();

        double avg_speed = distance / hours;
        System.out.println(avg_speed);
    }
}