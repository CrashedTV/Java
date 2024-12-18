public class Sum3And5Challenge {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for(int i = 1 ; count<5 && i <= 1000 ; i++){
            // count < 5 means it will execute this statement until count reaches 5 else it will terminate
            if((i % 3 == 0) && (i % 5 == 0)){
                sum +=i;
                System.out.println("The number that will be divided by 3 and 5 is " + i);
                count++;
            }
        }
        System.out.println("The sum is " + sum);
    }
}
