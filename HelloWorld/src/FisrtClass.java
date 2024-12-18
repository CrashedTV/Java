public class FisrtClass {
    public static void main(String[] args) {
        System.out.println("Hello Ayush!");

        boolean isBoy = true;
        if(isBoy == true)
            System.out.println("It is a Boy.");
            System.out.println("It's pronoun is He.");

        int topScore = 100; // Since, variable is being assigned Lower Camel Case is used.
        if(topScore >= 100){
            System.out.println("You got the full marks.");
        }
        int secondTopScore = 90;
        if(topScore > secondTopScore && topScore >= 100){
            System.out.println("You got greater than Second Top Score and Less Than Full Marks");
        }
    }
}
