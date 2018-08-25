package kata;

import java.util.ArrayList;

import kata.rules.PhysicalProductRule;

public class PaymentProcessing {

	private ArrayList<IPaymentRule> rules;
	private IOrderProcessingService orderProcessingService;

	public PaymentProcessing(IOrderProcessingService orderProcessingService) {
		this.rules = new ArrayList<IPaymentRule>();
		this.rules.add(new PhysicalProductRule());
		this.orderProcessingService = orderProcessingService;
	}

	public ArrayList<String> processPayment(Product product) {
		ArrayList<String> shippingInstrunctions = new ArrayList<String>();

		for (IPaymentRule rule : rules) {
			String instruction = rule.processPayment(product, this.orderProcessingService);
			if (!instruction.equals("")) {
				shippingInstrunctions.add(instruction);
			}
		}

		return shippingInstrunctions;
	}

}
