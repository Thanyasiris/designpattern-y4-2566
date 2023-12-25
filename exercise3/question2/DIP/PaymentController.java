public class PaymentController {

	private IPaymentMethod paymentMethod;

	public void setPaymentMethod(IPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void pay() {
		this.paymentMethod.pay();
	}
}
