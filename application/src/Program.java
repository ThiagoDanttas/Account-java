import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.println(account);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());
        }
        catch (MainException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid data");
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}