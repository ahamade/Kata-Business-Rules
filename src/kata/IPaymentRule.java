package kata;

public interface IPaymentRule {

	public String processPayment(Product product, IOrderProcessingService service);

}
