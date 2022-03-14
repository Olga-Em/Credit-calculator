public class CreditPaymentService {
    public int calculate(int creditTerm, int amount) {
        double payment;
        int months = creditTerm * 12;
        double p = 9.99 / 100 / months;
        double b = 1 + p;
        PowService pow2 = new PowService();
        double powMonth = pow2.pow(b, months);

        payment = amount * (p + (p / (powMonth - 1)));

        int creditPayment = (int) payment;

        return creditPayment;
    }
}
