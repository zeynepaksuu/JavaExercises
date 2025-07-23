package Exercises;
import java.util.Scanner;

public class UserInputExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String name = scanner.nextLine();
        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.println("Merhaba " +name+ ", " +age+ " yaşındasınız.");
    }
}
