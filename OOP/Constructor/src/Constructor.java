class Account{
    private String accountNumber ;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phone;

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Account(){
        System.out.println("An empty constructor is called.");
    }

    public Account(String accountNumber,double accountBalance, String customerName, String email, String phone){
        System.out.println("Constructor with parameter is called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }


    public void depositFund(double depositAmount){
        accountBalance +=depositAmount;
        System.out.println("Deposit of $" + depositAmount + ". Your new Balance is $" +accountBalance);
    }
    public void withdrawFund(long withdrawAmount){
        if((accountBalance - withdrawAmount) <= 0)
            System.out.println("Insufficient Balance");
        else{
            accountBalance -= withdrawAmount;
            System.out.println("Your remaining balance is $"+ accountBalance);
        }

    }
}

public class Constructor {
    public static void main(String[] args) {
        Account acc = new Account("09876545654",98000,"Ayush Shrestha", "ayush.xtha01@gmail.com","9869377135");
//        acc.setAccountBalance(50000.55);
//        acc.setAccountNumber("09876567890");
//        acc.setCustomerName("Ayush Shrestha");
//        acc.setEmail("ayush.xtha01@gmail.com");
//        acc.setPhone("9869377135");

        System.out.println("User Details\n\t Name : "+acc.getCustomerName()+"\n\t Email : "+acc.getEmail() +"\n\t Phone: "+acc.getPhone());
        acc.depositFund(400);
        acc.withdrawFund(60000);


    }
}