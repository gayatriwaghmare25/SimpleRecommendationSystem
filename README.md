# Simple Recommendation System (Java)

## 📌 Overview
This is a simple Java program that demonstrates the concept of a **recommendation system** using basic data structures.  
It takes a set of user preferences (products liked by each user) and generates recommendations for a target user based on items liked by other users.

## 💻 Features
- Stores sample user preferences in a `HashMap`.
- Compares preferences between users.
- Suggests items that the target user has not yet liked but are liked by other users.
- Uses **Java Collections Framework** (`Map`, `List`, `Set`) for efficient data handling.

## 🛠️ How It Works
1. The program contains a map of users and their preferred items.
2. For a given target user (in this example, **Alice**), the program:
    - Loops through all other users.
    - Collects items they like which the target user does not already own/like.
3. Displays these items as recommendations.

## 📂 Code Structure
- **userPreferences** → A `Map` storing each user's list of liked items.
- **targetUser** → The user for whom recommendations will be generated.
- **recommendations** → A `Set` storing recommended items (avoiding duplicates).

## 🚀 Example Output

## ▶️ How to Run
1. Save the file as `SimpleRecommendationSystem.java`.
2. Open a terminal and navigate to the file location.
3. Compile the program:
   ```bash
   javac SimpleRecommendationSystem.java
