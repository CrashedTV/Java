public class IfElseChallenge {
    public static void main(String[] args) {

        calculateScore(true, 800 , 5, 100); // hamile variable pani rakhna sakchau

//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        boolean newGameOver = true;
//        int newFinalScore = newScore;
//
//        if(newGameOver){
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("New Final Score = " + newFinalScore);
//        }

        calculateScore(true, 10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Final Score = " + finalScore);
        }

    }
}
