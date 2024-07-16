package IO.Task02;

import IO.Task01.Model.Car;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("./src/IO/Task01/carCatalog.txt");
            FileOutputStream fos = new FileOutputStream("./src/IO/Task02/Cars.txt")){

            byte[] buffer = new byte[256];

            int count;
            while((count = fin.read(buffer)) != -1){
                fos.write(buffer, 0, count);
            }
            System.out.println("The file has been written");
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
