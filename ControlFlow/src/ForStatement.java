public class ForStatement {
//    public static void main(String[] args) {
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }
//
//        for(double rate = 2.0 ; rate <= 5.0 ; rate++){
//            System.out.println("10,000 at "+ rate + "% interest rate = " + calculateInterest(10000,rate));
//        }
//    }
//    public static double calculateInterest(double amount, double interestRate){
//        return (amount * (interestRate / 100));
//    }

// Mini Challenge (Video 60)

    public static void main(String[] args) {
        for(double rate = 7.5; rate <= 10.0 ; rate += 0.25){
            double amount = 100;
            System.out.println("$" +amount + " at " + rate + "% interest rate  = " + calculateInterest(amount, rate));
        }
    }
    public static double calculateInterest(double amount, double rate){
        return (amount * (rate / 100));

    }
}
