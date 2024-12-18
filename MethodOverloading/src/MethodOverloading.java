public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("NewScore is " + calculateScore("Ayush",52));
        System.out.println("NewScore is " + calculateScore(76));
    }

    public static int calculateScore(String name, int score){
        System.out.println(name + " scored " +score + " points.");
        return score * 100;
    }
    public static int calculateScore(int score){
        System.out.println("Gaurav scored " +score + " points.");
        return score * 100;
    }
}
