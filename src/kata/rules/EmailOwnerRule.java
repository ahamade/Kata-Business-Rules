package kata.rules;

import kata.IOrderProcessingService;
import kata.IPaymentRule;
import kata.Product;

public class EmailOwnerRule implements IPaymentRule {

	@Override
	public String processPayment(Product product, IOrderProcessingService service) {
		// TODO Auto-generated method stub
		return null;
	}

}