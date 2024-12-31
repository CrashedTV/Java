class Customer{
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public Customer(String name, String email) {
        this(name,email,34000);
    }

    public Customer(){
        this("Nobody", "noboby@yahoo.com",9000);
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }
}

public class ConstructorChallenge {
    public static void main(String[] args) {
        Customer customer = new Customer("Ayush Shrestha","ayush.xtha01@gmail.com", 45000 );
        System.out.println(customer.getName() +"\n" + customer.getEmail() + "\n" + customer.getCreditLimit());

        Customer secondCustomer = new Customer("Darshan", "darshan@gmail.com");
        System.out.println(secondCustomer.getName() +"\n" + secondCustomer.getEmail() + "\n"+ secondCustomer.getCreditLimit());

        Customer thirdCustomer = new Customer();
        System.out.println(thirdCustomer.getName() +"\n" + thirdCustomer.getEmail() + "\n"+ thirdCustomer.getCreditLimit());


    }
}
