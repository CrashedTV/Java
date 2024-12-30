import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2024;

        //System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi " + name + ", Thanks for taking the course.");
        String dateOfBirth = System.console().readLine("What year you were born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "You are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, What's your name?");
        String name = scan.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking course.");

        System.out.println("What year you were born?");
        String dateOfBirth = scan.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "You are " + age + " years old";
    }
}
