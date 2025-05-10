
package dia.dia;

import java.util.Scanner;

import dia.dia.Entities.Account;

public class App {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter account data");
        System.out.println("Number: ");
        String number = scanner.nextLine();

        System.out.println("Holder: ");
        String holder = scanner.nextLine();
        
        System.out.println("Initial balance: ");
        double balance = scanner.nextDouble();

        System.out.println("withdrawLimit: ");
        double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println("Enter amount for withdraw: ");
        double withdraw = scanner.nextDouble();
        try {
            account.withdraw(withdraw);

        }
        catch (IllegalArgumentException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        


        
        
        
        scanner.close();
    }

}
