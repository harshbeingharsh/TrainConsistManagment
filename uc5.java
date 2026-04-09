import java.util.LinkedHashSet;

public class UC5 {
    public static void main(String[] args) {
        // Create a LinkedHashSet for bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // duplicate ignored

        // Display the final formation order
        System.out.println("Train formation: " + trainFormation);
    }
}
