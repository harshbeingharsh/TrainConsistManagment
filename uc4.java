import java.util.*;

public class UC4 {
    public static void main(String[] args) {
        // HashSet to prevent duplicate bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bogie IDs (type 'done' to finish):");

        while(true) {
            String bogie = sc.nextLine();
            if(bogie.equalsIgnoreCase("done")) break;

            if(bogieIDs.add(bogie)) {
                System.out.println(bogie + " added.");
            } else {
                System.out.println(bogie + " is a duplicate and ignored.");
            }
        }

        System.out.println("\nUnique bogie IDs in the train:");
        for(String id : bogieIDs) {
            System.out.println(id);
        }

        // LinkedList example for consist
        LinkedList<String> train = new LinkedList<>();
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry Car at position 2
        train.add(2, "Pantry Car");

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nFinal train consist order:");
        for(String bogie : train) {
            System.out.println(bogie);
        }
    }
}