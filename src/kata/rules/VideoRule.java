package kata.rules;

import kata.IOrderProcessingService;
import kata.IPaymentRule;
import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;

public class VideoRule implements IPaymentRule {

	@Override
	public String processPayment(Product product, IOrderProcessingService service) {
		service = new OrderProcessingService();
		if (product.getType() == ProductType.Video && product.getTitle().equalsIgnoreCase("Learning to Ski")) {
			return service.addFreeVideo();
		}
		return "";
	}

}
