public class SwitchStatement {
    public static void main(String[] args) {
        int value = 4;

//        switch(value){
//            case 1:
//                System.out.println("The value was 1");
//                break;
//            case 2:
//                System.out.println("The value was 2");
//                break;
//            case 3:
//                System.out.println("The value was 3");
//                break;
//            default:
//                System.out.println("Enter the Correct Value");
//        }


        switch(value){
            case 1 -> System.out.println("The value was 1");
            case 2 -> System.out.println("The value was 2");
            case 3,4,5 -> System.out.println("The value was " + value);
            default -> System.out.println("Invalid Value");
        }
        String month = "May";
        System.out.println(month + " is in the " + getQuater(month));
    }
    public static String getQuater(String month){
//        switch(month){
//            case "January":
//            case "February":
//            case "March":
//                return "1st Quater";
//            case "April":
//            case "May":
//            case "June":
//                return "2nd Quater";
//            case "July":
//            case "August":
//            case "September":
//                return "3rd Quater";
//            case "October":
//            case "November":
//            case "December":
//                return "4th Quater";
//        }
//        return "None";

        return switch (month){
            case "January", "February", "March" -> {yield "1st Quater";}
            case "April", "May", "June" -> "2nd Quater";
            case "July", "August","September" -> "3rd Quater";
            case "October", "November", "December" ->"4th Quater";
            default -> "None";
        };
    }
}
