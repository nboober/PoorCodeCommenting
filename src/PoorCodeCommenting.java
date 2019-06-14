import java.util.Scanner;

public class PoorCodeCommenting {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Variables
        double loan = 0;
        double interest = 0;
        double monthly_pay = 0;
        double balance = 0;
        int term;

        //Assigning Variables through the scanner
        System.out.printf("Enter the loan amount: ");
        loan = keyboard.nextDouble();

        System.out.printf("Enter the interest rate on the loan: ");
        interest = keyboard.nextInt();

        System.out.printf("Enter the term (years) for the loan payment: ");
        term = keyboard.nextInt();

        System.out.printf("\n======================================\n");
        keyboard.close();

        //monthly_pay is set equal to the returned value in processSomething
        monthly_pay = processSomething(loan, interest, term);

        //balance is set equal to monthly_pay times the term
        balance = -(monthly_pay*(term*12));

        //Formatting Output String and double variable for Balance Owed and Minimum Monthly Payments
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthly_pay);
    }

    //A new class that returns the result value so it can be used elsewhere
    public static double processSomething(double loan, double interest, int term) {
        // calculates the monthly payment 
        double rate = (interest/ 100) / 12;
        double base = (loan + rate);
        double months = term* 12;
        double result = 0.0;
        result = ((rate * loan) / (loan - Math.pow(base, -months)));

        return result;
    }
}