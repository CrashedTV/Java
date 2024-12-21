public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2024;
        String dateOfBirthString = "2003";
        int dateOfBirth = Integer.parseInt(dateOfBirthString);
        System.out.println("Age : " + (currentYear-dateOfBirth));
    }
}
