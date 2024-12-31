class Car{
    private String make ;
    private String model ;
    private String color ;
    private int doors ;
    private boolean convertible;

    public String describeCar(){
        return make + "\n"+ model + "\n" + color + "\n" + doors + " = Doors\n" + (convertible? false: true);
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible(boolean b) {
        return convertible;
    }

    public String getModel(){
        return model;
    }

    public void setMake(String make){
        if(make == null)
            make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "hyundai", "ford", "mahindra" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Ford");
        car.setModel("i20");
        car.setColor("Black");
        car.isConvertible(true);
        car.setDoors(5);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
//        System.out.println("color = " + car.getColor());
//        System.out.println("convertible = " + car.isConvertible());
//        System.out.println("doors = " + car.getDoors());


        System.out.println(car.describeCar());

    }

}

