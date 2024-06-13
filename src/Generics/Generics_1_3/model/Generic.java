package Generics.Generics_1_3.model;

import java.util.Objects;
public class Generic<T>{
    public <T> void findValue(T[] array, T value) throws ClassNotFoundException{
        for(T i : array){
            if(Objects.equals(i, value)){
                System.out.println("Value found.");
                System.out.println(i);
            }
        }
        throw new ClassNotFoundException("Value not found");
    }
}
