public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;

        int creditTerm = 1;
        int creditTerm2 = 2;
        int creditTerm3 = 3;

        double creditPayment = service.calculate(creditTerm, amount);
        double creditPayment2 = service.calculate(creditTerm2, amount);
        double creditPayment3 = service.calculate(creditTerm3, amount);

        System.out.println((int) creditPayment);
        System.out.println((int) creditPayment2);
        System.out.println((int) creditPayment3);
    }
}
