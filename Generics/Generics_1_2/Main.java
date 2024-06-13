package Generics.Generics_1_2;

import Generics.Generics_1_2.model.Generic;

public class Main {
    public static void main(String[] args) {
        Generic genericNotNull = new Generic(new Object());
        System.out.println(genericNotNull.isNull());
        Generic genericNull = new Generic(null);
        System.out.println(genericNull.isNull());
    }
}
