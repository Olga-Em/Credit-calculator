public class CreditPaymentService {
    public double calculate(int creditTerm, int amount) {
       // double payment;
        int months = creditTerm * 12;
        double monthlyInterestRate = 9.99 / 100 / 12;
        double a = 1 + monthlyInterestRate;
        double creditPayment = amount * (monthlyInterestRate + (monthlyInterestRate / (Math.pow( a, months) - 1)));
        return creditPayment;
    }
}
