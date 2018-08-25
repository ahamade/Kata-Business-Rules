package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kata.OrderProcessingService;
import kata.Product;
import kata.ProductType;
import kata.rules.UpdateMembershipRule;

class UpdateMembershipRuleTest {

	@Test
	void testProcessPayment() {
		UpdateMembershipRule rule = new UpdateMembershipRule();
		Product product = new Product(ProductType.UpdateMembership);
		String instuction = rule.processPayment(product, new OrderProcessingService());
		Assert.assertEquals("Could not update membership. ", "update membership", instuction);
	}

}
