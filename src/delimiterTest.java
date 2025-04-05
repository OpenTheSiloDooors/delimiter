// Coded by Jacob Aaron Espinoza @ jacob.espinoza@malad.us
// For CTE Software Development 2
// Instructor: Mr. Gross
// This program gets five variables of a game five times and displays the average score

import java.io.*;
import java.util.Scanner;

public class delimiterTest {
    public static void main(String[] args) throws IOException {

        String fileName = "games.txt"; // Name of the file to write to as a string
        BufferedReader br; // Declaring BufferedReader

        // Declaring variables
        String name = "";
        int score = 0;
        short releaseYear = 0;
        String timeToBeat = "";
        int achievementCount = 0;

        int scoreSum = 0;

        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter f_writer = new FileWriter(fileName); // Creating FileWriter object with the name of the file
            for (int i = 0; i < 5; i++) { // Loop 5 times
                System.out.println("Enter name of the game: ");
                name = scanner.nextLine(); // Getting user input for name
                System.out.println("Enter the Metacritic rating of the game: ");
                score = Integer.parseInt(scanner.nextLine()); // Getting user input for score. Parsing it as an int
                System.out.println("Enter the release year of the game: ");
                releaseYear = Short.parseShort(scanner.nextLine()); // Getting user input for release year. Parsing it as a short
                System.out.println("Enter how long it takes to beat the game (xxh xxmin): ");
                timeToBeat = scanner.nextLine(); // Getting user input for time to beat
                System.out.println("Enter the number of achievements in the game: ");
                achievementCount = Integer.parseInt(scanner.nextLine()); // Getting user input for achievement count. Parsing it as an int
                f_writer.write(name); // Writing the name to the file
                f_writer.write("\n"); // Writing a new line in the file
                f_writer.write(String.valueOf(score)); // Writing the value of score to the file
                f_writer.write("\n");
                f_writer.write(String.valueOf(releaseYear)); // Writing the value of release year to the file
                f_writer.write("\n");
                f_writer.write(timeToBeat); // Writing the value of time to beat to the file
                f_writer.write("\n");
                f_writer.write(String.valueOf(achievementCount)); // Writing the value of achievement count to the file
                f_writer.write("\n");
            }
            f_writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            br = new // Creating BufferedReader object
                    BufferedReader(new FileReader(fileName)); // Name of file to open
            for (int i = 0; i < 5; i++) {
            name = br.readLine(); // Reading the name from the file
            score = Integer.parseInt(br.readLine()); // Reading the score from the file as an int
            scoreSum += score; // Adding the score to the score sum
            releaseYear = Short.parseShort(br.readLine()); // Reading the release year from the file as a short
            timeToBeat = br.readLine(); // Reading the time to beat from the file
            achievementCount = Integer.parseInt(br.readLine()); // Reading the achievement count from the file as an int

            // Printing the values to the console
            System.out.println("Name: " + name);
            System.out.println("Score: " + score);
            System.out.println("Release year: " + releaseYear);
            System.out.println("Time to beat: " + timeToBeat);
            System.out.println("Achievement count: " + achievementCount);
            System.out.println("------------------------------");
            }
            System.out.println("Average score: " + (scoreSum / 2)); // Print the average score

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Make sure the file is one directory above the Java file."); // Print error message if there is a FileNotFoundException
        }
    }
}
