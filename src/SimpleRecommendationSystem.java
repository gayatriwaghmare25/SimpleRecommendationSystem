import java.util.*;

public class SimpleRecommendationSystem {
    public static void main(String[] args) {
        // Sample user preferences
        Map<String, List<String>> userPreferences = new HashMap<>();
        userPreferences.put("Alice", Arrays.asList("Laptop", "Smartphone", "Headphones"));
        userPreferences.put("Bob", Arrays.asList("Smartphone", "Headphones", "Camera"));
        userPreferences.put("Charlie", Arrays.asList("Laptop", "Camera", "Smartwatch"));

        String targetUser = "Alice";
        System.out.println("Recommendations for " + targetUser + ":");

        List<String> targetPrefs = userPreferences.get(targetUser);
        Set<String> recommendations = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : userPreferences.entrySet()) {
            String otherUser = entry.getKey();
            if (!otherUser.equals(targetUser)) {
                List<String> otherPrefs = entry.getValue();
                for (String item : otherPrefs) {
                    if (!targetPrefs.contains(item)) {
                        recommendations.add(item);
                    }
                }
            }
        }

        for (String rec : recommendations) {
            System.out.println("- " + rec);
        }
    }
}
