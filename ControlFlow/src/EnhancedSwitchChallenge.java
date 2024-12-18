public class EnhancedSwitchChallenge {
    public static void main(String[] args) {
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);


    }
    public static void printDayOfWeek(int day){
        switch(day){
            case 0 -> System.out.println("Sunday is " + day + "st day of the week.");
            case 1 -> System.out.println("Monday is " + day + "nd day of the week.");
            case 2 -> System.out.println("Tuesday is " + day + "rd day of the week.");
            case 3 -> System.out.println("Wednesday is "  + day + "th day of the week.");
            case 4 -> System.out.println("Thursday is "  + day + "th day of the week.");
            case 5 -> System.out.println("Friday is "  + day + "th day of the week.");
            case 6 -> System.out.println("Saturday is "  + day + "th day of the week.");
            default -> System.out.println("Invalid Day");
        }
    }
    public static void printWeekDay(int day){
        String weekDay = "Invalid Day";

        if(day == 0){
               weekDay = "Sunday";

        }
        else if(day == 1){
            weekDay = "Monday";
        }
        else if(day == 2){
            weekDay = "Tuesday";
        }
        else if(day == 3){
            weekDay = "Wednesday";
        }
        else if(day == 4){
            weekDay = "Thursday";
        }
        else if(day == 5){
            weekDay = "Friday";
        }
        else if(day == 6){
            weekDay = "Saturday";
        }
        System.out.println(day + " is " + weekDay);
    }
}
