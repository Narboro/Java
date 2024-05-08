package Task21;

import java.util.Scanner;

import Task21.module.ImmutableMachine;
import Task21.module.Machine;

public class Main {
    public static void main(String[] args) {
        Machine volga = new Machine("green", "volga", "2", "U7980MK");
        Machine moskvich = new Machine(new ImmutableMachine("red", "moskvich"), "s", "A273MK197");
        Machine huyndai = new Machine("black", "huyndai", "g", "1992879");
        Machine[] machines = new Machine[]{volga, moskvich, huyndai};

        checkEquality(machines);
    }

    public static void checkEquality(Machine[] machines){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car color: ");
        String carColor = scanner.nextLine();
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car number: ");
        String carNumber = scanner.nextLine();
        scanner.close();

        Machine tester = new Machine(carColor, brand, model, carNumber);
//        System.out.println("Tester hash:\n" + tester.hashCode());

        for(Machine i : machines){
            boolean res = equals(i, tester);
            if(res){
                System.out.println("СОВПАДЕНИЕ КЛАССА");
                return;
            } else {
                System.out.println("НЕТ СОВПАДЕНИЯ");
            }
//            System.out.println(i.getClass());
//            System.out.println(i.hashCode());
        }
    }

    public static boolean equals(Object o, Machine tester) {
//        if (this == o) { //Гарантируем рефлексивность
//            return true;
//        }
        if (o == null) {
            return false;
        }
//        if (!getClass().equals(o.getClass())) { //Возможны вариации. Использование instanceof или сравнение типа параметра с явно вызванным литералом класса: o.getClass().equals(SthClass.class)
//            return false;
//        }
        Machine mClass = (Machine) o;
//        if((mClass.model == tester.model) && (mClass.brand == tester.brand)){
//        if((mClass.immutableMachine.equals(tester.immutableMachine)) && (mClass.model.equals(tester.model))){
//            return true;
//        }
//        return false;
        return ((mClass.immutableMachine.getColor().equals(tester.immutableMachine.getColor())) && (mClass.immutableMachine.getBrand().equals(tester.immutableMachine.getBrand())) && (mClass.model.equals(tester.model)));
    }
}
