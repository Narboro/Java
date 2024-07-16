package Generics.Generics_2_1.model;

public class Generic<T> {
    private T variable;

    public Generic(T variable){
        this.variable = variable;
    }

    public Generic(){
        this.variable = null;
    }

    public T getVariable(){
        return variable;
    }
}
