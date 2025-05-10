
package dia.dia;

import java.util.InputMismatchException;
import java.util.Scanner;

import dia.dia.Entities.Account;
import dia.dia.Exceptions.BusinessException;


public class App {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            String number = scanner.nextLine();

            System.out.print("Holder: ");
            String holder = scanner.nextLine();
            
            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();

            System.out.print("withdrawLimit: ");
            double withdrawLimit = scanner.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double withdraw = scanner.nextDouble();
            
            account.withdraw(withdraw);


            

        }
        catch (BusinessException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
        System.out.println("Input error: Please enter a valid number.");
        }
        catch (NullPointerException e) {
        System.out.println("Unexpected error: A null value was encountered.");
        }
        catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        
        
        
        scanner.close();
    }

}
