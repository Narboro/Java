class Operator {
    int counter;
    String counterName;
    Operator(int cnt, String name){
        this.counter = cnt;
        this.counterName = name;
    }
    Operator(String counterName){
        this(0, counterName);
    }
    void incrementCounter(int number){
        this.counter += number;
        System.out.println(this.counterName + ": " + this.counter);
    }
    void inrement(){
        this.counter++;
        System.out.println(this.counterName + ": " + this.counter);
    }
    void decrement(){
        this.counter--;
        System.out.println(this.counterName + ": " + this.counter);
    }
}
