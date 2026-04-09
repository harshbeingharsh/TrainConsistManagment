import java.util.HashSet;

public class UC3 {
    public static void main(String[] args) {
        // Create a HashSet for bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs (duplicates will be ignored automatically)
        bogieIds.add("Bogie-101");
        bogieIds.add("Bogie-102");
        bogieIds.add("Bogie-103");
        bogieIds.add("Bogie-101"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique bogie IDs: " + bogieIds);

        // Try adding another duplicate
        boolean added = bogieIds.add("Bogie-102");
        if (!added) {
            System.out.println("Duplicate Bogie-102 ignored by HashSet.");
        }

        // Final state of bogie IDs
        System.out.println("Final bogie IDs: " + bogieIds);
    }
}
