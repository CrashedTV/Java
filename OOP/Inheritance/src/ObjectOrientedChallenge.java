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

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
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
            System.out.println("your remaining balance is $"+ accountBalance);
        }

    }
}

public class ObjectOrientedChallenge {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccountBalance(50000.55);
//        acc.setAccountNumber("09876567890");
//        acc.setCustomerName("Ayush Shrestha");
//        acc.setEmail("ayush.xtha01@gmail.com");
//        acc.setPhone("9869377135");

//        System.out.println("User Details\n\t"+acc.getCustomerName());
        acc.depositFund(400);
        acc.withdrawFund(60000);


    }
}
