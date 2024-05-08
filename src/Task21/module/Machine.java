package Task21.module;

//import  Task21.module.ImmutableMachine;
public class Machine {
    public String model;
    public String brand;
    public String carNumber;
    public ImmutableMachine immutableMachine;

    public Machine(String color, String brand, String model, String carNumber){
        this(new ImmutableMachine(color, brand), model, carNumber);
    }
    public Machine(ImmutableMachine immutableMachine, String model, String carNumber){
        this.immutableMachine = immutableMachine;
        this.model = model;
        this.carNumber = carNumber;
    }
    public Machine(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public Machine(String model){
        this.model = model;
    }
}
