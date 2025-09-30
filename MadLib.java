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
        System.out.print("Enter another noun: ");
        String noun2 = scanner.nextLine();
        System.out.print("Enter another verb: ");
        String verb2 = scanner.nextLine();
        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();
        System.out.print("You are a " + adjective + " " + noun + " who always " + verb + " everday. How do you do it? How does one man muster up the courage to commit such atrocities? You are not a god, yet alone a " + noun2 + "." + "You shall be cast into the depth of Helheim, denying yourself all chances of entry into Valhalla.");
    }
}
