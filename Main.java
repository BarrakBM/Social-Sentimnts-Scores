import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static Map<String, Double> buildTable(String filename) {
        Map<String, Double> sentimentScores = new HashMap<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                sentimentScores.put(parts[0], Double.parseDouble(parts[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sentimentScores;
    }

    public static int ranking(double score) {
        if (score < -5) return 1;
        else if (score < -1) return 2;
        else if (score < 1) return 3;
        else if (score < 5) return 4;
        else return 5;
    }

    public static double countScores(Map<String, Double> sentiment, String reviewFile) {
        double totalScore = 0.0;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(reviewFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (sentiment.containsKey(word)) {
                        totalScore += sentiment.get(word);
                        System.out.printf("%s: %.2f, %.2f%n", word, sentiment.get(word), totalScore);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalScore;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> sentiment = buildTable("socialsent.csv");
        System.out.println("Enter the name of the review file: ");
        String reviewFile = scanner.nextLine();
        double score = countScores(sentiment, reviewFile);
        int reviewRanking = ranking(score);
        System.out.printf("%n%s score: %.2f%n", reviewFile, score);
        System.out.printf("%s Stars: %d%n", reviewFile, reviewRanking);
    }
}
