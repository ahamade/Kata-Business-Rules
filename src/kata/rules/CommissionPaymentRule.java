package kata.rules;

import kata.IOrderProcessingService;
import kata.IPaymentRule;
import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;

public class CommissionPaymentRule implements IPaymentRule {

	@Override
	public String processPayment(Product product, IOrderProcessingService service) {
		service = new OrderProcessingService();
		if (product.getType() == ProductType.PhysicalProduct || product.getType() == ProductType.Book) {
			return service.ProcessOrder("generate a commission payment");
		}
		return "";
	}

}
