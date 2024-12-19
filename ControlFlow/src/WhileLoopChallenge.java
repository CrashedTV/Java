public class WhileLoopChallenge {
    public static void main(String[] args) {
        int start = 4;
        int end = 20;
        int count = 0;
        int odd = 0;
        while(start<=end && count < 5){
            start++;
            if(!isEvenNumber(start)){
                odd++;
                continue;
            }
            System.out.println(start + " is prime number.");
            count++;
        }
        System.out.println("Count of Odd : " + odd);
        System.out.println("Count of Even : " + count);
    }
    public static boolean isEvenNumber(int start){

        return start % 2 == 0;
    }
}
