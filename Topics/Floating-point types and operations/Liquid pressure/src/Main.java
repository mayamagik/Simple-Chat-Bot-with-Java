import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gravity = 9.8;
        double height = scanner.nextDouble();
        double density = scanner.nextDouble();
        double liquid_pressure = gravity * height * density;

        System.out.println(liquid_pressure);
    }
}