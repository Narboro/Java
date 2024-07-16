package Regex.Task01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(\\+\\d{1})(\\-?\\(?\\d{3}\\)?)(\\-?\\d{3}\\-?\\d{2}\\-?\\d{2})");
        Matcher matcher = pattern.matcher(phone);

        while(!matcher.matches()){
            System.out.print("Invalid phone format\n");
            System.out.print("Enter phone number: ");
            phone = scanner.nextLine();
            matcher = pattern.matcher(phone);
        }

        System.out.print("Phone is valid");
        scanner.close();
    }
}
