public class Counter {
    public static void main(String[] args) {
        Operator oddCouner = new Operator("Odd");
        Operator evenCouner = new Operator("Even");

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                evenCouner.inrement();
            } else {
                oddCouner.inrement();
            }
        }
    }
}

//class Operator {
//    int counter;
//    String counterName;
//    Operator(int cnt, String name){
//        this.counter = cnt;
//        this.counterName = name;
//    }
////    Operator(String name){
//    Operator(String counterName){
////        this.counter = 0;
////        this.counterName = name;
//        this(0, counterName);
//    }
//    void incrementCounter(int number){
//        this.counter += number;
////        return this.counter;
//        System.out.println(this.counterName + ": " + this.counter);
//    }
//    void inrement(){
//        this.counter++;
////        return this.counter;
//        System.out.println(this.counterName + ": " + this.counter);
//    }
//    void decrement(){
//        this.counter--;
////        return this.counter;
//        System.out.println(this.counterName + ": " + this.counter);
//    }
//}
