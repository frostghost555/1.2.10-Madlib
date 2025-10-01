import java.util.Scanner; // import scanner class (to create a scanner object).

public class Senapati_Madlibs {
    public static void main(String[] args) {
        // Create a scanner object (to collect input).
        Scanner scanner = new Scanner(System.in);

        // Collect user input.
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

        // Generate MadLib Story.
        System.out.print("You are a " + adjective + " " + noun + " who always " + verb + " everyday. How do you do it? How does one man muster up the courage to commit such atrocities? You are not a god, yet alone a " + noun2 + ". " + "You shall be cast into the depths of Helheim, denying yourself all chances of entry into Valhalla." + " There, you will " + verb2 + " among the shadows, forever tormented by your " + adjective2 + " deeds.");
    }
}
