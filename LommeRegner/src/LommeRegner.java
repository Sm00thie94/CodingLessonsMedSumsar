import java.util.Scanner;

public class LommeRegner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action = -1;

        while (action == -1) {
            System.out.println("Vil du plus(1), minus(2), gange(3), dividere(4), opløft i anden(5) eller afslutte programmet (0)");
             action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Indtast tal");
                double x = scanner.nextInt();
                System.out.println("Indtast andet tal");
                double y = scanner.nextInt();
                System.out.println(x + y);
            } else if (action == 2) {
                System.out.println("Indtast tal");
                double x = scanner.nextInt();
                System.out.println("Indtast andet tal");
                double y = scanner.nextInt();
                System.out.println(x - y);
            } else if (action == 3) {
                System.out.println("Indtast tal");
                double x = scanner.nextInt();
                System.out.println("Indtast andet tal");
                double y = scanner.nextInt();
                System.out.println(x * y);
            } else if (action == 5) {
                System.out.println("Indtast tal");
                double x = scanner.nextInt();
                System.out.println(x * x);
            } else if (action == 4) {
                System.out.println("Indtast tal");
                double x = scanner.nextInt();
                System.out.println("Indtast andet tal");
                double y = scanner.nextInt();
                System.out.println(x / y);
            } else if (action == 0) {
                break;
            } else {
                action = -1;
            }

        }
    }
}
