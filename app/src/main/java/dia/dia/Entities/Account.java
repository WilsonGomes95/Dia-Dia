package dia.dia.Entities;
import dia.dia.Exceptions.BusinessException;

public class Account {
    private String number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    
    public Account(){}
    
    public Account(String number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public String getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double deposit){
        if (deposit <= 0){
            throw new BusinessException("O valor do depósito deve ser maior que zero.");
        }
        this.balance += deposit;

    }

    public void withdraw(double withdraw){
        if (withdraw > this.getBalance()){
            throw new BusinessException("Valor de saque maior que o saldo.");
        }
        if (withdraw <= 0){
            throw new BusinessException("O valor do saque deve ser maior que zero.");
        }

        this.balance -= withdraw;

    }


    @Override
    public String toString(){
        return "Number: " + this.getNumber() + "\n" +
                "Holder: " + this.getHolder() + "\n" +
                "Balance: " + String.format("%.2f", this.getBalance()) + "\n" +
                "Withdraw limit: " + String.format("%.2f", this.getWithdrawLimit());
    }

    

}
