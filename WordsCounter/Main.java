package WordsCounter;

import WordsCounter.module.StringAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String stringLine = scanner.nextLine();
        scanner.close();
        int counts = new StringAnalyzer().analyzeLine(stringLine);

        System.out.printf("There are %d unique words\n", counts);
    }
}