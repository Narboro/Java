package Task20_1.model;

public class File {

    public String name;
    public Type type;
    public int size;

    public File(String name, Type type, int size){
        this.name = name;
        this.type = type;
        this.size = size;
    }
    public File(){
        this.name = null;
        this.type = null;
        this.size = 0;
    }
}

