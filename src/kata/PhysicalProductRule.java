package kata;

public class PhysicalProductRule implements IPaymentRule {

	@Override
	public String processPayment(Product product, IOrderProcessingService service) {
		service = new OrderProcessingService();
		if (product.getType() == ProductType.PhysicalProduct) {
			return service.ProcessOrder("Generate a packing slip for shipping");
		}
		return "";
	}

}
