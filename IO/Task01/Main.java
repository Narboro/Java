package IO.Task01;

import IO.Task01.Model.Car;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car[] cars = initCars();
        try(FileOutputStream fos = new FileOutputStream("./src/IO/Task01/carCatalog.txt")){
            for(Car car : cars){
                byte[] buffer = car.toString().getBytes();
                fos.write(buffer, 0, buffer.length);
                fos.write('\n');
            }
            System.out.println("The file has been written");
        } catch(IOException e){
            throw new RuntimeException("Error of file writing", e);
        }
    }

    private static Car[] initCars() {
        Car car1 = new Car("RR-111-RR", 2015, "green", true);
        Car car2 = new Car("RR-222-RR", 2016, "red", true);
        Car car3 = new Car("RR-333-RR", 2017, "yellow", true);
        Car car4 = new Car("RR-444-RR", 2018, "black", true);
        Car car5 = new Car("RR-555-RR", 2018, "magenta", true);
        Car car6 = new Car("RR-666-RR", 2018, "purple", true);
        Car car7 = new Car("RR-777-RR", 2018, "orange", true);
        Car car8 = new Car("RR-888-RR", 2018, "white", true);
        Car car9 = new Car("RR-999-RR", 2018, "olive", true);
        Car car10 = new Car("RR-000-RR", 2018, "yellow", true);

        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }
}
