package kata.rules;

import kata.IOrderProcessingService;
import kata.IPaymentRule;
import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;

public class NewMembershipRule implements IPaymentRule {

	@Override
	public String processPayment(Product product, IOrderProcessingService service) {
		service = new OrderProcessingService();
		if (product.getType() == ProductType.NewMembership) {
			return service.ProcessOrder("activate membership");
		}
		return "";
	}

}
