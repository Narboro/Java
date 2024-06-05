package NestedClasses_1.AnonymousClass;

import NestedClasses_1.AnonymousClass.model.EquilateralShape;

import java.util.Scanner;

public class Main {
    String EMPTY_ELEMENT = " ";
    String EMPTY_STRING = "";
    char NEW_LINE_SYMBOL = '\n';
    public static final String TRIANGLE_HORIZONTAL_SIDE_ELEMENT = "--";
    public static final String TRIANGLE_LEFT_SIDE_ELEMENT = "/";
    public static final String TRIANGLE_RIGHT_SIDE_ELEMENT = "\\";
    public static final String RECTANGLE_HORIZONTAL_ELEMENT = "-";
    public static final String RECTANGLE_VERTICAL_ELEMENT = "|";

//    private final int length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();
        while(length < 1){
            System.out.print("Shape's length should be more than 1\n");
            System.out.print("Enter shape's length: ");
            length = scanner.nextInt();
        }

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int shapeType = scanner.nextInt();
        while(shapeType != 1 && shapeType != 2){
            System.out.println("Incorrect input. Shape's type should be 1 or 2.");
            System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
            shapeType = scanner.nextInt();
        }
        scanner.close();

        String shapeString = createShapeString(length, shapeType);
        System.out.println(shapeString);
    }

    private static String createShapeString(int length, int type) {
        EquilateralShape shape;

        switch (type) {
            case 1:
                shape = createSquare(length);
                break;
            case 2:
                shape = createTriangle(length);
                break;
            default:
                return "Unknown shape";
        }

        return shape.createShapeString();
    }

    private static EquilateralShape createTriangle(int length) {
        return new EquilateralShape() {
            @Override
            public int getLength() {
                return length;
            }

            @Override
            public String createShapeString() {
                String triangle = EMPTY_STRING;

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length - i; j++) {
                        triangle += EMPTY_ELEMENT;
                    }

                    triangle += TRIANGLE_LEFT_SIDE_ELEMENT;

                    for (int j = 0; j < i * 2; j++) {
                        triangle += EMPTY_ELEMENT;
                    }

                    triangle += TRIANGLE_RIGHT_SIDE_ELEMENT + NEW_LINE_SYMBOL;
                }

                triangle += " ";

                for (int i = 0; i < length; i++) {
                    triangle += TRIANGLE_HORIZONTAL_SIDE_ELEMENT;
                }

                return triangle;
            }
        };
    }

    private static EquilateralShape createSquare(int length){
        return new EquilateralShape(){
//            public EquilateralShape(int length) {
//                this.length = length;
//            }
//            this.length = length;

            @Override
            public int getLength() {
                return length;
            }

            @Override
            public String createShapeString() {
                String horizontalLine = createHorizontalLine(length);
                String verticalLines = createVerticalLines(length);

                return horizontalLine + verticalLines + horizontalLine;
            }

            private String createHorizontalLine(int length) {
                String horizontalLine = EMPTY_ELEMENT;

                for (int i = 0; i < length; i++) {
                    horizontalLine += RECTANGLE_HORIZONTAL_ELEMENT;
                }

                horizontalLine += EMPTY_ELEMENT + NEW_LINE_SYMBOL;

                return horizontalLine;
            }

            private String createVerticalLines(int length) {
                String verticalLinesUnit = getVerticalLinesUnit(length);

                String verticalLines = EMPTY_STRING;

                for (int i = 0; i < length; i++) {
                    verticalLines += verticalLinesUnit;
                }

                return verticalLines;
            }

            private String getVerticalLinesUnit(int length) {
                String verticalLinesUnit = RECTANGLE_VERTICAL_ELEMENT;

                for (int i = 0; i < length; i++) {
                    verticalLinesUnit += EMPTY_ELEMENT;
                }

                verticalLinesUnit += RECTANGLE_VERTICAL_ELEMENT + NEW_LINE_SYMBOL;

                return verticalLinesUnit;
            }
        };
    }

}
