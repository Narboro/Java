package Generics.Generics_1_3;

import Generics.Generics_1_3.model.Generic;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Integer[] list = {1, 2, 3, 4, 5, 50, 100, 150, 500, 1000};
        Generic<Integer> genericClass = new Generic<>();
        genericClass.findValue(list, 100);
        genericClass.findValue(list, 80);
    }
}
