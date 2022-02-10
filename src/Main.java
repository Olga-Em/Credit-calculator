public class Main {

    public static void main(String[] args) {
	CreditPaymentService service = new CreditPaymentService();
    int amount = 1_000_000;

    int creditTerm = 1;
        int creditTerm2 = 2;
            int creditTerm3 = 3;

    int creditPayment = service.calculate (creditTerm, amount);
        int creditPayment2 = service.calculate(creditTerm2, amount);
            int creditPayment3 = service.calculate(creditTerm3, amount);

        System.out.println(creditPayment);
        System.out.println(creditPayment2);
        System.out.println(creditPayment3);
    }
}
