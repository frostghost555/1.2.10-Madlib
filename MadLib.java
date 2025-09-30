import java.util.Scanner;

public class Madlib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.print("You are a " + adjective + noun + "who always " + verb);
    }
}
