public class CodingExercise {
    public static void main(String[] args) {
        checkNumber(-4);
        checkNumber(0);
        checkNumber(4);
    }
    public static void checkNumber(int number) {
        System.out.println((number > 0) ? "Positive" : ((number < 0) ? "Negative" : "Zero"));
    }
}
