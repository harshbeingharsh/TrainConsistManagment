import java.util.ArrayList;

public class uc2 {
    public static void main(String[] args) {
        // Create an ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Print the list after insertion
        System.out.println("Bogies after insertion: " + bogies);

        // Remove one bogie (AC Chair)
        bogies.remove("AC Chair");
        System.out.println("Bogies after removal: " + bogies);

        // Check if Sleeper exists
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the list.");
        } else {
            System.out.println("Sleeper bogie does not exist.");
        }

        // Final list state
        System.out.println("Final bogie list: " + bogies);
    }
}
