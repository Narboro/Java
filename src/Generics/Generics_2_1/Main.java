package Generics.Generics_2_1;

import Generics.Generics_2_1.model.Generic;

public class Main {
    public static void main(String[] args) {
        Generic<Integer> generic1 = new Generic<>(1111);
        System.out.println(useGeneric(generic1, 9999));

        Generic<String> generic2 = new Generic<>();
        System.out.println(useGeneric(generic2, "Test"));
    }

    public static <T> T useGeneric(Generic<T> genericClass, T defaultValue){
        return genericClass.getVariable() != null ? genericClass.getVariable() : defaultValue;
    }
}
