import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager.");
        } else
            System.out.println("You are not an teenager4");

        scanner.close();
    }
}
