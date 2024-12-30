import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minnum = 0;
        int maxnum = 0;
        int count = 0;

        while(true){
            System.out.println("Enter any number and any character to exit: ");
            String number = scan.nextLine();
            try{
                int num = Integer.parseInt(number);
                if(num < minnum) {
                    minnum = num;
                }else if(num > maxnum){
                    maxnum = num;
                }
            } catch (NumberFormatException e) {
                break;
            }
            count++;
        }
        if(count > 0 ){
            System.out.println("Minimum Number is " + minnum + " and Maximum Number is " + maxnum);
        }else{
            System.out.println("Invalid Entry.");
        }
    }
}
