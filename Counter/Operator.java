class Operator {
    int counter;
    String counterName;
    Operator(int cnt, String name){
        this.counter = cnt;
        this.counterName = name;
    }
    //    Operator(String name){
    Operator(String counterName){
//        this.counter = 0;
//        this.counterName = name;
        this(0, counterName);
    }
    void incrementCounter(int number){
        this.counter += number;
//        return this.counter;
        System.out.println(this.counterName + ": " + this.counter);
    }
    void inrement(){
        this.counter++;
//        return this.counter;
        System.out.println(this.counterName + ": " + this.counter);
    }
    void decrement(){
        this.counter--;
//        return this.counter;
        System.out.println(this.counterName + ": " + this.counter);
    }
}