package Task20_3;

import Task20_3.model.EquilateralShape;
import Task20_3.model.EquilateralTriangle;
import Task20_3.model.Square;
import Task20_3.service.InputValidationException;

import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task1">...</a>
 * используя абстрактный класс.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int shapeType = scanner.nextInt();

        scanner.close();

//        if (length < 1 || (shapeType != 1 && shapeType != 2)) {
//            System.out.println("Incorrect input.");
//            return;
//        }

        String shapeString = createShapeString(length, shapeType);
        System.out.println(shapeString);
    }

    private static String createShapeString(int length, int type) {
        EquilateralShape shape;

        try{
            switch (type) {
                case 1:
                    shape = new Square(length);
                    break;
                case 2:
                    shape = new EquilateralTriangle(length);
                    break;
                default:
//                    return "Unknown shape";
                    throw new InputValidationException("Получен неверный ввод", type);
            }
        } catch (InputValidationException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Полученный ввод: " + ex.getInput());
            return "";
        }

        return shape.createShapeString();
    }
}
