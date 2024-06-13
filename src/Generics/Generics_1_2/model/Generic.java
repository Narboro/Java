package Generics.Generics_1_2.model;

public class Generic<T> {
    private final T val;

    public Generic(T value){
        this.val = value;
    }

    public Boolean isNull(){
        return this.val == null;
    }
}
