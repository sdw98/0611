import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //system = console, in = input

        String name = scanner.nextLine();
        String family = scanner.next();
        int age = scanner.nextInt();
        double PI = scanner.nextDouble();

        System.out.println("이름: " + name);
        System.out.println("성씨: " + family);
        System.out.println("나이: " + age);
        System.out.println("PI 값: " + PI);

    }
}