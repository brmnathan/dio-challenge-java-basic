import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account information");
        System.out.print("Account number: ");
        int number = sc.nextInt();
        System.out.print("Client name: ");
        sc.nextLine();
        String clientName = sc.nextLine();
        System.out.print("Account agency: ");
        String agency = sc.nextLine();

        Account account01 = new Account(number, clientName, agency);

        System.out.print("Initial deposit: ");
        Double value = sc.nextDouble();
        account01.deposit(value);

        System.out.println();
        System.out.println(account01);

        sc.close();
    }
}
