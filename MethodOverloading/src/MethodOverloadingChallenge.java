public class MethodOverloadingChallenge {

    public static void main(String[] args) {

        System.out.println("Centimeter = " + convertToCentimeters(32));
        System.out.println("Centimeter = " + convertToCentimeters(5,8));

    }
    public static double convertToCentimeters(int inches){
        double centimeter = inches * 2.54;
        return centimeter;
    }
    public static double convertToCentimeters(int feet, int inches){
        double height = (feet * 12 + inches) * 2.54;
        return height;
    }
}
