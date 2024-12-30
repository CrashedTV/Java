import java.util.Scanner;

public class ReadingInputUserChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        double sum  = 0;
        while (count <= 5){
            System.out.println("Enter the number (" + count+"): " );
            String number = scan.nextLine();
            try{
                double num =Double.parseDouble(number);
                sum += num;
                count++;

            }
            catch (NumberFormatException e){
                System.out.println("Only numbers allowed.");
            }
        }
        System.out.println("The sum is " +sum);
    }

}
