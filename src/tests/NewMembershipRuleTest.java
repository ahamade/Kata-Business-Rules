package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;
import kata.rules.NewMembershipRule;

class NewMembershipRuleTest {

	@Test
	void testProcessPayment() {
		NewMembershipRule rule = new NewMembershipRule();
		Product product = new Product(ProductType.NewMembership);
		String instuction = rule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("Could not activate membership. ", "Activate membership", instuction);
	}

}
