package Task21.module;

public final class ImmutableMachine {
    private final String color;
    private final String brand;

    public ImmutableMachine(String color, String brand){
        this.color = color;
        this.brand = brand;
    }

    public String getColor(){
        return this.color;
    }
    public String getBrand(){
        return this.brand;
    }

}
