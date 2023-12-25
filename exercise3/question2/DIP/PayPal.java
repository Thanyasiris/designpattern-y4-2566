public class PayPal implements IPaymentMethod {

	@Override
	public void pay() {
		System.out.println("Paying with PayPal...");
	}
}
