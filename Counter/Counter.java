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
