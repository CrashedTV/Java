public class MethodChallenge {

    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Ayush",  position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Gaurav",  position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Mohan",  position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Hukum",  position);


        position = calculateHighScorePosition(25);
        displayHighScorePosition("Babin",  position);


    }
    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        int result = 4;
        if (score >= 1000) {
            result = 1;
        }
        else if (score >= 500 && score < 1000){
            result = 2;
        }
        else if (score >= 100 && score < 500){
            result = 3;
        }
        return result;
    }
}
