public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(7898 ));
        System.out.println(getDurationString(-7898 ));
        System.out.println(getDurationString(69,3600 ));
        System.out.println(getDurationString(965,36 ));
    }

    public static String getDurationString(int seconds) {
        if(seconds>=0) {
            int min = seconds / 60;
            int hr = min / 60;

            int remainingMinutes = min % 60;
            int remainingSeconds = seconds % 60;
            return hr + "h" + remainingMinutes + "m" + remainingSeconds + "s";
        }
        return "Value must be positive";
    }
    public static String getDurationString(int minutes, int seconds) {
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hr = minutes / 60;

            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            return hr + "h" + remainingMinutes + "m" + remainingSeconds + "s";
        }
        return "Value must be positive and Less Than 60 for seconds only";
    }
}
