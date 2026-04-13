//The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account holders, i.e., customers.
import java.util.Scanner;

public class EMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accNo = sc.nextInt();
        double balance = sc.nextDouble();
        double salary = sc.nextDouble();
        String loanType = sc.next();
        double reqLoan = sc.nextDouble();
        int reqEMI = sc.nextInt();

        if(accNo < 1000 || accNo> 9999 || accNo / 1000 != 1) {
            System.out.println("Invalid account number");
            return;
        }

        double eligibleLoan = 0;
        int eligibleEMI = 0;

        if(loanType.equals("Car")) {
            if(salary > 25000) {
                eligibleLoan = 500000;
                eligibleEMI = 36;
            }

        }

        else if(loanType.equals("House")) {
            if(salary > 50000) {
                eligibleLoan = 6000000;
                eligibleEMI = 60;
            }
        }
        else if(loanType.equals("Business")) {
            if(salary > 75000) {
                eligibleLoan = 7500000;
                eligibleEMI = 84;
            }
        }

        else {
            System.out.println("Invalid loan type");
            return;
        }

        if(eligibleLoan == 0) {
            System.out.println("Not eligible for loan");
        }

        else if(reqLoan <= eligibleLoan && reqEMI <= eligibleEMI) {
            System.out.println("Account number: " +accNo);
            System.out.println("Eligible for loan upto: " +eligibleLoan);
            System.out.println("Requested laon amount: "+reqLoan);
            System.out.println("Eligible EMI: "+eligibleEMI);
            System.out.println("Requested EMI: "+reqEMI);
        }

        else {
            System.out.println("The bank don't have enough money");
        }

    }
}