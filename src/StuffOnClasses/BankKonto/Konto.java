package StuffOnClasses.BankKonto;

public class Konto {
    private int accountNo;
    private String owner;
    private double balance;

    //--constructors:--
    public Konto(){
        accountNo = 0;
        owner = "No Name Given";
        balance = 0;
    }
    public Konto(int accountNo, String owner){
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = 0;
    }
    public Konto(int accountNo, String owner, double balance){
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    //--getters and setters:--
    //accountNo
    public int getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(int accountNo){
        this.accountNo = accountNo;
    }

    //owner
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    //balance
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    //--normal methods:--
    public double deposit(double dep){
        //we dont like it when someone deposits a negative amount
        if (dep < 0){
            return -1;
        }else {
           balance += dep;
           return balance;
        }
    }

    public double withdraw(double wit){
        if(wit < 0){
            return -1;
        } else if (wit > balance) {
            return -1;
        }else {
            balance -= wit;
            return balance;
        }
    }

    //to string method. overides the method inherited from all classes. if the object gets printed, this gets
    //called and the result gets printed.
    @Override
    public String toString(){
        return "Account No: " + accountNo + "Account Owner: " + owner + "Balance: " + balance + " kr";
    }
}
