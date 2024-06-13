package Generics.Generics_2_2;

public class GenericClass {
    public static void main(String[] args) {
        Generic1<?> generic1 = createGeneric((byte)4, 5);

        System.out.println("Result is: ");
        System.out.println(generic1.raiseParameter());
    }

    public static Generic1<? extends Number> createGeneric(Number param1, Integer param2){
        return new Generic1<>(param1, param2);
    }
}

class Generic1<T extends Number> {
    private T param1;
    private Integer param2;

    Generic1(T param1, Integer param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public T getParam1(){
        return param1;
    }

    public Integer getParam2(){
        return param2;
    }

    public Double raiseParameter() {
        return Math.pow(param1.doubleValue(), param2);
    }
}