package Generics.Generics_1_1;

public class GenericClass {
    public static void main(String[] args) {
        Generic1<Byte> generic1 = new Generic1<>((byte)4, 5);
        Generic1<Short> generic2 = new Generic1<>((short)4, 5);
        Generic1<Integer> generic3 = new Generic1<>(4, 5);
        Generic1<Long> generic4 = new Generic1<>(4L, 5);
        Generic1<Double> generic5 = new Generic1<>(4d, 5);
        Generic1<Float> generic6 = new Generic1<>(4f, 5);

        System.out.println("Result is: ");
        System.out.println(generic1.raiseParameter());
        System.out.println(generic2.raiseParameter());
        System.out.println(generic3.raiseParameter());
        System.out.println(generic4.raiseParameter());
        System.out.println(generic5.raiseParameter());
        System.out.println(generic6.raiseParameter());
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