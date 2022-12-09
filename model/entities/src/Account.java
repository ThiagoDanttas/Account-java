public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    // Constructors

    public Account(){}
    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // Getters & Setters

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    // Methods
    public void deposit(Double value){
        this.balance += value;
    }

    public void withdraw(Double value) throws MainException{

        if(this.withdrawLimit < value){
            throw new MainException("Withdraw error: The amount exceeds withdraw limit");
        }

        if(value > this.balance) {
            throw new MainException("Withdraw error: Not enough balance");
        } else {
            this.balance -= value;
            System.out.println("New balance: " + String.format("%.2f", this.balance));
        }

    }

    @Override
    public String toString(){
        return "Number: "
                + this.getNumber() + ", "
                +"Holder: "
                + this.getHolder() + ", "
                +"Balance: "
                + String.format("%.2f",this.getBalance()) + ", "
                +"Withdraw Limit: "
                + String.format("%.2f", this.getWithdrawLimit());
    }


}