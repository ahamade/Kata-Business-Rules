package kata;

import java.util.ArrayList;

import kata.rules.BookRule;
import kata.rules.CommissionPaymentRule;
import kata.rules.EmailOwnerRule;
import kata.rules.NewMembershipRule;
import kata.rules.PhysicalProductRule;
import kata.rules.UpdateMembershipRule;
import kata.rules.VideoRule;

public class PaymentProcessing {

	private IOrderProcessingService orderProcessingService;
	private ArrayList<IPaymentRule> rules;

	public PaymentProcessing(IOrderProcessingService orderProcessingService) {
		this.orderProcessingService = orderProcessingService;
		this.rules = new ArrayList<IPaymentRule>();
		this.rules.add(new PhysicalProductRule());
		this.rules.add(new BookRule());
		this.rules.add(new NewMembershipRule());
		this.rules.add(new UpdateMembershipRule());
		this.rules.add(new EmailOwnerRule());
		this.rules.add(new VideoRule());
		this.rules.add(new CommissionPaymentRule());
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
