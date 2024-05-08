package Task20_1;

import java.util.Scanner;
import Task20_1.model.Type;
import Task20_1.model.File;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("Kirkor", Type.audio, 2024);
        File file2 = new File("Vacation", Type.picture, 108);
        File file3 = new File("Notes", Type.text, 55);
        File file4 = new File("Day1", Type.video, 9000);
        File[] files = new File[] {file1, file2, file3, file4};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String name = scanner.nextLine();
        scanner.close();

        for(File f : files){
//            if(name.equals(f.name)){
            if(f.name.equals(name)){
                System.out.printf("Found file:%nName: %s%nType: %s%nSize: %s%n", f.name, f.type, f.size);
                return;
            }
        }
        System.out.println("Nothing found");
    }
}
